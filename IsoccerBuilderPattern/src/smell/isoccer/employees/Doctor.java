package smell.isoccer.employees;

public class Doctor extends Employee {

    private String crm;

    public Doctor(String name, String email, String cpf, String phone, String crm, double salary) {
        super(name, email, cpf, phone, salary);
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
