package com.bridgelabz.loopprograms;

public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar";
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed;
        }
        if (input.equals(reversed)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
