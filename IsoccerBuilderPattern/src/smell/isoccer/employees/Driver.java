package smell.isoccer.employees;

public class Driver extends Employee {

    private String license;

    public Driver(String name, String email, String cpf, String phone, String license, double salary) {
        super(name, email, cpf, phone, salary);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "License: " + this.license;
    }
}
