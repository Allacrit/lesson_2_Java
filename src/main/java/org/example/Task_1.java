package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println(getFloat());
    }

    public static float getFloat() {
        float res = 0;
        boolean flag = true;
        while (flag) try {
            System.out.print("Введите дробное число (типа float): ");
            Scanner scanner = new Scanner(System.in);
            res = scanner.nextFloat();
            flag = false;
        } catch (InputMismatchException e) {
            System.out.println("это не тип float!!!!, пример -> 12,34567");
        }
        return res;
    }
}