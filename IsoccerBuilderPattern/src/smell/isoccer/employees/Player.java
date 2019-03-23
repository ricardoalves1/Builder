package smell.isoccer.employees;

public class Player extends Employee {

    private String role;
    private boolean capable;

    public Player(String name, String email, String cpf, String phone, String role, boolean capable, double salary) {
        super(name, email, cpf, phone, salary);
        this.role = role;
        this.capable = capable;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isCapable() {
        return capable;
    }

    public void setCapable(boolean capable) {
        this.capable = capable;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Role: " + this.role + "\n" +
                "Capable: " + this.capable;
    }
}
