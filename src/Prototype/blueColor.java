package Prototype;

public class blueColor extends Color{
    public blueColor(){
        this.colorName = "blue";
    }

    @Override
    void addColor() {
        System.out.println("adding blue color");
    }
}
