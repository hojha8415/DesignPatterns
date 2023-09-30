package StrategyPattern;

public class Context {
    Strategy strategy; //socket creation
    public Context(Strategy strategy){ //constructor injection
        this.strategy = strategy;
    }
    public float executeStrategy(float a, float b){
        return strategy.calculation(a,b);
    }
}
