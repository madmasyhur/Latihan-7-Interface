package com.kuliah;

public class Persegi extends BangunDatar implements Hitung {
    private double panjangSisi;

    Persegi(double panjangSisi) {
        super("PERSEGI");
        this.panjangSisi = panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }

    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    @Override
    public double hitungKeliling() {
        return getPanjangSisi() * 4;
    }

    @Override
    public double hitungLuas() {
        return Math.pow(getPanjangSisi(),2);
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(2 * Math.pow(getPanjangSisi(),2));
    }

    @Override
    public void info() {
        System.out.printf("%s","========PERSEGI========");
        System.out.printf("\n%-15s= %.2f","Keliling", hitungKeliling());
        System.out.printf("\n%-15s= %.2f", "Luas",  hitungLuas());
        System.out.printf("\n%-15s= %.2f ", "Diagonal Sisi", hitungSpesial());
        System.out.println("\n");
    }

    @Override
    public void search(String bangunDatar) {

    }
}
