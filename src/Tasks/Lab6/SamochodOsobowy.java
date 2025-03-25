package Tasks.Lab6;

public class SamochodOsobowy extends Samochod {
    float Waga; //2t - 4,5t
    float PojemnoscSilnika; //0.8 - 3.0
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor,
                           int rokProdukcji, int przebieg, float waga, float pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.Waga = waga;
        this.PojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }
}
