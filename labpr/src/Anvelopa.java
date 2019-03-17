
public class Anvelopa implements Comparable<Anvelopa>{
    private String Denumire;
    private String Tip;
    private int StocInitial;
    private int Vandute;
    private int PretUnit;

    public int compareTo(Anvelopa other)
    {
        return Denumire.compareTo(other.getDenumire());
    }

    public Anvelopa()
    {
        Denumire = "";
        Tip = "";
        StocInitial =0;
        Vandute = 0;
        PretUnit = 0;
    }
    public Anvelopa(String denumire, String tip, int stocInitial, int vandute, int pretUnit) {
        Denumire = denumire;
        Tip = tip;
        StocInitial = stocInitial;
        Vandute = vandute;
        PretUnit = pretUnit;
    }

    public Anvelopa(Anvelopa other)
    {
        Denumire = other.Denumire;
        Tip = other.Tip;
        StocInitial = other.StocInitial;
        Vandute = other.Vandute;
        PretUnit = other.PretUnit;
    }

    public String getDenumire() {
        return Denumire;
    }

    public String getTip() {
        return Tip;
    }

    public int getStocInitial() {
        return StocInitial;
    }

    public int getVandute() {
        return Vandute;
    }

    public int getPretUnit() {
        return PretUnit;
    }

    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public void setTip(String tip) {
        Tip = tip;
    }

    public void setStocInitial(int stocInitial) {
        StocInitial = stocInitial;
    }

    public void setVandute(int vandute) {
        Vandute = vandute;
    }

    public void setPretUnit(int pretUnit) {
        PretUnit = pretUnit;
    }

    @Override
    public String toString() {
        int disponibile = StocInitial - Vandute;
        return "Anvelopa{" +
                "Denumire='" + Denumire + '\'' +
                ", Tip='" + Tip + '\'' +
                ", Disponibile='" + disponibile +'\'' +
                ", PretUnit=" + PretUnit +
                '}';
    }

    public String toString2()
    {
        return "Anvelopa{" +
                "Denumire='" + Denumire + '\'' +
                ", Tip='" + Tip + '\'' +
                ", StocInitial=" + StocInitial +
                ", Vandute=" + Vandute +
                ", PretUnit=" + PretUnit +
                '}';
    }
}
