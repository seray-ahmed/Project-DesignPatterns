package Decorator;

public class BasicProgram extends Program {

    public BasicProgram() {
        System.out.println(this.getDescription());
    }

    @Override
    public String getDescription() {
        return "Basic Program";
    }
}
