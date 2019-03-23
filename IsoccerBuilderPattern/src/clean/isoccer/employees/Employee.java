package clean.isoccer.employees;

public abstract class Employee{

    private String name;
    private String email;
    private String cpf;
    private String phone;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "E-mail: " + this.email + "\n" +
               "CPF: " + this.cpf + "\n" +
               "Phone Number: " + this.phone + "\n" +
               "Salary: " + this.salary;
    }
}
