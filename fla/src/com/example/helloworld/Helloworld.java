package com.example.helloworld;
import java.lang.Math;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
public class Helloworld {
    public static void main(String[] args) {
        meniu();
    }
    public static void meniu()
    {
        int op = 1;
        while(op!=0)
        {
            System.out.println("1.Afiseaza toate perechile de coordonate din cerc");
            System.out.println("2.Intersectia a doua cercuri");
            System.out.println("0.Exit");
            Scanner S = new Scanner(System.in);
            op = S.nextInt();

            switch(op)
            {
                case 1: {
                    double coordX = citesteX();
                    double coordY = citesteY();
                    double raza = citesteRaza();
                    Cerc cerc = new Cerc(raza,coordX,coordY);
                    afiseazaVectorPuncte(cerc.verificaPatrat());
                    break;

                }
                case 2:
                {
                    double coordXprim = citesteX();
                    double coordYprim = citesteY();
                    double razaprim = citesteRaza();
                    Cerc cercPrim = new Cerc(razaprim,coordXprim,coordYprim);
                    double coordXsec = citesteX();
                    double coordYsec = citesteY();
                    double razasec = citesteRaza();
                    Cerc cercSec = new Cerc(razasec,coordXsec,coordYsec);
                    afiseazaVectorPuncte(cercPrim.verificaIntersectie(cercSec));
                    break;
                }
                case 0: {
                    op = 0;
                    break;
                }
                default: {
                    System.out.println("Optiune invalida");
                    break;
                }

            }


        }
    }

    public static void afiseazaVectorPuncte(ArrayList<Punct_Intreg> vector)
    {
        if(vector.size() == 0)
            System.out.println("Nici un punct");
        for (Punct_Intreg punct : vector)
        {
            punct.afiseaza();
        }
    }

    public static void verificaIntersectie(double coordXprim, double coordYprim,
                                           double razaprim, double coordXsec, double coordYsec, double razasec) {
        int latimeMinimaPrim = (int) Math.ceil(coordXprim - razaprim);
        int latimeMaximaPrim = (int) Math.floor(coordXprim + razaprim);
        int lungimeMinimaPrim = (int) Math.ceil(coordYprim - razaprim);
        int lungimeMaximaPrim = (int) Math.floor(coordYprim + razaprim);
        for (int i = latimeMinimaPrim; i <= latimeMaximaPrim; i++) {
            for (int j = lungimeMinimaPrim; j <= lungimeMaximaPrim; j++) {
                if (verificaCerc(i, coordXprim, j, coordYprim, razaprim))
                    if(verificaCerc(i,coordXsec, j, coordYsec, razasec))
                        afiseaza(i,j);
            }
        }
    }

            public static double citesteX()
            {
                Scanner input = new Scanner(System.in);
                input.useLocale(Locale.US);
                System.out.println("Coordonata X a centrului este: ");
                double coord = input.nextDouble();
                return coord;
            }
            public static double citesteY()
            {
                Scanner input = new Scanner(System.in);
                input.useLocale(Locale.US);
                System.out.println("Coordonata Y a centrului este: ");
                double coord = input.nextDouble();
                return coord;
            }
            public static double citesteRaza()
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Raza cercului este: ");
                double raza = input.nextDouble();
                return raza;
            }
            public static void verificaPatrat(double coordX, double coordY, double raza)
            {
                int latimeMinima = (int) Math.ceil(coordX - raza);
                int latimeMaxima = (int) Math.floor(coordX + raza);
                int lungimeMinima = (int) Math.ceil(coordY - raza);
                int lungimeMaxima = (int) Math.floor(coordY + raza);
                for (int i = latimeMinima; i <= latimeMaxima; i++) {
                    for (int j = lungimeMinima; j <= lungimeMaxima; j++) {
                        if (verificaCerc(i, coordX, j, coordY, raza))
                            afiseaza(i, j);
                    }
                }
            }
            public static void afiseaza ( int i, int j)
            {
                System.out.println("Coordonatele sunt: " + i + " " + j);
            }
            public static boolean verificaCerc ( int coordPunctX, double coordX, int coordPunctY, double coordY,
            double raza)
            {
                double patratX = Math.pow(coordPunctX - coordX, 2);
                double patratY = Math.pow(coordPunctY - coordY, 2);
                return patratX + patratY <= Math.pow(raza, 2);
            }

        }

