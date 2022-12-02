package com.example.kosci4p;

import java.util.ArrayList;
import java.util.Random;

public class Kosc {
    private int wartosc;
    private boolean widoczne;
    private boolean zablokowane;
    private int idObrazka;

    private int[] obrazki = {
            R.drawable.empty_dice,
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6,
    };

    public Kosc() {

        wartosc = new Random().nextInt(6)+1;
        widoczne = false;
        zablokowane = false ;
        idObrazka = obrazki[wartosc];
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc() {

        this.wartosc = new Random().nextInt(6)+1;
        idObrazka = obrazki[wartosc];
    }

    public boolean isWidoczne() {
        return widoczne;
    }

    public void setWidoczne(boolean widoczne) {
        this.widoczne = widoczne;
    }

    public boolean isZablokowane() {
        return zablokowane;
    }

    public void setZablokowane(boolean zablokowane) {
        this.zablokowane = zablokowane;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
