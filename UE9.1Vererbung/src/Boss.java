
public class Boss extends Mitarbeiter {
	
	private String firmenwagen;

	Boss(String n, String v, double g, String fw) {
		super(n, v, g);
		firmenwagen = fw;
	}
	
	public String getFirmenwagen(){
		return firmenwagen;
	}
	
	String fuehren(){
		return name + " " +vorname + " ist der Boss der Firma und hat als Firmenwagen einen " + firmenwagen + " bekommt " + gehalt + "€ pro Monat."; 
	}

}
