
public class Mitarbeiter {
	
	protected String name;
	protected String vorname;
	protected double gehalt;
	
	Mitarbeiter(String name, String vorname, double gehalt){
		this.name = name;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	public void infoAnzeigen(){
		System.out.println(name + " " + vorname + " arbeitet in einer Firma und bekommt " + gehalt + "€ als Monatsgehalt.");
	}
	
	public void arbeiten(){
		System.out.println(name + " " + vorname + " arbeitet.");
	}
	
	public void pausieren(){
		System.out.println(name + " " + vorname + " macht Pause.");
	}
}
