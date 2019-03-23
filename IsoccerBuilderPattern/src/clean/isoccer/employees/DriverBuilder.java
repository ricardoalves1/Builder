package clean.isoccer.employees;

public class DriverBuilder implements EmployeeBuilder {

    private Employee employee;

    public DriverBuilder(String license) {
        this.employee = new Driver(license);
    }

    public static EmployeeBuilder builder(String license) {
        return new DriverBuilder(license);
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
