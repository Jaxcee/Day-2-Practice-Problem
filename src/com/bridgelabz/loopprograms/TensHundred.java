package com.bridgelabz.loopprograms;

public class TensHundred {
    public static void main(String[] args) {


        int num = 100;

        if(num==1||num==10||num==100||num==1000){
            int unit = num % 10;
            int ten = (num/10) % 10;
            int hundred = (num/100) % 10;

            System.out.println("Unit: " + unit);
            System.out.println("Ten: " + ten);
            System.out.println("Hundred: " + hundred);
        }
        else {
            System.out.println("Invalid input. Please enter 1, 10, 100, or 1000.");
        }

    }
}
