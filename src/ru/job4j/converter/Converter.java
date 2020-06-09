package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int inRubleToEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(inRubleToEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        int inRubleToDollar = 600;
        int expectedDollar = 10;
        int outDollar = rubleToDollar(inRubleToDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("600 rubles are 10 dollars. Test result : " + passedDollar);
    }
}
