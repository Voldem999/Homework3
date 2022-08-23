public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 3!");
        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 1) {System.out.println("Установите версию приложения для Android по ссылке");}

        // Задача 2
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1 && clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        // Задача 3

        // Задача 4
        int deliveryDistance = 51;
        if (deliveryDistance <= 20) {System.out.println("С учетом Вашего расстояния потребуется 1 день на доставку");}
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {System.out.println("С учетом Вашего расстояния потребуется 2 дня на доставку");}
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {System.out.println("С учетом Вашего расстояния потребуется 3 дня на доставку");}
        else {System.out.println("Доставки нет");}

        // Задача 5

        int month = 12;
            if (month / 3 == 1)
                System.out.println("весна");
            else if (month / 3 == 2)
                System.out.println("лето");
            else if (month / 3 == 3)
                System.out.println("осень");
            else
                System.out.println("зима");







    }}



