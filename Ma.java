package com.Mahendra;

import java.util.Scanner;

public class Ma {

    public static void main(String[] args) {
        double p = Principal();
        double i = interstRate();
        int y = year();
        double num = numurator(i,y);
        double Deno = Deno(i,y);
        calculateMortgage(p,num,Deno);

    }
    public static double Principal(){
        double i = 1;
        double p = 0;
        while (i==1){
            System.out.print("Principal ($1K - $1M): ");
            Scanner input = new Scanner(System.in);
            double principle = input.nextDouble();
            if (principle >= 1000 && principle <= 1000000){
                p = principle;
                i++;
            }else{
                System.out.println("Please enter amount between $1000 and $1000000.");
            }
        }
        return p;
    }

    public static double interstRate(){
        int i = 0;
        double r = 0;
        while (i==0){
            Scanner input = new Scanner(System.in);
            System.out.print("Annual Interest Rate: ");
            double interestRate = input.nextDouble();
            if (interestRate >=1 && interestRate <= 30){
                r=interestRate;
                i++;
            }else {
                System.out.println("Enter a value from 1-30");
            }

        }
        return (r/100)/12;
    }

    public static int year(){
        int i = 0;
        int y = 0;
        while (i==0){
            Scanner input = new Scanner(System.in);
            System.out.print("Period (Years): ");
            int year = input.nextInt();
            if (year >=1 && year <= 30){
                y = year;
                i++;
            }else {
                System.out.println("Please Enter a year between 1 year and 30 years.");
            }
        }
        return y*12;
    }

    public static double numurator(double num1, int num2){
        double num = Math.pow((1 + num1),num2);
        return num1*num;
    }

    public static double Deno(double num1, int num2){
        double num = (1 + num1);
        double p = Math.pow(num,num2);
        return p-1;
    }

    public static double calculateMortgage(double num1, double num2, double num3){
        double m1 = num2/num3;
        double mortage = num1 * m1;
        System.out.printf("Mortgage is: $%.2f\n", mortage);
        return mortage;
    }

}
