public class ElectricCar extends Car {

    private  int batteryCondition;

    public ElectricCar(String brand, String color, int speed, int batteryCondition){
        super(brand, color, speed);
        this.batteryCondition = batteryCondition;
    }

public void setBatteryCondition(int batteryCondition){
        this.batteryCondition = batteryCondition;
}

@Override
    public String toString(){
        return super.toString() + "Battery Condition is - " + batteryCondition;
    }
}
