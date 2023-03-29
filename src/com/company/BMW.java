package com.company;

public class BMW extends Auto {


    @Override
    public void motor() {
        String naam = "BMW N63";
        int pk = 402;
        System.out.println("Naam van de motor: " + naam);
        System.out.println("Aantal pk: " + pk);
    }

    @Override
    public void price() {
        int prijs = 45000;
        System.out.println(prijs + " euro");
    }

    @Override
    public void deuren() {
        int aantal = 4;
        System.out.println("Aantal deuren: " + aantal);
    }

    @Override
    public void ramen() {
        int aantal = 5;
        System.out.println("Aantal ramen: " + aantal);
    }

    @Override
    public void Maximale_snelheid() {
        int km_per_uur = 325;
        System.out.println("Aantal km/u: " + km_per_uur);
    }

    @Override
    public void merk() {
        String naam = "BWM";
        System.out.println("Merknaam: " + naam);
    }
}

