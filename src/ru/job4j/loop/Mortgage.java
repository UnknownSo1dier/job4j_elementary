package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remainder = amount;
        while (remainder > 0) {
            remainder = remainder * (1 + percent / 100) - salary;
            year++;
        }
        return year;
    }
}
