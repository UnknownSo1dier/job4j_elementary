package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = add(symbol, counter, result);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result = add(symbol, counter, result);
        return result;
    }

    public static String add(char sym, int count, String str) {
        str += Character.toString(sym);
        if (count > 1) {
            str += Integer.toString(count);
        }
        return str;
    }
}
