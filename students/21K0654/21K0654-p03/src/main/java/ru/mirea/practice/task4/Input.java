package ru.mirea.practice.task4;

import java.util.Random;
import java.util.Scanner;

public final class Input {
    private Input() {
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Введите число");
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Ввод корректен");
                break;
            } else {
                System.out.println("Ввод не корректен");
                sc = new Scanner(System.in);
            }
        }
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + "Четн: ");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}