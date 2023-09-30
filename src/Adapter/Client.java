package Adapter;

public class Client {
    public static void main(String[]args){
        Sparrow sp = new Sparrow();
        ToyDuck td = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sp);
        System.out.println("Sparrow..");
        sp.fly(); sp.makeSound();
        System.out.println("ToyDuck...");
        td.squeak();
        // toy duck behaving like a bird
        System.out.println("BirdAdapter...");
        birdAdapter.squeak();

    }
}
