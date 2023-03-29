package com.company;

public class Audi extends Auto {
    @Override
    public void motor() {
        String naam = "Audi RS5";
        int pk = 450;
        System.out.println("Naam van de motor: " + naam);
        System.out.println("Aantal pk: " + pk);
    }

    @Override
    public void price() {
        int prijs = 65000;
        System.out.println(prijs + " euro");
    }

    @Override
    public void deuren() {
        int aantal = 2;
        System.out.println("Aantal deuren: " + aantal);
    }

    @Override
    public void ramen() {
        int aantal = 3;
        System.out.println("Aantal ramen: " + aantal);
    }

    @Override
    public void Maximale_snelheid() {
        int km_per_uur = 280;
        System.out.println("Aantal km/u: " + km_per_uur);
    }

    @Override
    public void merk() {
        String naam = "Audi";
        System.out.println("Merknaam: " + naam);
    }
}