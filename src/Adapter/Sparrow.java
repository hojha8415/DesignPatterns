package Adapter;

public class Sparrow implements Bird{
    public void fly(){
        System.out.println("Flying!");
    }

    @Override
    public void makeSound() {
        System.out.println("chirp chirp!");
    }
}
