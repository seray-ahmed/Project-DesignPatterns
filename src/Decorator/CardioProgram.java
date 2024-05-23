package Decorator;

public class CardioProgram extends ProgramDecorator{

    public CardioProgram(Program program) {
        super(program);
        System.out.println(this.getDescription());
    }


    @Override
    public String getDescription() {
        return super.getDescription()+" with cardio";
    }
}
