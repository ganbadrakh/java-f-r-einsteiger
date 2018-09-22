
public abstract class Reparierbar {
	boolean istRepariebar = false;
	
	public void wirdRepariert(){
		this.istRepariebar = true;
	}
	
	public abstract void setFarbe(String farbe);
	
	public abstract String getFarbe();
}
