/*
 * Erstellen Sie eine Klasse Handy, und zwei Subklassen Smartphone und Klapphandy.
Fügen Sie der Superklasse eine Methode anrufen() hinzu, die sie jeweils in den Subklassen überschreiben. Geben Sie dazu jeweils sinnvolle Ausgaben aus.
Erstellen Sie Objekte der einzelnen Klassen und rufen Sie die Methode anrufen jeweils auf um zu sehen, ob Ihr Code richtig funktioniert.
 */

public class Main {

	public static void main(String[] args) {
		
		Handy h1 = new Handy("Samsung S3", 4.7);
		Klapphandy k1 = new Klapphandy("LG V12", 3.2);
		Smartphone s1 = new Smartphone("Honor 7", 5.2);
		
		h1.anrufen();
		k1.anrufen();
		s1.anrufen();
		
		Handy h2 = new Smartphone("Xiaomi Note", 5.5);
		h2.anrufen();
		

	}

}
