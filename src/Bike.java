public class Bike {

    private int gear;
    private int speed;

    public Bike(int startGear, int startSpeed) {
        this.gear = startGear;
        this.speed = startSpeed;
    }


    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        this.speed = speed - decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
//        this.speed = speed + increment;     skrocony zapis tego jest w linii 33.
    }

    @Override
    public String toString() {
        return "Bike: gear - " + this.gear + ", speed - " + this.speed;
    }
}
