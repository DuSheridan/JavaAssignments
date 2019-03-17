import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        meniu();
    }

    public static String citesteString()
    {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        return string;
    }
    public static int citesteNumar()
    {
        Scanner S = new Scanner(System.in);
        return S.nextInt();

    }
    public static int scrieoptiuni()
    {
        System.out.println("1.Afisare pentru cumparator");
        System.out.println("2.Cumpar disponibile");
        System.out.println("3.Afisare indisponibile");
        System.out.println("4.Afisare all");
        System.out.println("0.Exit");
        Scanner S = new Scanner(System.in);
        return S.nextInt();
    }
    public static void meniu()
    {
        ArrayList<Anvelopa> salot = new ArrayList<Anvelopa>();
        RepoSM yo = new RepoSM(salot);
        try {
            yo.upLista("Bd.txt");
        }
        catch (Exception e)
        {
            System.out.println("Nu am deschis fisierul");
        }
        int op = 1;
        while(op != 0)
        {
            op = scrieoptiuni();
            switch(op)
            {
                case 1:
                {
                    salot = yo.getDisponibile();
                    Collections.sort(salot);
                    for (Anvelopa i:salot)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Denumire: ");
                    String denum = citesteString();
                    System.out.println("Tip: ");
                    String tip = citesteString();
                    System.out.println("Numar cantitate dorita: ");
                    int numar = citesteNumar();
                    ArrayList<Anvelopa> salut = new ArrayList<>();
                    salut = yo.getLista();
                    for(int i = 0;i<salut.size();i++)
                    {
                        if(salut.get(i).getDenumire().equals(denum) & salut.get(i).getTip().equals(tip))
                        {
                            if(numar > salut.get(i).getStocInitial() - salut.get(i).getVandute())
                                yo.setAnvelopa(i,new Anvelopa(salut.get(i).getDenumire(),
                                        salut.get(i).getTip(),salut.get(i).getStocInitial(),salut.get(i).getStocInitial(),
                                        salut.get(i).getPretUnit()));
                            else
                                yo.setAnvelopa(i,new Anvelopa(salut.get(i).getDenumire(),
                                        salut.get(i).getTip(),salut.get(i).getStocInitial(),
                                        salut.get(i).getVandute() +numar,
                                        salut.get(i).getPretUnit()));
                        }
                    }
                    break;
                }
                case 3:
                {
                    List<Anvelopa> salot2 = new ArrayList<Anvelopa>();
                    salot2 = yo.getIndisponibile();
                    Collections.sort(salot2);
                    for(Anvelopa i:salot2)
                    {
                        System.out.println(i.toString2());
                    }
                    break;
                }
                case 4:
                {
                    ArrayList<Anvelopa> salot3 = new ArrayList<>();
                    salot3 = yo.getLista();
                    for(Anvelopa i:salot3)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 0:
                {
                    break;
                }
                default:
                    {
                    System.out.println("Optiune invalida");
                    break;
                }
            }
        }
     }
    }
