package Tasks;

public class Student {
    private Osoba osoba;
    private int nr_indeksu;
    private String specjalnosc;
    private int rok_studiow;
    
    public Student(Osoba osoba, int nr_indeksu, String specjalnosc, int rok_studiow) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = rok_studiow;
    }
    
    public Student(Osoba osoba, int nr_indeksu, String specjalnosc) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = 1;
    }
    
    public Student(Osoba osoba, int nr_indeksu) {
        this.osoba = osoba;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = "Brak danych";
        this.rok_studiow = 1;
    }
    
    public Student(Osoba osoba) {
        this.osoba = osoba;
        this.nr_indeksu = 0;
        this.specjalnosc = "Brak danych";
        this.rok_studiow = 0;
    }
    
    public void pokazDane(){
        osoba.pokazDane();
        System.out.println("Nr indeksu: "+ (nr_indeksu != 0 ? nr_indeksu : "brak danych"));
        System.out.println("Specjalnosc: "+ (specjalnosc != "Brak danych" ? specjalnosc : "brak danych"));
        System.out.println("Rok studiow: "+ rok_studiow);
        System.out.println("-------");
    }
}
