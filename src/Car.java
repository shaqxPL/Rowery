public class Car {

protected String brand = "Brand";
protected String color = "Color";
public int speed = 0;

public Car() {
}

public Car(String brand, String color, int speed) {
    this.brand = brand;
    this.color = color;
    this.speed = speed;
}

public int getSpeed() {
    return speed;
}

public void setSpeed(int speed){
    this.speed = speed;
}

public void speedUp(int increment){
    this.speed += increment;
}

@Override
    public String toString(){
    return "Car: speed - " + this.speed;
}
}
