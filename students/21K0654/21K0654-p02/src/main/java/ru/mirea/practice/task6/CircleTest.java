package ru.mirea.practice.task6;

public final class CircleTest {
    private CircleTest() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Circle circle1 = new Circle(3);
        System.out.println(circle.square() + " " + circle.length());
        System.out.println(circle1.square() + " " + circle1.length());
        if (circle.toCompare(circle1) > 0) {
            System.out.println("больше");
        } else if (circle.toCompare(circle1) == 0) {
            System.out.println("равны");
        } else {
            System.out.println("меньше");
        }
    }
}
