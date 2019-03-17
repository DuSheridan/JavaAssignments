package com.example.helloworld;

public class Punct_Intreg {
    int coordX;
    int coordY;

    public Punct_Intreg(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
    public void afiseaza()
    {
        System.out.println("Coordonatele sunt: " + this.coordX + " " + this.coordY);
    }
}
