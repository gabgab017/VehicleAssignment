public class App {
    public static void main(String[] args) throws Exception {

        truck truck1 = new truck("Mack", 2012, 18, 160, true, true, "VROM VROOOOMMMMM", 16000);
        
        truck truck2 = new truck("Volvo", 2016, 16, 200, true, false, "VROM VROOOOMMMMM", 13000);
        
        car car1 = new car("Ferrari", 2023, 4, 298, true, false, false, true, "VVVVRRRRROOOOOOOOMMMM", 7000);

        car car2 = new car("Toyota", 2005, 4, 164, false, true, true, false, "Vroom", 1500);

        bike bike = new bike("Giant", 2020, 2, 30, 200);

        cycle cycle = new cycle("Fox", 2017, 2, 15);


        truck1.getTruckInfo();
        truck1.openContainer();
        truck1.Accelerate();
        truck1.HandBrake();

        truck2.getTruckInfo();
        truck2.openContainer();
        truck2.Accelerate();
        truck2.HandBrake();

        car1.getCarInfo();
        car1.Accelerate();
        car1.Break();
        car1.Handbrake();

        car2.getCarInfo();
        car2.Accelerate();
        car2.Break();
        car2.Handbrake();

        bike.getBikeInfo();
        bike.accelerate();
        bike.Break();

        cycle.getCycleInfo();


    }
}
