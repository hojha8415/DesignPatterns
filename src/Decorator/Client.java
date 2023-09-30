package Decorator;

public class Client {
    public static void main(String[]args){
        BasePizza firstPizza = new Farmhouse();
        ToppingDecorator topping = new ExtraCheese(firstPizza);
        System.out.println("First Pizza - "+topping.cost());
        topping = new Mushrooms(new ExtraCheese(firstPizza));
        System.out.println("Second Pizza - "+topping.cost());

    }
}
