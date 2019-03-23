package clean.isoccer.employees;

public class Doctor extends Employee {

    private String crm;

    public Doctor(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "CRM: " + this.crm;
    }
}
