package com.company;

import java.util.Scanner;

class Dealer {
    Auto Lamborghini = new Lamborghini();
    Auto BMW = new BMW();
    Auto Audi = new Audi();

    public void info()
    {
        int choice;
        String keuze;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welke auto wilt u informatie over hebben?");
        System.out.println("1. Lamborghini");
        System.out.println("2. BMW");
        System.out.println("3. Audi");
        System.out.println("Voer een getal in voor de informatie over de auto");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                Lamborghini.merk();
                Lamborghini.motor();
                Lamborghini.ramen();
                Lamborghini.deuren();
                Lamborghini.Maximale_snelheid();
                break;
            case 2:
                BMW.merk();
                BMW.motor();
                BMW.ramen();
                BMW.deuren();
                BMW.Maximale_snelheid();
                break;
            case 3:
                Audi.merk();
                Audi.motor();
                Audi.ramen();
                Audi.deuren();
                Audi.Maximale_snelheid();
                break;
            default:
                keuze = "Deze optie bestaat niet";
                break;
        }

    }

    public void betalen(){
        int choice;
        String keuze;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welke auto wilt u kopen?");
        System.out.println("1. Lamborghini");
        System.out.println("2. BMW");
        System.out.println("3. Audi");
        System.out.println("Voer een getal in voor het kopen van de auto");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("U heeft betaald:");
                Lamborghini.price();
                System.out.println("Voor de Lamborghini");
                break;
            case 2:
                System.out.println("U heeft betaald:");
                BMW.price();
                System.out.println("Voor de BMW");
                break;
            case 3:
                System.out.println("U heeft betaald:");
                Audi.price();
                System.out.println("Voor de Audi");
                break;
            default:
                keuze = "U heeft geen auto gekozen om te kopen";
                break;
        }
    }
    public void prijslijst(){
        int choice;
        String keuze;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welke auto wilt u de prijs van zien?");
        System.out.println("1. Lamborghini");
        System.out.println("2. BMW");
        System.out.println("3. Audi");
        System.out.println("Voer een getal in voor het weergeven van de prijs van de auto");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("De prijs voor de Lamborghini is:");
                Lamborghini.price();
                break;
            case 2:
                System.out.println("De prijs voor de BMW is:");
                BMW.price();
                break;
            case 3:
                System.out.println("De prijs voor de Audi is:");
                Audi.price();
                break;
            default:
                keuze = "U heeft geen auto waarvan u de prijs wilt";
                break;
        }
    }
}
