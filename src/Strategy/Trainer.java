package Strategy;

public class Trainer {
    private BaseStrategy baseStrategy;
    public void train(BaseStrategy strategy){
        strategy.train();
    }
}
