public class Main {


    public static void main(String[] args) {

        Car Ford = new Car("Mustang", "Black", 200);
        ElectricCar Kia = new ElectricCar("Moonspace", "Silver", 180, 50000);

        System.out.println(Ford);
        System.out.println(Kia);

        Ford.speedUp(50);
        Kia.speedUp(20);

        System.out.println(Ford);
        System.out.println(Kia);
//        Bike składak = new Bike(1, 30);
//        MountainBike btwin = new MountainBike(6, 40, 2);
//
//        System.out.println(składak);
//        System.out.println(btwin + "\n");
//
//        składak.speedUp(20);
//        btwin.applyBrake(10);
//
//        System.out.println(składak);
//        System.out.println(btwin);

    }
}
