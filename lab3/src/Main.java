import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        meniu();
    }


    //Desc:Scrie optiunile meniului si returneaza optiunea citita
    //In:Null
    //Out:Int-optiunea aleasa
    public static int scrieOptiuni()
    {
        int op;
        System.out.println("1.Citeste numere rationale");
        System.out.println("2.Subsecvente negative");
        System.out.println("0.Exit");
        Scanner S = new Scanner(System.in);
        op = S.nextInt();
        return op;
    }

    //Desc:Meniul aplicatiei

    public static void meniu()
    {
        ArrayList<Rational> vector = new ArrayList<Rational>();
        ArrayList<ArrayList<Rational>> multimeSubsecvente = new ArrayList<>();
        int op = 1;
        while(op!=0)
        {
            op = scrieOptiuni();
            switch(op)
            {
                case 1:
                {
                    vector = citireNrRationale();
                    break;
                }
                case 2:
                {
                    if(vector.size() == 0)
                        System.out.println("Vector gol, citeste numere");
                    else
                    {
                        multimeSubsecvente = determinareSubsecvente(vector);
                        afisareSubsecvente(multimeSubsecvente);
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Optiune invalida");
                    break;
                }

            }


        }
    }

    //Desc:Afiseaza toate subsecventele dintr-un tablou de subsecvente
    //In: Tablou bidimensional de numere rationale
    //Out:Void / print in consola a subsecventelor

    public static void afisareSubsecvente(ArrayList<ArrayList<Rational>> subsecvente)
    {
        for(ArrayList<Rational> subsecventa: subsecvente )
        {
            int iterator = 1;
            while(iterator <= subsecventa.size())
            {
                for(int i =0; i<=subsecventa.size()-iterator;i++)
                {
                    System.out.print("Subsecventa "+(i+1)+" cu "+iterator+" elemente este: ");
                    for(int increm = 0; increm<iterator; increm++)
                    {
                        System.out.print(subsecventa.get(i+increm).toString()+ " ");
                    }
                    System.out.println();
                }
                iterator++;
            }
            System.out.println();
        }
    }

    //Desc:Determina subsecventele maximale de numere negative dintr-un vector de numere rationale
    //In:Vector de numere rationale
    //Vector: Tablou bidimensional de numere rationale


    public static ArrayList<ArrayList<Rational>> determinareSubsecvente(ArrayList<Rational> vector)
    {
        ArrayList<ArrayList<Rational>> subsecvente = new ArrayList<>();
        ArrayList<Rational> subsecventaSing = new ArrayList<>();
        for(Rational numar: vector)
        {
            if(numar.getNumarator() < 0)
            {
                subsecventaSing.add(numar);
            }
            else
            {
                if(subsecventaSing.size() > 0)
                {
                    subsecvente.add(new ArrayList<Rational>(subsecventaSing));
                    subsecventaSing = new ArrayList<>();
                }
            }
        }
        if(subsecventaSing.size() > 0)
        {
            subsecvente.add(new ArrayList<Rational>(subsecventaSing));
        }

        return subsecvente;
    }

    //Desc:Citeste numere rationale pana cand se introduce 0(exclusiv);
    //In:void
    //Out:Vector de numere rationale

    public static ArrayList<Rational> citireNrRationale()
    {
        int numarator = 1;
        int numitor = 1;
        ArrayList<Rational> vector = new ArrayList<Rational>();
        while(numarator != 0)
        {
            numarator = citesteNumarator();
            numitor = citesteNumitor();
            Rational fractie = new Rational(numarator,numitor);
            vector.add(fractie);
        }
        vector.remove(vector.size() - 1);
        return vector;
    }

    //Desc:Citeste un numar
    //In:Void
    //Out:Intreg

    public static int citesteNumarator()
    {

        System.out.println("Numarator: ");
        Scanner S = new Scanner(System.in);
        return S.nextInt();

    }

    //Desc:Citeste un numar
    //In:Void
    //Out:Intreg

    public static int citesteNumitor()
    {

        System.out.println("Numitor: ");
        Scanner S = new Scanner(System.in);
        return S.nextInt();

    }
}
