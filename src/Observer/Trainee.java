package Observer;

public class Trainee implements Observer {
    private String name;

    public Trainee(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" received update: "+message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
