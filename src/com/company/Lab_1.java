package com.company;
import java.util.Scanner;
public class Lab_1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество компьютеров: ");
        int inCountComputer = scan.nextInt();
        Computer[] PC = new Computer[inCountComputer];
        for (int i = 0; i < PC.length; i++)
        {
            PC[i] = new Computer();
            scan.nextLine();
            System.out.print("Введите название процессора: ");
            PC[i].setCpu(scan.nextLine());
            System.out.print("Введите количество частоты: ");
            PC[i].setFrequency(scan.nextInt());
            System.out.print("Введите объем оперативной памяти в (Гб): ");
            PC[i].setRam_size(scan.nextInt());
            scan.nextLine();
            System.out.print("Введите наличие видеокарты да/нет: ");
            PC[i].setVideo_card(scan.nextLine());
            System.out.print("Введите стоимость: ");
            PC[i].setPrice(scan.nextInt());
        }
        System.out.println("\nСведения о компьютерах оперативная память которых больше 12Гб: ");
        for (int i = 0; i < PC.length; i++)
        {
            if (PC[i].getRam_size() > 12)
            {
                System.out.println(PC[i].toString());
            }
        }
    }
}