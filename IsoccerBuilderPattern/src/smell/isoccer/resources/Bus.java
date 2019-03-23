package smell.isoccer.resources;

public class Bus {

    private int number;
    private boolean available;

    public Bus(int number, boolean available) {
        this.number = number;
        this.available = available;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Number: " + this.number + "\n" +
               "Is available? " +this.available;
    }
}
