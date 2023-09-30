package Facade;

public class Client {
    public static void main(String[]args){
        Hotelkeeper keeper = new HotelkeeperImplementation();
        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        VegNonVeg vnv = keeper.getVegNonVeg();
    }
}
