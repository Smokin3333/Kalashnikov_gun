public class Nissan extends Car implements Itransport {
    public String model = "Almera";
    public String driveUnit = "Front";
    public int price = 700000;
    public int maxSpeed = 212;
    public String color = "White";
    public String transport = "Car";
    private Nissan.State state = new Nissan.State("New");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }

    public void modelCar (){
        System.out.println("Nissan Model" + " - " + model);
    }
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
    public void color() { System.out.println("Color" + " - " + color); }
}
