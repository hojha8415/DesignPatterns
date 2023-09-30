package Facade;

public class NonVegRestro implements Hotel{
    @Override
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}
