package StrategyPattern;

public class Client {
    public static void main(String[]args){
        Context context = new Context(new Addition());
        float ans = context.executeStrategy(10,20);
        System.out.println(ans);
        context = new Context(new Multiplication());
        ans = context.executeStrategy(10,20);
        System.out.println(ans);
    }
}
