package com.kuliah;

public class Lingkaran extends BangunDatar implements Hitung {
    private double jari;

    Lingkaran(double jari) {
        super("LINGKARAN");
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    @Override
    public double hitungKeliling() {
        return Math.PI * 2 * getJari();
    }

    @Override
    public double hitungLuas() {
        return Math.PI * Math.pow(getJari(),2);
    }

    @Override
    public double hitungSpesial() {
        return (Math.PI * Math.pow(getJari(),2) / 4) - (Math.pow(getJari(),2) / 2);
    }

    @Override
    public void info() {
        System.out.printf("%s","=======LINGKARAN=======");
        System.out.printf("\n%-15s= %.2f","Keliling", hitungKeliling());
        System.out.printf("\n%-15s= %.2f", "Luas",  hitungLuas());
        System.out.printf("\n%-15s= %.2f ", "Luas Tembereng", hitungSpesial());
        System.out.println("\n");
    }

    @Override
    public void search(String bangunDatar) {

    }
}
