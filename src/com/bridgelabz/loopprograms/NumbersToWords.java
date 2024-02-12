package com.bridgelabz.loopprograms;

public class NumbersToWords {

        public static void main(String[] args) {
            int number = 5;
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            if (number >= 0 && number <= 9) {
                System.out.println("Word representation: " + words[number]);
            } else {
                System.out.println("Invalid input! Please enter a single digit number.");
            }
        }
    }


