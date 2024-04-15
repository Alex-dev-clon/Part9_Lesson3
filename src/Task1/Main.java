package Task1;
//Написать прототип компаратора - метод внутри класса сотрудника,
//сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
//без использования условного оператора.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        String date1 = "1995 04 23";
        String date2 = "1995 04 23";
        System.out.println(employee.compare(date1, date2));
    }
}
