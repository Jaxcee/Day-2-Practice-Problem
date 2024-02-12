package com.bridgelabz.loopprograms;

public class Reverse {
    public static void main(String[] args) {
            String originalstr = "Hello";
            String reversed = "";
            for(int i =0;i<originalstr.length();i++) {
                reversed = originalstr.charAt(i) + reversed;
            }
            System.out.println(reversed);
        }
    }



