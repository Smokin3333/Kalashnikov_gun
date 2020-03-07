public class Yamaha extends Motorcycle implements Itransport {
    public String model = "1200";
    public String style = "Sport";
    public int price = 550000;
    public int maxSpeed = 388;
    public String color = "Red";
    public String transport = "Motorcycle";

    private Yamaha.State state = new Yamaha.State("New");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }
    public void modelMotorcycle (){ System.out.println( "Yamaha model" + " - " + model); }
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
