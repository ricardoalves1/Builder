package clean.isoccer.employees;

public class SupporterBuilder implements EmployeeBuilder {

    private Employee employee;

    public SupporterBuilder(String address, boolean compliance, String type) {
        this.employee = new Supporter(address, type, compliance);
    }

    public static EmployeeBuilder builder(String address, boolean compliance, String type) {
        return new SupporterBuilder(address, compliance, type);
    }

    @Override
    public EmployeeBuilder name(String name) {
        this.employee.setName(name);
        return this;
    }

    @Override
    public EmployeeBuilder email(String email) {
        this.employee.setEmail(email);
        return this;
    }

    @Override
    public EmployeeBuilder cpf(String cpf) {
        this.employee.setCpf(cpf);
        return this;
    }

    @Override
    public EmployeeBuilder phone(String phone) {
        this.employee.setPhone(phone);
        return this;
    }

    @Override
    public EmployeeBuilder salary(double salary) {
        this.employee.setSalary(salary);
        return this;
    }

    @Override
    public Employee get() {
        return this.employee;
    }

}
