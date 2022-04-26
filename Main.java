package com.kuliah;

public class Main {
    public static void main(String[] args) {
        BangunDatar datar = new FungsiBangunDatar(" ");
        Hitung[] hitungs = new Hitung[5];
        hitungs[0] = new Persegi(10);
        hitungs[1] = new Segitiga(3,4);
        hitungs[2] = new Layang(6,10,5,13);
        hitungs[3] = new Trapesium(5,8,4);
        hitungs[4] = new Lingkaran(7);
        System.out.println("====INFROMASI BANGUN DATAR====");
        datar.info();

        for(Hitung bangun : hitungs) {
            BangunDatar bangunDatar = BangunDatar.getInstanceBangunDatarOf(bangun);
            bangunDatar.info();
        }
    }
}
