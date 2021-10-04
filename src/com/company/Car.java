package com.company;
import java.util.Scanner;

public class Car {
    String car_brand;
    String manufacturer;
    String type;
    int year_of_issue;
    int registration_date;

    Scanner scan = new Scanner(System.in);

    public void setСar_brand(String car_brand) {
        this.car_brand = car_brand;
    }
    public String getСar_brand() {
        return car_brand;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setYear_of_issue(int year_of_issue) {
        int trueYear_of_issue = year_of_issue;
        if (year_of_issue < 1885 && year_of_issue > 2021)
        {
            System.out.println("Некорректное значение года выпуска автомобиля. Год выпуска автомобиля может быть в пределах (1885-2021)");
            System.out.print("Введите год выпуска автомобиля: ");
            trueYear_of_issue = scan.nextInt();
        }
        this.year_of_issue = trueYear_of_issue;
    }
    public int getYear_of_issue() {
        return year_of_issue;
    }
    public void setRegistration_date(int registration_date) {
        int trueRegistration_date = registration_date;
        if (registration_date < 1991 && registration_date > 2021)
        {
            System.out.println("Некорректное значение даты регистрации автомобиля. Дата постановки автомобиля на учёт может быть в пределах (1991-2021) ");
            System.out.print("Введите год постановления транспорта на учёт: ");
            trueRegistration_date = scan.nextInt();
        }
        this.registration_date = trueRegistration_date;
    }
    public int getRegistration_date() {
        return registration_date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_brand='" + car_brand + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", year_of_issue=" + year_of_issue +
                ", registration_date=" + registration_date +
                '}';
    }
}
