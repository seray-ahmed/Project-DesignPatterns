package Singleton;

public class Gym {
    private static Gym instance;

    private Gym(){}

    public static Gym getInstance() {
        if (instance == null) {
            instance = new Gym();
        }
        return instance;
    }
}
