package ru.mirea.practice;

public class One4 {
    public static void main(String[] args) {
        float res;
        for (float i = 1f; i < 11; i++) {
            res = 1 / i;
            System.out.printf("%.2f", res);
            System.out.print(' ');
        }
    }
}
