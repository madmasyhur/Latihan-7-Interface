package com.kuliah;

public class FungsiBangunDatar extends BangunDatar {

    FungsiBangunDatar(String nama) {
        super(nama);
    }

    @Override
    public void info() {
        for (int i = 0; i < listBangunDatar.length; i++) {
            if(listBangunDatar[i] == null) {
                break;
            }
            System.out.printf("%d. %s\n",i+1,listBangunDatar[i]);
        }
    }

    @Override
    public void search(String bangunDatar) {

        
    }
}