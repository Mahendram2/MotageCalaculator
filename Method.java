package com.Mahendra;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        double p =principal();
        double r = interestRate();
        int year = years();
        double mortage = calculateMortage(year, r, p);
        System.out.println("Mortage");
        System.out.println("-------");
        System.out.println("Mortage is $" + mortage);

    }
    public static double principal(){
        Scanner info = new Scanner(System.in);
        Double p = 1.1;
        int a=0;
        while (a==0) {
            System.out.print("Principal ($1K - $1M) : ");
            p = info.nextDouble();
            if (p<1000 || p>1000000) {
                System.out.println("Please enter amount between $1000 and $1000000.");
            } else {
                a=1;
            }
        }
        return p;
    }

    public static double interestRate(){
        Scanner info = new Scanner(System.in);
        Double interestRate = 1.1;
        int b = 1;
        while (b==1) {
            System.out.print("Annual Interest Rate: ");
            interestRate = info.nextDouble();

            if (interestRate <1 || interestRate > 30){
                System.out.println("Enter a value from 1-30");
            } else {
                b=0;
            }

        }
        double r = (interestRate/100)/12;
    return r;
    }
    public static int years(){
        Scanner info = new Scanner(System.in);
        int year = 1;
        int c =1;
        while (c==1){
            System.out.print("Period (Years): ");
            year = info.nextInt();
            if(year < 1 || year >30){
                System.out.println("Enter a value from 1-30 years");
            }else {
                c=2;
            }
        }
        return year;
    }

    public static double calculateMortage (int year, double r, double p){
        int n = year * 12;

         double numertor = r*(Math.pow(1+r, n));
        System.out.println("Num" + numertor);
        double demo = (Math.pow(1+r, n)-1);
        System.out.println("DEno" + demo);
        double d = numertor/demo;


        double mortage = p*d;
        mortage *= 100;
        mortage = Math.floor(mortage);
        mortage /= 100;



        return mortage;
    }
    }

