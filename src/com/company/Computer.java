package com.company;
import java.util.Scanner;
public class Computer {
    String cpu;
    int frequency;
    int ram_size;
    String video_card;
    int price;
    Scanner scan = new Scanner(System.in);
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getCpu() {
        return cpu;
    }
    public void setFrequency(int frequency) {
        int trueFrequency = frequency;
        if (frequency < 0)
        {
            System.out.println("Некорректное значение частоты. Количество частоты не может быть отрицательным числом");
            System.out.print("Введите количество частоты: ");
            trueFrequency = scan.nextInt();
        }
        this.frequency = trueFrequency;
    }
    public int getFrequency() {
        return frequency;
    }
    public void setRam_size(int ram_size) {
        int trueRam_size = ram_size;
        if (ram_size < 0)
        {
            System.out.println("Некорректное значение . Объем оперативной памяти не может быть отрицательным числом");
            System.out.print("Введите объем оперативной памяти: ");
            trueRam_size = scan.nextInt();
        }
        this.ram_size = trueRam_size;
    }
    public int getRam_size() {
        return ram_size;
    }
    public void setVideo_card(String video_card) {
        this.video_card = video_card;
    }
    public String getVideo_card() {
        return video_card;
    }
    public void setPrice(int price) {
        int truePrice = price;
        if (price < 0)
        {
            System.out.println("Некорректное значение . Стоимость не может быть отрицательным числом");
            System.out.print("Введите стоимость: ");
            truePrice = scan.nextInt();
        }
        this.price = truePrice;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", frequency=" + frequency +
                ", ram_size=" + ram_size +
                ", video_card='" + video_card + '\'' +
                ", price=" + price +
                '}';
    }
}