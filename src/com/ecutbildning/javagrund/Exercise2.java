package com.ecutbildning.javagrund;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double price;
        int vat;

        System.out.println("Mata in ett pris:");
        price = scan.nextDouble();

        System.out.println("Mata in moms:");
        vat = scan.nextInt();

        double withVat = price * (1 + (vat / 100));

        System.out.println("Priset är: " + price);
        System.out.println("Pris med moms blir: " + withVat);
    }
}

