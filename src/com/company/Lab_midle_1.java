package com.company;
import java.util.Scanner;

public class Lab_midle_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Введите количество автомобилей: ");
        int inCountCar = scan.nextInt();

        Car[] park = new Car[inCountCar];

        for (int i = 0; i < park.length; i++) {
            park[i] = new Car();
            scan.nextLine();

            System.out.print("Введите марку автомобиля: ");
            park[i].setСar_brand(scan.nextLine());

            System.out.print("Введите производителя: ");
            park[i].setManufacturer(scan.nextLine());

            System.out.print("Введите тип автомобиля: ");
            park[i].setType(scan.nextLine());

            System.out.print("Введите год производства автомобиля (1885-2021): ");
            park[i].setYear_of_issue(scan.nextInt());

            System.out.print("Введите дату регистрации автомобиля (1991-2021) : ");
            park[i].setRegistration_date(scan.nextInt());
        }
        System.out.println("\nАвтомобил - год выпуска которых до 2005-го года и дата регистрации в этом году :");

        for (int i = 0; i < park.length; i++) {
            if (park[i].getYear_of_issue() > 1885 && park[i].getYear_of_issue() < 2006 && park[i].getRegistration_date() < 2022 && park[i].getRegistration_date() > 2020) {
                System.out.println(park[i].toString());
            }
        }
    }
}