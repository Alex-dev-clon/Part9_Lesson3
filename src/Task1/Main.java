package Task1;
//Написать прототип компаратора - метод внутри класса сотрудника,
//сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
//без использования условного оператора.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        String date1 = "1995 04 23";
        String date2 = "1995 04 23";

        String date3 = "1991 08 02";
        String date4 = "1995 04 23";

        String date5 = "1998 04 23";
        String date6 = "1995 04 23";
        System.out.println(employee.compare(date1, date2));
        System.out.println(employee.compare(date3, date4));
        System.out.println(employee.compare(date5, date6));
    }
}
