import java.util.ArrayList;

public class RepoAbonati {
    private ArrayList<Abonat> Abonati;

    public RepoAbonati(ArrayList<Abonat> abonati) {
        Abonati = abonati;
    }

    public ArrayList<Abonat> getAll()
    {
        return Abonati;
    }


    public void addAbonat(Abonat abonatNou)
    {
        this.Abonati.add(abonatNou);
    }

    public Abonat getAbonat(int adresa)
    {
        for(Abonat i: Abonati)
        {
            if(i.getAdresa()==adresa)
                return i;
        }
        return new Abonat();
    }

    public void setAbonat(int adresa, Abonat ab)
    {
        for(int i=0;i<Abonati.size();i++)
        {
            if(Abonati.get(i).getAdresa()== adresa)
                Abonati.set(i,ab);
        }
    }

    public void deleteAbonat(int adresa)
    {
        for(int i=0;i<Abonati.size(); i++)
        {
            if(Abonati.get(i).getAdresa()== adresa)
                Abonati.remove(i);
        }
    }

}

