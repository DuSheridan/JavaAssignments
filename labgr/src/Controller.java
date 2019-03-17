import java.util.ArrayList;

public class Controller {

    private RepoInformatii RepoInfo;
    private RepoAbonati RepoAbo;

    public Controller(RepoInformatii RepoInfo, RepoAbonati RepoAbo)
    {
        this.RepoInfo = RepoInfo;
        this.RepoAbo =RepoAbo;
    }

    public ArrayList<InformatiiConsum> getAllInformatiiPerAbonat(int adresa)
    {
        return RepoInfo.getAllPerAbonat(adresa);
    }

    public ArrayList<InformatiiConsum> getAllInformatii()
    {
        return RepoInfo.getAll();
    }

    public void addInformatie(int adresa, int luna, String numePrenume, int contorVechi, int contorActual)
    {
        InformatiiConsum informatieNoua = new InformatiiConsum(adresa, luna, numePrenume, contorVechi, contorActual);
        RepoInfo.addInformatie(informatieNoua);
    }

    public InformatiiConsum getInformatie(int adresa,int luna)
    {
        return RepoInfo.getInformatie(adresa,luna);
    }

    public void setInformatie(int adresa, int luna, int adresaNoua, int lunaNoua, String numePrenumeNou, int contorVechiNou, int contorActualNou)
    {
        InformatiiConsum informatieNoua = new InformatiiConsum(adresaNoua,lunaNoua,numePrenumeNou,contorVechiNou,contorActualNou);
        RepoInfo.setInformatie(adresa,luna,informatieNoua);
    }

    public void deleteInformatie(int adresa,int luna)
    {
        RepoInfo.deleteInformatii(adresa, luna);
    }

    public ArrayList<Abonat> getAllAbonati()
    {
        return RepoAbo.getAll();
    }

    public void addAbonat(int adresa, String numePrenume, int nrPersoane)//NNNNNNNNNNNNNNNNNNNNNN
    {
        Abonat abonatNou = new Abonat(adresa, numePrenume, nrPersoane);
        RepoAbo.addAbonat(abonatNou);
    }

    public Abonat getAbonat(int adresa)
    {
        return RepoAbo.getAbonat(adresa);
    }

    public void setAbonat(int adresa,int adresaNou, String numePrenumeNou, int nrPersoaneNou)//mmmmmmmmmmmmmmmmmmmmmmmMMMMMMMMMMMMMMM
    {
        Abonat abonatNou = new Abonat(adresaNou,numePrenumeNou,nrPersoaneNou);
        RepoAbo.setAbonat(adresa, abonatNou);
    }

    public void deleteAbonat(int adresa)
    {
        RepoAbo.deleteAbonat(adresa);
    }

}
