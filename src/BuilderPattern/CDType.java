package BuilderPattern;
import java.util.*;
public class CDType {
    ArrayList<Packing> items = new ArrayList<>();
    public void addItem(Packing item){
        items.add(item);
    }
    public void getCost(){
        for(Packing item : items){
            item.price();
        }
    }
    public void showItem(){
        for(Packing item : items){
            System.out.println("Price: "+item.price());
            System.out.println("Packing: "+item.pack());
        }
    }
}
