public class MountainBike extends Bike {

    private int amountAmortizator;

    public MountainBike(int startGear, int startSpeed, int amountAmortizator) {
        super(startGear, startSpeed);
        this.amountAmortizator = amountAmortizator;
    }

        public void setAmountAmortizator(int amountAmortizator ) {
            this.amountAmortizator = amountAmortizator;
        }

    @Override
    public String toString() {
        return super.toString() + ", Number of Amortizators - " + this.amountAmortizator;
    }
}



