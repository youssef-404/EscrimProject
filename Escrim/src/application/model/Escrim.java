package application.model;

public class Escrim {
    private static Escrim instance;
    private boolean State;


    private Escrim(){

    }

    public static Escrim getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new Escrim();
        }
        return instance;
    }

}
