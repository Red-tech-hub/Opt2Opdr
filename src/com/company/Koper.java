package com.company;

import org.junit.Test;

import java.util.Scanner;

public class Koper {

    public static void main(String[] args) {
        Dealer d = new Dealer();

        String choice;
        Scanner sc = new Scanner(System.in);
        String keuze = "";

        while (!keuze.equals("stop")) {
            System.out.println("Wat wilt u doen?");
            System.out.println("1. Informatie opvragen");
            System.out.println("2. Prijslijst bekijken");
            System.out.println("3. Betalen");
            System.out.println("Typ 'stop' om te stoppen");

            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    d.info();
                    break;
                case "2":
                    d.prijslijst();
                    break;
                case "3":
                    d.betalen();
                    break;
                case "stop":
                    System.out.println("Programma wordt beëindigd...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Deze optie bestaat niet");
                    break;
            }
        }
    }
}
