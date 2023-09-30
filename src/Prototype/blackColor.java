package Prototype;

public class blackColor extends Color{
    public blackColor(){
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("adding black color");
    }
}
