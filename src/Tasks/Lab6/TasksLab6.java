package Tasks.Lab6;

import Tasks.Lab6.Figury.Figura;
import Tasks.Lab6.Figury.Prostokat;
import Tasks.Lab6.Figury.Punkt;
import Tasks.Lab6.Figury.Trojkat;

public class TasksLab6 {
    Punkt punkt = new Punkt(5,8);
    Punkt punkt1 = new Punkt(3,6);
    Punkt punkt2 = new Punkt(8,11);


    public void Task01(){

        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("----------");
        punkt.przesuniecie(3,1);
        punkt1.przesuniecie(1,2);
        punkt2.przesuniecie(-2,-3);
        punkt.opis();
        punkt1.opis();
        punkt2.opis();

        System.out.println("\n9. Figura");
        Figura figura = new Figura("czewony");
        System.out.println(figura.opis());

        System.out.println("\n9. Prostokat");
        Prostokat prostokat = new Prostokat(5,6);
        System.out.println("Powierzchnia: "+prostokat.getPowierzchnia());

        System.out.println("\n9. Trojkat");
        Trojkat trojkat = new Trojkat(4,6);
        System.out.println("Wysokosc: "+trojkat.wys);
        System.out.println("Podstawa: "+trojkat.podst);

        System.out.println("\n15. Prostokat");
        Prostokat prostokat1 = new Prostokat(5,6);
        prostokat1.przesun(3,5);
        System.out.println("Lokalizacja po przesunieciu: ["+punkt.getX() + ", " + punkt.getY()+"]");


    }

    public void Task02(){

    }

    public void Task03(){

    }
}
