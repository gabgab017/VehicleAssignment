public class car extends vehicle {
    private boolean AC, handbrake, hatchback, sedan;
    private String sound;
    private int engine;

    public car(String model, int make, int numberOfWheels, int topSpeed, boolean AC, boolean handbrake,
            boolean hatchback, boolean sedan, String sound, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handbrake = handbrake;
        this.hatchback = hatchback;
        this.sedan = sedan;
        this.sound = sound;
        this.engine = engine;
    }

    public boolean getAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean getHandbrake() {
        return handbrake;
    }

    public void setHandbrake(boolean handbrake) {
        this.handbrake = handbrake;
    }

    public boolean getHatchback() {
        return hatchback;
    }

    public void setHatchback(boolean hatchback) {
        this.hatchback = hatchback;
    }

    public boolean getSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }


    public void Break() {
        System.out.println("You stepped on the brake. The car has stopped.\n");
    }

    public void Handbrake() {
        if(this.handbrake = true) {
            System.out.println("You pulled the handbrake. The car has stopped.\n");
        }
        else {
            System.out.println("You did not pull the handbrake. The car is still moving.\n");
        }
    }
    
    public void Accelerate() {
        System.out.println("You stepped on the acceleration. The car is speeding up.\n");
    }


    public void getCarInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
        System.out.println("Top speed: " + this.getTopSpeed());
        System.out.println("A/C: " + this.getAC());
        System.out.println("Hatchback: " + this.getHatchback());
        System.out.println("Sedan: " + this.getSedan());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }

}