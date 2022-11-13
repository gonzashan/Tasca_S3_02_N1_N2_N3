package exercici1nivell1;

import java.util.ArrayList;

public class AgentBorsa {


    private ArrayList<Agent> agents = new ArrayList<Agent>();


    public void subscribe(Agent agent){

        this.agents.add(agent);
    }

    public void updateNotifications(String message) {

        agents.forEach(x -> x.notifyAction(message));
    }


    @Override
    public String toString() {
        return "Associates:\n" + agents;
    }
}
