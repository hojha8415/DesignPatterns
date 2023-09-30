package BuilderPattern;

public class BuilderDemo {
    public static void main(String[]args){
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType1 = cdBuilder.buildSony();
        cdType1.showItem();
        CDType cdType2 = cdBuilder.buildSamsung();
        cdType2.showItem();
    }
}
