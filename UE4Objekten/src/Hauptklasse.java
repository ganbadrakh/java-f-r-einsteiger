/*
 * Stellt euch euer Traumhaus vor... Wie sieht es aus? Wie viele Zimmer hat es? Welche Extras bringt es mit sich?
Nun macht das gleiche mit einem Traumauto. Von welchem Hersteller ist das Auto? Wie viel PS hat es? Welche Farbe?

In dieser Übungsaufgabe möchte ich, dass ihr diese beiden Träume programmiert. Keine Sorge, ihr müsst keine 3D Modell davon erstellen. Zuerst einmal nur die Hauptmerkmale als Variablen.

Da wir in dieser Sektion jedoch Objekte, den Konstruktor und die Setter und Getter kennengelernt haben, möchte ich, dass ihr diese Weise verwendet.
Erstellt ein Java Projekt mit einer Klasse HauptKlasse mit der Main Methode
Erstellt danach zwei Klassen, die eine soll TraumHaus, die andere TraumAuto heißen.
Erstellt in den beiden Klassen jeweils einen Konstruktor, der die Informationen anzahlZimmer, farbe, extras beim TraumHaus und die Informationen marke, ps, farbe beim TraumAuto haben soll.
Erstellt innerhalb dieser beiden Klassen die nötigen Setter und Getter für alle drei Variablen. (jeweils 3 Stück)
Erstellt in der Main Methode eurer Hauptklasse ein Objekt dieser beiden Datentypen(TraumHaus und TraumAuto)
Verwendet println in der Hauptklasse um die Informationen die ihr eurem TraumHaus und TraumAuto gegeben habt auszugeben. Modifierziert bei Bedarf die Werte der einzelnen Objekte.
 */

public class Hauptklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraumHaus haus1 = new TraumHaus(5, "blau", "geheimen Bunker");
		TraumAuto auto1 = new TraumAuto("Bentley", "schwarz", 250);
		System.out.println("Mein Traumhaus hat " + haus1.getFarbe()+ "e Farbe und "+ haus1.getAnzahlZimmer() + " Zimmer und als Extra einen " + haus1.getExtras() + ".");
		auto1.setPs(340);
		System.out.println("Mein Traumauto hat " + auto1.getFarbe()+ "e Farbe und " + auto1.getPs() + " PS und die Marke " + auto1.getMarke() + ".");
	}

}
