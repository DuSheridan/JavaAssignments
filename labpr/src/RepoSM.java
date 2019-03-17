import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class RepoSM {
    private ArrayList<Anvelopa> Lista;

    public RepoSM(ArrayList<Anvelopa> lista) {
        Lista = lista;
    }

    public ArrayList<Anvelopa> getLista() {
        return Lista;
    }

    public void upLista(String numeFisier) throws Exception
    {
        File fisier = new File(numeFisier);
        Scanner sc = new Scanner(fisier);
        while (sc.hasNextLine())
        {
            String Linie = sc.nextLine();
            String Cuvinte[] = Linie.split(",");
            String Denumire = Cuvinte[0];
            String Tip = Cuvinte[1];
            int StocInitial = Integer.parseInt(Cuvinte[2]);
            int Vandute = Integer.parseInt(Cuvinte[3]);
            int PretUnit = Integer.parseInt(Cuvinte[4]);
            Anvelopa New = new Anvelopa(Denumire,Tip,StocInitial,Vandute,PretUnit);
            Lista.add(New);
        }
    }
    public void setAnvelopa(int index,Anvelopa newanv)
    {
        for(int i = 0; i<Lista.size();i++)
        {
            if(i == index)
                Lista.set(i,newanv);
        }
    }
    public ArrayList<Anvelopa> getDisponibile()
    {
        ArrayList<Anvelopa> disponibile = new ArrayList<Anvelopa>();
        for(Anvelopa i:Lista)
        {
            if(i.getStocInitial() - i.getVandute() != 0)
                disponibile.add(i);
        }
        return disponibile;
    }

    public ArrayList<Anvelopa> getIndisponibile()
    {
        ArrayList<Anvelopa> indisp = new ArrayList<Anvelopa>();
        for(Anvelopa i:Lista)
        {
            if(i.getStocInitial() - i.getVandute() == 0)
            {
                indisp.add(i);
            }
        }
        return indisp;
    }

}
