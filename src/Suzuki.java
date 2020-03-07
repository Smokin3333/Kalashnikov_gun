public class Suzuki extends Motorcycle implements Itransport {
    public String model = "RZP";
    public String style = "Sport";
    public int price = 350000;
    public int maxSpeed = 412;
    public String color = "Blue";
    public String transport = "Motorcycle";

    private Suzuki.State state = new Suzuki.State("With mileage");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }
    public void modelMotorcycle (){ System.out.println( "Suzuki model" + " - " + model); }
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