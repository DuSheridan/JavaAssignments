public class InformatiiConsum {
    private int adresa;
    private int luna;
    private String numePrenume;
    private int contorVechi;
    private int contorActual;


    public InformatiiConsum()
    {
        this.adresa = -1;
        this.luna = -1;
        this.numePrenume = "";
        this.contorVechi = -1;
        this.contorActual = -1;
    }
    public InformatiiConsum(int adresa, int luna, String numePrenume, int contorVechi, int contorActual) {
        this.adresa = adresa;
        this.luna = luna;
        this.numePrenume = numePrenume;
        this.contorVechi = contorVechi;
        this.contorActual = contorActual;
    }

    public int getAdresa() {
        return adresa;
    }

    public int getLuna() {
        return luna;
    }

    public String getNumePrenume() {
        return numePrenume;
    }

    public int getContorVechi() {
        return contorVechi;
    }

    public int getContorActual() {
        return contorActual;
    }

    public void setAdresa(int adresa) {
        this.adresa = adresa;
    }

    public void setLuna(int luna) {
        this.luna = luna;
    }

    public void setNumePrenume(String numePrenume) {
        this.numePrenume = numePrenume;
    }

    public void setContorVechi(int contorVechi) {
        this.contorVechi = contorVechi;
    }

    public void setContorActual(int contorActual) {
        this.contorActual = contorActual;
    }

    @Override
    public String toString() {
        return "InformatiiConsum{" +
                "adresa=" + adresa +
                ", luna=" + luna +
                ", numePrenume='" + numePrenume + '\'' +
                ", contorVechi=" + contorVechi +
                ", contorActual=" + contorActual +
                '}';
    }
}
