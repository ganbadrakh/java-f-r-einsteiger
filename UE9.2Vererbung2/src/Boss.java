
public class Boss extends Mitarbeiter {
	
	private String firmenwagen;
	
	Boss(String name, String vorname, double gehalt, String firmenwagen) {
		super(name, vorname, gehalt);
		
		this.firmenwagen = firmenwagen;
	}
	
	public void fuehren(){
		System.out.println(name + " " +vorname + " ist der Boss der Firma und hat als Firmenwagen einen " + firmenwagen + ".");
	}

}
