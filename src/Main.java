public class Main {

    public static void main(String[] args) {
        System.out.print("Program 1 \n");
        Punkt punkt = new Punkt();                                                 //tworzenie obiektu o nazwie "punkt" z użyciem konstruktora domyśnego
        Punkt punkt1 = new Punkt(4);                                         //tworzenie obiektu o nazwie "punkt1" z użyciem konstruktora z parametrem

        System.out.println("wypisuję informacje na temat obiektu 'punkt'");
        punkt.opis();
        System.out.print( "\n" + "masa: " + punkt.getMasa() );
        System.out.print( "\n" + "główny moment bezwladności: " + punkt.momBez() );
        System.out.print( "\n" + "moment bezwladności ze steinera: " + punkt.momBezSt(2) );
        System.out.println("\n\nWypisuję informacje na temat obiektu 'punkt1'");
        punkt1.opis();
        System.out.print( "\n" + "masa: " + punkt1.getMasa() );
        System.out.print( "\n" + "główny moment bezwladności: " + punkt1.momBez() );
        System.out.print( "\n" + "moment bezwladności ze steinera: " + punkt1.momBezSt(2) );
        punkt.setMasa(6);                                                         //zmiana masy obiektu "punkt" za pomocą akcesora na wrtosc 6
        System.out.print("\n"+"\n"+"wartości po zmianie masy obiektu 'punkt' przy pomocy akcesora");
        punkt.opis();
        System.out.print( "\n" + "masa: " + punkt.getMasa() );
        System.out.print( "\n" + "główny moment bezwladności: " + punkt.momBez() );
        System.out.print( "\n" + "moment bezwladności ze steinera: " + punkt.momBezSt(3) );

        Punkt[] pkt = new Punkt [3];                                                  //deklasacja tablicy obiektów

        pkt[0] = new Punkt(7);                                                   //kolejne elementy tablicy
        pkt[1] = new Punkt(2);
        pkt[2] = new Punkt(5);

        for(int i=0 ;i<3; i++){                                                      //pętla do wyświetlania obiektór tablicy
            System.out.println("\n \nElement tablicy numer: " + i);
            pkt[1].opis();
            System.out.print("masa: " + pkt[i].getMasa());
            System.out.print("\n" + "główny moment bezwladności: " + pkt[i].momBez());
            System.out.print("\n" + "moment bezwladności ze steinera: " + pkt[i].momBezSt(2));
        }
        }
}
