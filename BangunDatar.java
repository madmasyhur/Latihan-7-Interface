package com.kuliah;

public abstract class BangunDatar {
    private String nama;
    static int kapasitas = 0;
    static String[] listBangunDatar = new String[10];
    public abstract void info();
    public abstract void search(String bangunDatar);

    BangunDatar(String nama){
        if (!nama.equals(" ")) {
            this.nama = nama;
            listBangunDatar[kapasitas] = this.nama;
            kapasitas++;
        }
    }

    public static BangunDatar getInstanceBangunDatarOf(Hitung bangun) {
        BangunDatar bangunDatar = null;
        if (bangun instanceof Persegi) {
            bangunDatar = (Persegi) bangun;
        } else if (bangun instanceof Segitiga) {
            bangunDatar = (Segitiga) bangun;
        } else if (bangun instanceof Lingkaran) {
            bangunDatar = (Lingkaran) bangun;
        } else if(bangun instanceof Trapesium) {
            bangunDatar = (Trapesium) bangun;
        } else if(bangun instanceof Layang) {
            bangunDatar = (Layang) bangun;
        }
        return bangunDatar;
    }
}