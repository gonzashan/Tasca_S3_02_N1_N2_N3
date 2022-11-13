package exercici1nivell1;

public class Agent {

    private String name;
    private int idAgent;

    public Agent(String name, int idAgent){
        this.name = name;
        this.idAgent = idAgent;
    }

    public void notifyAction(String message){
        System.out.println (this.name + " tus acciones pecadoras han " + message);
    }

    @Override
    public String toString() {
        return "Agent: " + name +
                " id: " + idAgent ;
    }
}
