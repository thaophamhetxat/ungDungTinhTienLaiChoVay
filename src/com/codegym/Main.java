package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double money ;
        double interestRate ;
        int month ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tien cho vay");
        money = scanner.nextInt();
        System.out.println("nhap ty le vay");
        interestRate = scanner.nextInt();
        System.out.println("nhap so thang cho vay");
        month = scanner.nextInt();

        double totalInterest=0;
        for(int i =0;i<month;i++){
            totalInterest = totalInterest + money*(interestRate/100)/12*month;
        }
        System.out.println("total of Interest = "+totalInterest);

    }
}
