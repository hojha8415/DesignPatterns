package Decorator;

public class Mushrooms extends ToppingDecorator{
    BasePizza basePizza;
    public Mushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
