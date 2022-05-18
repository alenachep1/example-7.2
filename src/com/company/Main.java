package com.company;

import java.time.LocalDate;

public class Main {

    public static boolean isYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void checkClientOSAndDeviceYear(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");
        }
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        }
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке: ");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        }
    }

    public static void main(String[] args) {
        //задача 1
        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();

        checkClientOSAndDeviceYear(clientOS, currentYear);
        //задача2
        System.out.println("");
        for (int year = 2019; year <= 2022; year++) {
            if (isYear(year)) {
                System.out.println("год " + year + " високосный год");
            } else {
                System.out.println("год " + year + " не високосный год");
            }
        }
        //задача 3
        getDelivery(50);
        //задача 4
        fineRepiter();
    }


    static void getDelivery(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("доставка 1 день");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("доставка 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("доставка 3 дня");
        }
        if (deliveryDistance >= 100) {
            System.out.println("доставка 4 дня и более");
        }
    }


    public static void fineRepiter() {
        String str = "abcc";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                System.out.println("Дубль найден: символ- " + str.charAt(i));
                break;
            }

            if (i == str.length() - 1) {
                System.out.println("Дублей нет");
            }
        }

    }

}

