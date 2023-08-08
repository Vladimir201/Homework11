

public class Main {
    public static void main(String[] args) {

        leapYearSay(2011);
        leapYearSay(800);

        mobileApp(2000, 0);

        int distance = 10;
        printDeliveryDay(distance);
    }


    public static boolean isYearLeap(int year) {
        return ((year % 4 == 0 && year != 100) || year % 400 == 0);
    }

    private static void leapYearSay(int year) {
        System.out.println(" ");
        System.out.println("Exercise 1");

        if (isYearLeap(year)) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    private static void mobileApp(int year, int clientOS) {
        System.out.println(" ");
        System.out.println("Exercise 2");

        if (clientOS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void printDeliveryDay(int deliveryDistance) {
        System.out.println(" ");
        System.out.println("Exercise 3");
        int deliveryDay = deliveryDistance(deliveryDistance);

        if (deliveryDay < 0) {
            System.out.println("Доставки нет");
        } else if (deliveryDay == 1) {
            System.out.println("Доставка: " + deliveryDay + " день.");
        } else {
            System.out.println("Доставка: " + deliveryDay + " дня.");
        }
    }

    public static int deliveryDistance(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100) {
            return 3;
        } else {
            return -1;
        }
    }


}