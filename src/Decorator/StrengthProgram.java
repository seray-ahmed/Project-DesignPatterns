package Decorator;

public class StrengthProgram extends ProgramDecorator{

    public StrengthProgram(Program program) {
        super(program);
        System.out.println(this.getDescription());
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" with strength program";
    }
}
