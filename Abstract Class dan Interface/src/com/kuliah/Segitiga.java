package com.kuliah;

public class Segitiga extends BangunDatar implements  Hitung {
    private double alas;
    private double tinggi;

    Segitiga(double alas, double tinggi) {
        super("SEGITIGA");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(getAlas(),2) + Math.pow(getTinggi(),2));
        return getAlas() + getTinggi() + sisiMiring;
    }

    @Override
    public double hitungLuas() {
        return getAlas() * getTinggi() / 2;
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }

    @Override
    public void info() {
        System.out.printf("%s","=======SEGITIGA=======");
        System.out.printf("\n%-15s= %.2f","Keliling", hitungKeliling());
        System.out.printf("\n%-15s= %.2f", "Luas",  hitungLuas());
        System.out.printf("\n%-15s= %.2f", "Sisi Miring", hitungSpesial());
        System.out.println("\n");
    }

    @Override
    public void search(String bangunDatar) {

    }
}
