public class Ural extends Bike implements Itransport {
    public String model = "RZ-1000";
    public String style = "Sport";
    public int price = 15000;
    public int maxSpeed = 40;
    public String color = "Blue";
    public String transport = "Bike";
    public void modelBike (){ System.out.println( "Ural model" + " - " + model); }
    @Override
    public void kindOfTranspert() { System.out.println("Transport" + " - " + transport);}
    @Override
    public void price() { System.out.println("Price" + " - " + price+ " RUB");}
    @Override
    public void maxSpeed() { System.out.println("Maximum speed" + " - " + maxSpeed + " km/h");}
    @Override
    public void color() { System.out.println("Color" + " - " + color);}
    @Override
    public void style() { System.out.println("Style" + " - " + style);}
}
