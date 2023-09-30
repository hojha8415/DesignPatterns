package Prototype;

public class Main {
    public static void main(String[]args){
        colorStore.getColor("blue").addColor();
        colorStore.getColor("black").addColor();
        colorStore.getColor("blue").addColor();
        colorStore.getColor("black").addColor();
    }
}
