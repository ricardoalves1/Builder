package clean.isoccer.employees;

public interface EmployeeBuilder {

    EmployeeBuilder name(String name);
    EmployeeBuilder email(String email);
    EmployeeBuilder cpf(String cpf);
    EmployeeBuilder phone(String phone);
    EmployeeBuilder salary(double salary);

    Employee get();

}
