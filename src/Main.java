public class Main {
    public static void main(String[] args) {
        //Задание 1.
        int client1 = 1;
        if (client1 == 0) {
            System.out.println("установите версию приложения для IOS по ссылке ");
        } else {
            System.out.println("установите версию приложения для Android по ссылке ");
        }
        //Задание 2.
        int clientDeviceYear = 2015;
        int clientOs2 = 0;
        if (clientOs2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("установите облегчённую версию для IOS по ссылке");
            } else {
                System.out.println("установите версию для IOS по ссылке ");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("установите облегчённую версию для Android по ссылке");
            } else {
                System.out.println("установите версию для IOS по ссылке ");
            }
        }
        //Задание 3.
        int yearV = 2021;
        if (yearV % 4 == 0 && yearV % 100 != 0 || yearV % 400 == 0) {
            System.out.println(yearV + "является високосным ");
        } else {
            System.out.println(yearV + "не является високосным ");
        }
        //Задание 4.
        int deliveryDistance =95;
        int deliveryDays=1;
        if (deliveryDistance >20) {

        } else deliveryDays++;
        {
         if (deliveryDistance>60){
             deliveryDays++;
         }
           System.out.println ("потребуется дней " + deliveryDays);

        }
        //Задание 5.

        int monthNumber =12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето ");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень ");
                break;
            default:
                System.out.println("Некорректный месяц " + monthNumber);

        }
    }
}