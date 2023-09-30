package Prototype;

public abstract class Color implements Cloneable{ // prototype component
    protected String colorName;
    abstract void addColor();
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
