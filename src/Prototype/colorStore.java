package Prototype;

import java.util.HashMap;

public class colorStore {
    private static HashMap<String, Color> colorMap = new HashMap<>();
    static{
        colorMap.put("black",new blackColor());
        colorMap.put("blue",new blueColor());
    }
    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
}
