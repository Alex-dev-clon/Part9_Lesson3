package Task2;

public class Supervisor extends Employee {

    public Supervisor(String name, int salary) {
        this.setName(name);
        this.setSalary(salary);
    }

    static void raiseTheSalary(int size, Employee employee){
        if (employee.getClass().getSimpleName().equals("Supervisor")){
            System.out.println("You can't raise the manager's salary");
        }
        else employee.setSalary(employee.getSalary() + size);
    }
}
