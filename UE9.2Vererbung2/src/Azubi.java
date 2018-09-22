
public class Azubi  extends Mitarbeiter {
	
	private int arbeitsstunden = 0, schulstunden = 0;
	
	Azubi(String name, String vorname, double gehalt, int arbeitsstunden, int schulstunden) {
		super(name, vorname, gehalt);
		
		this.arbeitsstunden = arbeitsstunden;
		this.schulstunden = schulstunden;
	}
	
	public void arbeiten(){
		System.out.println(name + " " + vorname + " arbeitet " + arbeitsstunden + " Stunden in der Woche.");
	}
	
	public void lernen(){
		System.out.println(name + " " + vorname + " lernt " + schulstunden + " Stunden in der Woche.");
	}
	
	public void arbeiten(int arbeitsstunden){
		System.out.println(name + " " + vorname + " arbeitet " + arbeitsstunden + " Stunden im Monat.");
	}

}
