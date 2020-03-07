public class Honda extends Car implements Itransport {
    public String model = "CRV";
    public String driveUnit = "Full";
    public int price = 2300000;
    public int maxSpeed = 232;
    public String color = "Silver";
    public String transport = "Car";
    private Honda.State state = new Honda.State("New");

    public class State {
        private String state;
        private State (String state) {
            this.state = state;
        }
    }

    public void modelCar (){
        System.out.println("Honda Model" + " - " + model);
    }
    @Override
    public void driveUnit() {
        System.out.println("Drive unit" + " - " + driveUnit);
    }
    @Override
    public void kindOfTranspert() { System.out.println("Kind of transport" + " - " + transport); }

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
