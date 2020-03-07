public class Forward extends Bike implements Itransport {
    public String model = "FX500";
    public String style = "Rally";
    public int price = 18000;
    public int maxSpeed = 60;
    public String color = "Black";
    public String transport = "Bike";
    public void modelBike (){ System.out.println( "Forward model" + " - " + model); }
    @Override
    public void kindOfTranspert() { System.out.println("Transport" + " - " + transport);}
    @Override
    public void price() { System.out.println("Price" + " - " + price+ " RUB");}
    @Override
    public void maxSpeed() { System.out.println("Maximum speed" + " - " + maxSpeed+ " km/h");}
    @Override
    public void color() { System.out.println("Color" + " - " + color);}
    @Override
    public void style() { System.out.println("Style" + " - " + style);}
}
