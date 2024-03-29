package org.example;

public class Task_2 {

    public static void main(String[] args) {

        int[] test = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        dev(test);
    }

    public static void dev(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("Catching some kind of exception: " + e);
        }
    }
}