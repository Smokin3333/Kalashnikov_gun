public class Kawasaki extends Motorcycle implements Itransport {
    public String model = "TYP";
    public String style = "Sport";
    public int price = 400000;
    public int maxSpeed = 344;
    public String color = "Blue";
    public String transport = "Motorcycle";

    private Kawasaki.State state = new Kawasaki.State("New");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }
    public void modelMotorcycle (){ System.out.println( "Kawasaki model" + " - " + model); }
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