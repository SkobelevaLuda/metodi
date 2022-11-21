public class Main {


    public static void main(String[] args ) {
        // задание 1.
        int year = 2012;
        leapYear(year);
    }

    private static void leapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " Год високосный ");
        }else {
            System.out.println(year + " Год не високосный ");
        }


    }
    // задание 2.



}