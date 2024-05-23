package Decorator;

public class ProgramDecorator extends Program{

    protected Program program;

    public ProgramDecorator(Program program) {
        this.program = program;
    }

    @Override
    public String getDescription() {
        return program.getDescription();
    }
}
