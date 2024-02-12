package com.bridgelabz.loopprograms;

public class MinMax {
    public static void main(String[] args) {
        int[] elements = {170000, 3, 54, 67, 89, 92, 45};
        int max = elements[0];
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        System.out.println(max);

    for (int i = 0; i < elements.length; i++) {
        if (elements[i] < min) {
            min = elements[i];
        }
    }
        System.out.println(min);
}
}
