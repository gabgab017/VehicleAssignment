public class cycle extends vehicle {

    public cycle(String model, int make, int numberOfWheels, int topSpeed) {
        super(model, make, numberOfWheels, topSpeed);
    }

    public void getCycleInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number of wheels: " + this.getNumberOfWheels() + "\n");
    }
}