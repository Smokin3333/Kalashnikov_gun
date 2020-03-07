public class Kama extends Bike implements Itransport {
    public String model = "3";
    public String style = "Classic";
    public int price = 5000;
    public int maxSpeed = 32;
    public String color = "Red";
    public String transport = "Bike";
    public void modelBike (){ System.out.println( "Kama model" + " - " + model); }
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