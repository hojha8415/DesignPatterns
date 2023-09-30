package Facade;

public class VegRestro implements Hotel{
    @Override
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}
