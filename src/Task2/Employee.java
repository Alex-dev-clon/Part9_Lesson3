package Task2;

public class Employee {
    private String name;
    private int salary;

    static void raiseTheSalary(int size, Employee employee){
        employee.salary = employee.salary + size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
