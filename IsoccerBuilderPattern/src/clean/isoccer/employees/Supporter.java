package clean.isoccer.employees;

public class Supporter extends Employee {

    private String address;
    private String type;
    private boolean compliance;

    public Supporter(String address, String type, boolean compliance) {
        this.address = address;
        this.type = type;
        this.compliance = compliance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCompliance() {
        return compliance;
    }

    public void setCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Address: " + this.address + "\n" +
                "Type: " + this.type + "\n" +
                "Defaulter: " + this.compliance;
    }
}
