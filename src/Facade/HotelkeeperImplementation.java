package Facade;

public class HotelkeeperImplementation implements Hotelkeeper{
    @Override
    public VegMenu getVegMenu() {
        VegRestro v = new VegRestro();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestro v = new NonVegRestro();
        NonVegMenu nonvegMenu = (NonVegMenu)v.getMenus();
        return nonvegMenu;
    }

    @Override
    public VegNonVeg getVegNonVeg() {
        Both v = new Both();
        VegNonVeg vegNonVeg = (VegNonVeg) v.getMenus();
        return vegNonVeg;
    }
}
