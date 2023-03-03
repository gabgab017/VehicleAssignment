public class truck extends vehicle {
    private boolean AC, container;
    private String sound;
    private int engine;

    public truck(String model, int make, int numberOfWheels, int topSpeed, boolean AC, boolean container, String sound, int engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.container = container;
        this.sound = sound;
        this.engine = engine;
    }

    public boolean getAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean getContainer() {
        return container;
    }

    public void setContainer(boolean container) {
        this.container = container;
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


    public void openContainer() {
        if(this.container == true) {
            System.out.println("You have opened your truck container!\n");
        }
        else {
            System.out.println("You don't have a container attached to your truck!\n");
        }
    }

    public void HandBrake() {
        System.out.println("You pulled the handbrake. The truck has stopped.\n");
    }
    
    public void Accelerate() {
        System.out.println("You stepped on the acceleration. The car is speeding up.\n");
    }

    public void getTruckInfo() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Make: " + this.getMake());
        System.out.println("Number of wheels: " + this.getNumberOfWheels());
        System.out.println("Top speed: " + this.getTopSpeed());
        System.out.println("A/C: " + this.getAC());
        System.out.println("Container: " + this.getContainer());
        System.out.println("Sound: " + this.getSound());
        System.out.println("Engine: " + this.getEngine() + "\n");
    }
}