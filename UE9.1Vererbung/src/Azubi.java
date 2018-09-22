
public class Azubi extends Mitarbeiter {
	
	private int arbeitsstunden = 0;
	private int schulstunden;

	Azubi(String n, String v, double g, int as, int ss) {
		super(n, v, g);
		arbeitsstunden = as;
		schulstunden = ss;
	}
	
	public int getArbeitsstunden(){
		return arbeitsstunden;
	}
	
	public int getSchulstunden(){
		return schulstunden;
	}
	
	public String arbeiten(){
		return name + " " +vorname + " ist der neue Azubi in der Firma und hat " + arbeitsstunden +  " Arbeitsstunden und im Monat und bekommt dafür " + gehalt + "€."; 
	}
	public String lernen(){
		return name + " " +vorname + " ist der neue Azubi in der Firma und hat " + schulstunden + " Schulstunden im Monat."; 
	}
}
