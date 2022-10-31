import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void checkYear(int year){
        if (year % 4 != 0){
            System.out.println(year + " - не високосный год");
        } else if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - не високосный год");
            }

        } else {
            System.out.println(year + " - високосный год");
        }
    }

    public static void checkVersionAndOS (int versionOS, int yearVersion){
        int currentYear = LocalDate.now().getYear();
        if (versionOS == 0){
            if (currentYear > yearVersion){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("У Вас установлена актуальная версия");
            }
        } else if (versionOS == 1){
            if (currentYear > yearVersion){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("У Вас установлена актуальная версия");
            }
        } else {
            System.out.println("Попробуйте обновить страницу");
        }
    }

    public static int calculateDays(int deliveryDistance, int distanceStart, int numberDays) {
        if (deliveryDistance > distanceStart){
            return calculateDays(deliveryDistance,(distanceStart + 40),(numberDays + 1));
        }
        return numberDays;
    }

    public static void main(String[] args) {
        //zadanie 1
        Scanner years = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = years.nextInt();
        checkYear(year);
        System.out.println(" ");

        //zadanie 2
        Scanner OS = new Scanner(System.in);
        System.out.print("Введите 1, если у вас Android и 0, если у вас IOS: ");
        int versionOS = OS.nextInt();
        Scanner versionYear = new Scanner(System.in);
        System.out.print("Введите, когда вы последний раз устанавливали обновление: ");
        int versionYears = versionYear.nextInt();
        checkVersionAndOS(versionOS, versionYears);
        System.out.println(" ");

        //zadanie 3
        Scanner distance = new Scanner(System.in);
        System.out.print("Введите дистанцию: ");
        int deliveryDistance = distance.nextInt();
        int distanceStart = 20;
        int numberDays = 1;
        System.out.println("Потребуется дней: " + calculateDays(deliveryDistance, distanceStart, numberDays));

    }
}