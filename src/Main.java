import Decorator.BasicProgram;
import Decorator.CardioProgram;
import Decorator.Program;
import Decorator.StrengthProgram;
import Observer.Trainee;
import Observer.TrainingType;
import Singleton.Gym;
import Strategy.CardioStrategy;
import Strategy.StrengthStrategy;
import Strategy.Trainer;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Gym gym=Gym.getInstance();

        //Observer.Observer
        Trainee trainee1=new Trainee("Mariq");
        Trainee trainee2=new Trainee("Monika");
        Trainee trainee3=new Trainee("Cveti");


        TrainingType trainingType=new TrainingType();
        trainingType.addObserver(trainee1);
        trainingType.addObserver(trainee2);
        trainingType.addObserver(trainee3);

        trainingType.changeRegimen("New Program");

        System.out.println("-----------------------------");

        //Decorator
        Program program=new BasicProgram();
        Program cardioProgram=new CardioProgram(program);
        Program fullProgram=new StrengthProgram(cardioProgram);

        System.out.println("-----------------------------");

        //Strategy
        Trainer trainer=new Trainer();
        trainer.train(new CardioStrategy());
        trainer.train(new StrengthStrategy());
    }
}
