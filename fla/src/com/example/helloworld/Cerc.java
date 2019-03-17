package com.example.helloworld;
import java.util.ArrayList;
public class Cerc {
    double raza;
    double coordX;
    double coordY;

    public Cerc(double raza, double coordX,double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
    public ArrayList<Punct_Intreg> verificaIntersectie(Cerc cercsec)
    {
        ArrayList <Punct_Intreg> vectorfin = new ArrayList<Punct_Intreg>();
        ArrayList <Punct_Intreg> vectorPrim = this.verificaPatrat();
        for (Punct_Intreg punct : vectorPrim)
        {
            if(verificaCerc(punct.getCoordX(),cercsec.getCoordX(),punct.getCoordY(),cercsec.getCoordY(),cercsec.getRaza()))
                    vectorfin.add(punct);
        }
        return vectorfin;
    }

    public ArrayList<Punct_Intreg> verificaPatrat()
    {
        ArrayList<Punct_Intreg> vectorPuncte= new ArrayList<Punct_Intreg>();
        int latimeMinima = (int) Math.ceil(coordX - raza);
        int latimeMaxima = (int) Math.floor(coordX + raza);
        int lungimeMinima = (int) Math.ceil(coordY - raza);
        int lungimeMaxima = (int) Math.floor(coordY + raza);
        for (int i = latimeMinima; i <= latimeMaxima; i++) {
            for (int j = lungimeMinima; j <= lungimeMaxima; j++) {
                if (verificaCerc(i, coordX, j, coordY, raza))
                    vectorPuncte.add(new Punct_Intreg(i,j));
            }
        }
        return vectorPuncte;
    }
    public static boolean verificaCerc ( int coordPunctX, double coordX, int coordPunctY, double coordY,
                                         double raza)
    {
        double patratX = Math.pow(coordPunctX - coordX, 2);
        double patratY = Math.pow(coordPunctY - coordY, 2);
        return patratX + patratY <= Math.pow(raza, 2);
    }

}
