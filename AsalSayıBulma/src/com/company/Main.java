package com.company;

import java.util.Scanner;

public class Main {
    static void prime() {
        int number, prime = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        number = scan.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime++;
            }

        }
        if (number == 1) {
            System.out.println("Asal sayılar 2'den başlar.");
        } else if (prime == 0) {
            System.out.println("sayı asal sayıdır.");
        } else {
            System.out.println("Sayı asal sayı değildir!!");
        }
        prime();

    }

    public static void main(String[] args) {
        // Java dilinde "Recursive" metot kullananarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
        prime();

    }
}
