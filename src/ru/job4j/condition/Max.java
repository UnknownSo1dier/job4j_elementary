package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 4));
    }
}