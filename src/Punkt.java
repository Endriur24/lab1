public class Punkt {
    //zmienne
    private int masa;
    //konstruktory
    public Punkt() { this.masa=1; }                                       //konstruktor domyślny ustawiający masę na 1
    public Punkt(int masa)
    {
        setMasa(masa);
    }                             //konstruktor z parametrem
    //metody
    public int momBez()                                                 //moment bezwładności
    {
        int i = 0;
        return i;

    }
    public int momBezSt(int x)                                          //moment bezwładność z twierdzenia steinera
    {
        return momBez() + getMasa()*x*x;

    }
    public void opis()
    {
        System.out.println("Punkt Materialny");
    }          //metoda zwracająca opis

    //akcesory
    public void setMasa(int masa)                                           //akcesor służący do zmiany masy
    {
        if(masa >0)
        {
            this.masa = masa;
            return;
        }
        else
        {
            System.out.println("Podana bledna mase, ustawiono domyslna wartosc 1 ");
            this.masa = 1;
        }
    }
    public int getMasa()
    {
        return this.masa;
    }                               //zwraca masę
}
