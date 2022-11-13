package exercici1nivell1;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int selected;
    public static AgentBorsa agentBorsa = new AgentBorsa();

    public static void display_menu() {

        System.out.println("1) Stock Option UP!\n2) Stock option DOWN! \n3) Exit");
        System.out.print("Selection: ");
    }

    public static void start() {

        do {
            System.out.println();
            System.out.println(agentBorsa.toString());

            display_menu();
            selected = in.nextInt();
            switch (selected) {
                case 1:
                    agentBorsa.updateNotifications("\u001B[32msubido! :)\u001B[0m");
                    start();
                    break;
                case 2:
                    agentBorsa.updateNotifications("\u001B[31mbajado! :( \u001B[0m");
                    start();
                    break;
                case 3:
                    System.out.println("\u001B[33m *Invertir puede conllevar pérdidas...\u001B[0m");
                    break;
                default:
                    System.err.println("No sé que has pulsado pero no hace nada...");
                    break;
            }

        } while (selected < 3);
    }


    public static void main(String[] args) {

        Agent agent1 = new Agent("TheManolos",  1);
        Agent agent2 = new Agent("Bar & Cenas", 2);

        agentBorsa.subscribe(agent1);
        agentBorsa.subscribe(agent2);

        System.out.println("POXOLO - Broker, Inc.");
        start();

    }
}
