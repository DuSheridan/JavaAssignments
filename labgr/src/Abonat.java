public class Abonat {
    private int adresa;
    private String numePrenume;
    private int nrPersoane;

    public Abonat()
    {
        this.adresa = -1;
        this.numePrenume = "";
        this.nrPersoane = -1;
    }

    public Abonat(int adresa, String numePrenume, int nrPersoane) {
        this.adresa = adresa;
        this.numePrenume = numePrenume;
        this.nrPersoane = nrPersoane;
    }

    public int getAdresa() {
        return adresa;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setAdresa(int adresa) {
        this.adresa = adresa;
    }

    public void setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "Abonat{" +
                "adresa=" + adresa +
                ", numePrenume='" + numePrenume + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}

