public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 3!");

        // Задача 1

        int clientOS = 0;
        if (clientOS == 0)
        {System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 1)
        {System.out.println("Установите версию приложения для Android по ссылке");}

        // Задача 2

        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1 && clientDeviceYear < 2015)
        {System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        // Задача 3

        int year = 2020;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {System.out.println("Год "+ year +" високосный");}
        else {System.out.println("Год " + year + " не високсный");}


        // Задача 4

        int deliveryDistance = 51;
        if (deliveryDistance <= 20)
        {System.out.println("С учетом Вашего расстояния потребуется 1 день на доставку");}
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
        {System.out.println("С учетом Вашего расстояния потребуется 2 дня на доставку");}
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
        {System.out.println("С учетом Вашего расстояния потребуется 3 дня на доставку");}
        else {System.out.println("Доставки нет");}

        // Задача 5

        int month = 5;
        if (month == 12 || month <= 2)
        {System.out.println("Зима");}
        else if (month > 2 && month < 6)
        {System.out.println("Весна");}
        else if (month > 5 && month < 9)
        {System.out.println("Лето");}
        else if (month > 8 && month < 12)
        {System.out.println("Осень");}
        else {System.out.println("Такого месяца нет");}


    }}



