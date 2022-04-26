package com.kuliah;

public class Trapesium extends BangunDatar implements Hitung {
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    Trapesium(double alasAtas, double alasBawah, double tinggi) {
        super("TRAPESIUM");
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    public double getAlasAtas() {
        return alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(getTinggi(),2) + Math.pow((getAlasBawah() - getAlasAtas()),2));
        return getAlasAtas() + getAlasBawah() + (2 * sisiMiring);
    }

    @Override
    public double hitungLuas() {
        return (getAlasBawah() + getAlasAtas()) * getTinggi() / 2;
    }

    @Override
    public double hitungSpesial() {
        return getAlasAtas() * getTinggi();
    }

    @Override
    public void info() {
        System.out.printf("%s","=======TRAPESIUM=======");
        System.out.printf("\n%-15s= %.2f","Keliling", hitungKeliling());
        System.out.printf("\n%-15s= %.2f", "Luas",  hitungLuas());
        System.out.printf("\n%-15s= %.2f ", "Luas ABCD", hitungSpesial());
        System.out.println("\n");
    }

    @Override
    public void search(String bangunDatar) {

    }
}
