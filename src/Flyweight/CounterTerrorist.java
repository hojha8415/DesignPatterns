package Flyweight;

public class CounterTerrorist implements Player{
    //intrinsic attribute
    private final String TASK;
    //extrinsic attribute
    private String weapon;
    public CounterTerrorist(){
        TASK = "DIFFUSE THE BOMB!";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon: "+weapon+" | "+"Task is "+TASK);
    }
}
