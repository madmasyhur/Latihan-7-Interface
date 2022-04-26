package com.kuliah;

public class Layang extends BangunDatar implements Hitung {
    private double diagonal1;
    private double diagonal2;
    private double sisiMiring1;
    private double sisiMiring2;

    Layang(double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        super("LAYANG-LAYANG");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public double getSisiMiring1() {
        return sisiMiring1;
    }

    public double getSisiMiring2() {
        return sisiMiring2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (getSisiMiring1() + getSisiMiring2());
    }

    @Override
    public double hitungLuas() {
        return getDiagonal1() * getDiagonal2() / 2;
    }

    @Override
    public double hitungSpesial() {
        return getDiagonal1() * (Math.sqrt(Math.pow(getSisiMiring1(),2) - Math.pow(getDiagonal1() / 2, 2)));
    }

    @Override
    public void info() {
        System.out.printf("%s","=====LAYANG-LAYANG=====");
        System.out.printf("\n%-15s= %.2f","Keliling", hitungKeliling());
        System.out.printf("\n%-15s= %.2f", "Luas",  hitungLuas());
        System.out.printf("\n%-15s= %.2f ", "Luas Segitiga", hitungSpesial());
        System.out.println("\n");
    }

    @Override
    public void search(String bangunDatar) {

    }
}
