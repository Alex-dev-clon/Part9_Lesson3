package Task1;

public class Employee {

    public int compare(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0,4));
        int year2 = Integer.parseInt(date2.substring(0,4));
        int month1 = Integer.parseInt(date1.substring(5,7));
        int month2 = Integer.parseInt(date2.substring(5,7));
        int day1 = Integer.parseInt(date1.substring(8,10));
        int day2 = Integer.parseInt(date2.substring(8,10));
//        System.out.println(year1 + " " +  year2);
//        System.out.println(month1 + " " +  month2);
//        System.out.println(day1 + " " +  day2);
        return year1 > year2 ? 1 : year1 < year2 ? -1 :
        month1 > month2 ? 1 : month1 < month2 ? -1 :
        day1 > day2 ? 1 : day1 < day2 ? -1 : 0;
    }
}
