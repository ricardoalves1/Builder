package smell.isoccer.resources;

public class Stadium {

    private String name;
    private int capacity;
    private int bathrooms;
    private int snackStations;
    private boolean available;

    public Stadium(String name, int capacity, int bathrooms, int snackStations, boolean available) {
        this.name = name;
        this.capacity = capacity;
        this.bathrooms = bathrooms;
        this.snackStations = snackStations;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getSnackStations() {
        return snackStations;
    }

    public void setSnackStations(int snackStations) {
        this.snackStations = snackStations;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "Capacity: " + this.capacity + "\n" +
               "Bathrooms: " + this.bathrooms + "\n" +
               "Snack stations: " + this.snackStations + "\n" +
               "Is available? " + this.available;
    }
}
