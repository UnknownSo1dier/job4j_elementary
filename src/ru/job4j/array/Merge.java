package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[k++] = left[i++];
            }
            else {
                rsl[k++] = right[j++];
            }
        }
        while (i < left.length) {
            rsl[k++] = left[i++];
        }
        while (j < right.length) {
            rsl[k++] = right[j++];
        }
        return rsl;
    }
}