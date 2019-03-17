import java.util.ArrayList;

public class RepoInformatii {
    private ArrayList<InformatiiConsum> Informatii;

    public RepoInformatii(ArrayList<InformatiiConsum> informatii) {
        Informatii = informatii;
    }

    public ArrayList<InformatiiConsum> getAllPerAbonat(int adresa)
    {
        ArrayList<InformatiiConsum> hallo = new ArrayList<InformatiiConsum>();

        for(InformatiiConsum i : Informatii)
        {
            if(i.getAdresa() == adresa)
                hallo.add(i);
        }

        return hallo;

    }

    public ArrayList<InformatiiConsum> getAll()
    {
        return Informatii;
    }

    public void addInformatie(InformatiiConsum informatieNoua)
    {
        this.Informatii.add(informatieNoua);
    }

    public InformatiiConsum getInformatie(int adresa, int luna)
    {
        for (InformatiiConsum i : Informatii)
        {
            if (i.getAdresa() == adresa && i.getLuna() == luna)
                return i;
        }
        return new InformatiiConsum();

    }

    public void setInformatie(int adresa, int luna, InformatiiConsum Info)
    {
        for(int i = 0; i<Informatii.size();i++)
        {
            if(Informatii.get(i).getAdresa() == adresa && Informatii.get(i).getLuna() == luna)
            {
                Informatii.set(i,Info);
            }
        }
    }

    public void deleteInformatii(int adresa,int luna)
    {
        for(int i=0;i<Informatii.size();i++)
        {
            if(Informatii.get(i).getAdresa() == adresa && Informatii.get(i).getLuna()== luna)
            {
                Informatii.remove(i);
            }
        }
    }





}
