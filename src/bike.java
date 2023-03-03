public class bike extends vehicle {
    private int engine;

    public bike(String model, int make, int numberOfWheels, int topSpeed, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void Break() {
        System.out.println("You pulled the brake. The bike will now stop.\n");
    }

    public void accelerate() {
        System.out.println("You started pedalling.\n\n");
    }

    public void getBikeInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
        System.out.println("Top speed: " + this.getTopSpeed());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }
}