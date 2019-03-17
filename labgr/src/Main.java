import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args)
    {
        meniu();
    }


    //Desc:Scrie optiunile meniului si returneaza optiunea citita
    //In:Null
    //Out:Int-optiunea aleasa
    public static int scrieOptiuni()
    {
        int op;
        System.out.println("1.Add abonat");
        System.out.println("2.Get abonat");
        System.out.println("3.Set abonat");
        System.out.println("4.Delete abonat");
        System.out.println("5.Add informatii consum");
        System.out.println("6.Get informatii consum");
        System.out.println("7.Set informatii consum");
        System.out.println("8.Delete informatii consum");
        System.out.println("9.Get all abonati");
        System.out.println("10.Get all informatii pentru un abonat");
        System.out.println("11.Get all informatii");
        System.out.println("0.Exit");
        Scanner S = new Scanner(System.in);
        op = S.nextInt();
        return op;
    }

    //Desc:Meniul aplicatiei

    public static void meniu()
    {
        ArrayList<Abonat> yo = new ArrayList<Abonat>();
        ArrayList<InformatiiConsum> yo2 = new ArrayList<InformatiiConsum>();
        RepoInformatii RepoInfo = new RepoInformatii(yo2);
        RepoAbonati RepoAbo = new RepoAbonati(yo);
        Controller Contr = new Controller(RepoInfo,RepoAbo);
        int op = 1;
        while(op!=0)
        {
            op = scrieOptiuni();
            switch(op)
            {
                case 1:
                {
                    System.out.print("Adresa abonat: ");
                    int adresa = citesteNumar();
                    System.out.print("NumePrenume abonat: ");
                    String numePrenume = citesteString();
                    System.out.print("Numar Persoane abonat: ");
                    int nrPersoane = citesteNumar();
                    Contr.addAbonat(adresa,numePrenume,nrPersoane);
                    break;
                }
                case 2:
                {
                    System.out.print("Adresa cautata ");
                    int adresa = citesteNumar();
                    Abonat Saloot = Contr.getAbonat(adresa);
                    System.out.println(Saloot.toString());
                    break;
                }
                case 3:
                {
                    System.out.print("Adresa dorita: ");
                    int adresa = citesteNumar();
                    System.out.print("Adresa noua: ");
                    int adresaNoua = citesteNumar();
                    System.out.print("Nume nou: ");
                    String numePrenumeNou = citesteString();
                    System.out.print("Nr persoane nou");
                    int nrPersoaneNou = citesteNumar();
                    Contr.setAbonat(adresa,adresaNoua,numePrenumeNou,nrPersoaneNou);
                    break;
                }
                case 4:
                {
                    System.out.print("Adresa tinta: ");
                    int adresa = citesteNumar();
                    Contr.deleteAbonat(adresa);
                    break;
                }
                case 5:
                {
                    System.out.print("Adresa Informattie: ");
                    int adresa = citesteNumar();
                    System.out.print("Luna informatie: ");
                    int luna = citesteNumar();
                    System.out.print("Nume-Prenume informatie: ");
                    String numePrenume = citesteString();
                    System.out.print("Contor vechi: ");
                    int contorVechi = citesteNumar();
                    System.out.print("Contor actual: ");
                    int contorActual = citesteNumar();
                    Contr.addInformatie(adresa,luna,numePrenume,contorVechi,contorActual);
                    break;
                }
                case 6:
                {
                    System.out.print("Adresa informatiei cautate: ");
                    int adresa = citesteNumar();
                    System.out.print("Luna informatiei cautate: ");
                    int luna = citesteNumar();
                    InformatiiConsum info = Contr.getInformatie(adresa,luna);
                    System.out.print(info.toString());
                    break;
                }
                case 7:
                {
                    System.out.print("Adresa informatiei tinta: ");
                    int adresa = citesteNumar();
                    System.out.print("Luna informatiei tinta: ");
                    int luna = citesteNumar();
                    System.out.print("Adresa noua: ");
                    int adresaNoua =citesteNumar();
                    System.out.print("Luna noua: ");
                    int lunaNoua = citesteNumar();
                    System.out.print("NumePrenume nou: ");
                    String numePrenumeNou = citesteString();
                    System.out.print("Contor vechi nou: ");
                    int contorVechiNou = citesteNumar();
                    System.out.print("Contor actual nou: ");
                    int contorActualNou = citesteNumar();
                    Contr.setInformatie(adresa,luna,adresaNoua,lunaNoua,numePrenumeNou,contorVechiNou,contorActualNou);
                    break;
                }
                case 8:
                {
                    System.out.print("Adresa informatiei tinta: ");
                    int adresa = citesteNumar();
                    System.out.print("Luna informatiei tinta: ");
                    int luna = citesteNumar();
                    Contr.deleteInformatie(adresa,luna);
                    break;
                }
                case 9:
                {
                    ArrayList<Abonat> yo4 = Contr.getAllAbonati();
                    for(Abonat i: yo4)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 10:
                {
                    System.out.print("Adresa informatiei dorite");
                    int adresa = citesteNumar();
                    ArrayList<InformatiiConsum> yo3 = Contr.getAllInformatiiPerAbonat(adresa);
                    for(InformatiiConsum i : yo3)
                    {
                        System.out.println(i.toString());
                    }
                    break;
                }
                case 11:
                {
                    ArrayList<InformatiiConsum> yo5 = Contr.getAllInformatii();
                    for(InformatiiConsum i: yo5)
                    {
                        System.out.println(i.toString());
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

    //Desc:Citeste un numar
    //In:Void
    //Out:Intreg

    public static int citesteNumar()
    {

        //System.out.println("Numar: ");
        Scanner S = new Scanner(System.in);
        return S.nextInt();

    }

    //Desc:Citeste un numar
    //In:Void
    //Out:Intreg

    public static String citesteString()
    {

        //System.out.println("String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        return s;

    }
}
