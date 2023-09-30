package Flyweight;

import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[]args){
        for(int i = 0; i<10; i++){
            Player p = PlayerStore.getPlayer(getRandPlayerType()); //getPlayer is a static method, we can call it using class name
            p.assignWeapon(getRandWeapon());
            p.mission();
        }
    }
    public static String getRandPlayerType(){
        Random r = new Random();
        int randInt = r.nextInt(playerType.length); //gives random number between [0,2)
        return playerType[randInt];
    }
    public static String getRandWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }
}
