package clean.isoccer.employees;

public class PresidentBuilder implements EmployeeBuilder {

    private Employee employee;

    public PresidentBuilder() {
        this.employee = new President();
    }

    public static EmployeeBuilder builder() {
        return new PresidentBuilder();
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