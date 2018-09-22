
public class TraumHaus {

	int anzahlZimmer;
	String farbe;
	String extras;
	
	TraumHaus(int anzahlZimmer, String farbe, String extras){
		this.anzahlZimmer = anzahlZimmer;
		this.farbe = farbe;
		this.extras = extras;
	}
	
	public int getAnzahlZimmer() {
		return anzahlZimmer;
	}
	
	public void setAnzahlZimmer(int anzahlZimmer) {
		this.anzahlZimmer = anzahlZimmer;
	}
	
	public String getFarbe() {
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String getExtras() {
		return extras;
	}
	
	public void setExtras(String extras) {
		this.extras = extras;
	}	

}
