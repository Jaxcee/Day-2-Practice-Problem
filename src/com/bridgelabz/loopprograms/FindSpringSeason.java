package com.bridgelabz.loopprograms;

public class FindSpringSeason {
    public static void main(String[] args) {
        int day = 5;
    int month = 3;
    boolean isSpring;
        if (month == 3 && day >= 20) {
            isSpring = true;
        } else if (month > 3 && month < 6) {
            isSpring = true;
        } else if (month == 6 && day <= 20) {
            isSpring = true;
        } else {
            isSpring = false;
        }
        System.out.println(isSpring);
}}