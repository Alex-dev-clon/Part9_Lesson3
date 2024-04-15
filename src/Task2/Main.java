package Task2;


//Опишите класс руководителя, наследник от сотрудника.
//Перенесите статический метод повышения зарплаты в класс руководителя,
//модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
//кроме руководителей. В основной программе создайте руководителя и поместите его
//в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
//чтобы зарплата руководителя не повысилась.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {new Supervisor("Boss", 5000), new Worker("Worker1", 2000),
                                new Worker("Worker2", 2000), new Worker("Worker3", 2000)};
        for (Employee employee : employees){
            Supervisor.raiseTheSalary(500, employee);
        }
        for (Employee employee : employees){
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}