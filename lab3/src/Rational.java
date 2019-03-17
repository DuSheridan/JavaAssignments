import java.lang.Math;

//Desc:Clasa Rational

public class Rational {
    int numarator = 0;
    int numitor = 1;

    //Desc:Constructor explicit
    //In:2 valori int, reprezentand numaratorul si numitorul
    //Out:Obiect de tip Rational

    public Rational(int numarator, int numitor) {
        if(numitor == 0)
        {
            System.out.println("Numitorul nu poate fi 0");
            numitor = 1;
        }
        this.numarator = numarator;
        this.numitor = numitor;
        simplifica();
    }

    public int getNumarator() {
        return numarator;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
        simplifica();
    }

    public void setNumitor(int numitor) {
        if(numitor == 0)
        {
            System.out.println("Numitorul nu poate fi 0");
            numitor = 1;
        }
        this.numitor = numitor;
        simplifica();
    }

    //Desc:Verifica daca un numar rational este intreg sau nu
    //In:Obiectul Rational
    //Out:Boolean, este intreg = true, nu este = false

    public boolean esteIntreg()
    {
        if(numitor == 1)
        {
            return true;
        }
        return false;
    }

    //Desc:Simplifica numarul rational(fractia) in termeni ireductibili
    //In:Obiectul Rational
    //Out:Obiectul Rational, in forma ireductibila

    public void simplifica()
    {
        if(numarator == 0) {
            numitor = 1;
            return;
        }
        int aux;
        int x = Math.abs(numarator);
        int y = Math.abs(numitor);
        while(y != 0)
        {
            aux = x;
            x = y;
            y = aux % y;
        }
        if(numitor < 0)
        {
            numarator = -numarator;
            numitor = -numitor;
        }
        numarator = numarator / x;
        numitor = numitor / x;
    }

    //Desc:Converteste campurile obiectului Rational la string
    //In:Obiectul Rational
    //Out:String-ul lui asociat

    public String toString()
    {
        return (numarator +"/"+ numitor);
    }
}

