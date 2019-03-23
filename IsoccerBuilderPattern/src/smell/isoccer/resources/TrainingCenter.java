package smell.isoccer.resources;

public class TrainingCenter {

    private String name;
    private int bedrooms;
    private boolean available;

    public TrainingCenter(String name, int bedrooms, boolean available) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "Bedrooms: " + this.bedrooms + "\n" +
               "Is available? " + this.available;
    }
}
