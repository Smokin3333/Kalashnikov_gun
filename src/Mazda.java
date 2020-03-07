public class Mazda extends Car implements Itransport {
    public String model = "3";
    public String driveUnit = "Front";
    public int price = 1550000;
    public int maxSpeed = 177;
    public String color = "Black";
    public String transport = "Car";
    private Mazda.State state = new Mazda.State("After the crash");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }

    public void modelCar (){ System.out.println("Mazda Model" + " - " + model); }
    @Override
    public void driveUnit() {
        System.out.println("Drive unit" + " - " + driveUnit);
    }

    @Override
    public void kindOfTranspert() { System.out.println("Kind of transport" + " - " + transport);}

    @Override
    public void price() {
        System.out.println("Price" + " - " + price + " RUB");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Maximum speed" + " - " + maxSpeed + " km/h");
    }

    @Override
    public void color() {
        System.out.println("Color" + " - " + color);
    }
}
