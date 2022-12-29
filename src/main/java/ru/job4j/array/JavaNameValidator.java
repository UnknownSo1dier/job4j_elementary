package ru.job4j.array;

import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (valid) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!(isSpecialSymbol(code) || isLowerLatinLetter(code)
                        || isUpperLatinLetter(code) || isDigit(code))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
