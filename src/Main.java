import java.time.LocalDate;

public class Main {


    public static void main(String[] args ) {


        // задание 1.
        int year = 2012;
        leapYear(year);


        // задание 2.

        int clientAndroid = 0;
        int clientOs = 1;
        printFoAboutDevise(clientAndroid, clientOs);

        // задание 3.
        int deliveryDistance = 15;
        int day = calculateDaysDistance(deliveryDistance);
        System.out.println(" Потребуется дней: " + day);
    }

    private static int calculateDaysDistance(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            int day = 1;
            return day;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int day = 2;
            return day;
          } else {
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                int day = 3;
                return day;
            }
        }
        return deliveryDistance;
    }
    private static void printFoAboutDevise( int clientAndroid, int clientOs) {

        int currentYear = LocalDate.now().getYear();
        int client = 1;
        if (client == 1);{

            if (currentYear >= 2015) {
                System.out.println(" Установите обычную версию приложения для iOS по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            }

        }
        if (client == 0) {

            if (currentYear >= 2015) {
                System.out.println(" Установите обычную версию приложения для Android по ссылке ");
            } else {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            }
        }
    }

    private static void leapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " Год високосный ");
        }else {
            System.out.println(year + " Год не високосный ");
        }
    }
}