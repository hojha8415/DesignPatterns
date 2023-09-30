package Facade;

public class Both implements Hotel{
    @Override
    public Menus getMenus() {
        VegNonVeg v = new VegNonVeg();
        return v;
    }
}
