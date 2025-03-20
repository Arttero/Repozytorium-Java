package Tasks.Lab6.Figury;

public class Trojkat extends Figura {
	public double wys=0;
    public double podst=0;

	public Trojkat(double wys, double podst) {
		super();
		this.wys = wys;
		this.podst = podst;
	}

	//konstruktor przeciazony
	Trojkat(float wys, float podst, String kolor) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}
	
}