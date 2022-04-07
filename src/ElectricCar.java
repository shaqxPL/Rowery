public class ElectricCar extends Car {

    private int batteryCondition;

    public ElectricCar(String brand, String color, int speed, int batteryCondition) {
        super(brand, color, speed);
        this.batteryCondition = batteryCondition;
    }

    public void setBatteryCondition(int batteryCondition) {
        this.batteryCondition = batteryCondition;
    }

    public void bLost(int decrement) {
        this.batteryCondition = batteryCondition - decrement;
    }


    @Override
    public String toString() {
        return super.toString() + " and his battery Condition is - " + batteryCondition + " m/ah";
    }
}
