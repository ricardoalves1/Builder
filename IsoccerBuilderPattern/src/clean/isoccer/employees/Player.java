package clean.isoccer.employees;

public class Player extends Employee {

    private String role;
    private boolean capable;

    public Player(String role, boolean capable) {
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
