package exercici1nivell2;

import java.util.Scanner;

public class Main implements Callback{

    public int selected;
    public Scanner in = new Scanner(System.in);

    public void display_menu() {
        System.out.println("\n" +
                "\n" +
                "  ______                     _                _____                   _      _        \n" +
                " |___  /                    | |              |_   _|                 | |    | |       \n" +
                "    / /  __ _  _ __    __ _ | |_  ___   ___    | |   _ __ ___    ___ | |  __| |  __ _ \n" +
                "   / /  / _` || '_ \\  / _` || __|/ _ \\ / __|   | |  | '_ ` _ \\  / _ \\| | / _` | / _` |\n" +
                "  / /__| (_| || |_) || (_| || |_| (_) |\\__ \\  _| |_ | | | | | ||  __/| || (_| || (_| |\n" +
                " /_____|\\__,_|| .__/  \\__,_| \\__|\\___/ |___/ |_____||_| |_| |_| \\___||_| \\__,_| \\__,_|\n" +
                "              | |                                                                     \n" +
                "              |_|                                                                     \n");
        System.out.println("4 -> FINALIZAR COMPRA");
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL COMPRA DE CALZADO:   \u001B[34m2.430,00\u001B[0m Euros");
        System.out.println("-----------------------------------------");
        System.out.println("1) Tarjeta de crédito\n2) PayPal \n3) Cargo a C.C. banco \n4) Cancelar");
        System.out.print("Seleccione el método de pago: ");
    }

    public void start() {

        do {

            display_menu();
            selected = in.nextInt();
            switch (selected) {
                case 1:
                    CreditCardPay creditCardPay = new CreditCardPay(this);
                    break;
                case 2:
                    PaypalPay paypalPay = new PaypalPay(this);
                    break;
                case 3:
                    BankAccountPay bankAccountPay = new BankAccountPay(this);
                    break;
                case 4:
                    System.out.println("\nNo se efectuado ningún pago.");
                    break;
                default:
                    System.err.println("\nNo sé que has pulsado pero no hace nada...");
                    break;
            }
        } while (selected < 3);
    }


    @Override
    public void paymentSuccessful(String message) {

        System.out.println("\nPago efectuado con " + message + ", gracias.");
        System.out.println("Esperamos que seas muy feliz con tu compra.");
        start();
    }

    public static void main(String[] args) {

        new Main().start();

    }

}
