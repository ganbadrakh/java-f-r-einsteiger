
public class Iface {

	public static void main(String[] args) {
		
		Fahrrad bmx = new Fahrrad(2, 30.00);
		
		System.out.println("Anzahl der Reifen: " + bmx.getReifen());
		System.out.println("Höchstegschwindigkeit: " + bmx.getGeschwindigkeit());
		
		bmx.setFarbe("Rot");
		System.out.println("Die neue Farbe ist: " + bmx.getFarbe());

	}

}
