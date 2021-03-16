package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return third > temp ? third : temp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(first, second, third);
        return fourth > temp ? fourth : temp;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 4, 7, 800));
    }
}