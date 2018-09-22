
public class Fahrrad extends Reparierbar implements Nutzbar{
	
	int anzahlReifen = 2;
	double geschwindigkeit = 50.0;
	String farbe = "schwarz";
	
	Fahrrad(int reifen, double geschw){
		this.anzahlReifen = reifen;
		this.geschwindigkeit = geschw;
	}
	
	@Override
	public int getReifen() {
		return this.anzahlReifen;
	}

	@Override
	public void setReifen(int anzahlReifen) {
		this.anzahlReifen = anzahlReifen;
		
	}

	@Override
	public double getGeschwindigkeit() {
		return this.geschwindigkeit;
	}

	@Override
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
		
	}
	
	public void setFarbe(String farbe){
		this.farbe = farbe;
	}
	
	public String getFarbe(){
		return this.farbe;
	}

}
