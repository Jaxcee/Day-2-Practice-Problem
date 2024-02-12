package com.bridgelabz.loopprograms;

public class FindQuadratic {
    public static void main(String[] args) {
        double a = 1.0;
        double b =-3.0;
        double c = 2.0;
        double delta = b*b-4-a-c;
        if(delta>=0){
            double rootone = (-b + Math.sqrt(delta)) / (2 * a);
            double roottwo = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(rootone);
            System.out.println(roottwo);
        }
        else {
            System.out.println("Imaginary roots");
        }
    }
}
