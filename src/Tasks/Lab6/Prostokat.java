package Tasks.Lab6;

class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		super();
		this.wys = wys;
		this.szer = szer;
			
	}

    double getPowierzchnia() {
        return (szer * wys);
    }
    
    
}