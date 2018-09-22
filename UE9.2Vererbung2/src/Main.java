/*
 * Erstellen Sie eine Hauptklasse mit der Main Methode, dann eine Superklasse Mitarbeiter mit den Attributen(Variablen) name, vorname, gehalt und den Methoden arbeiten(), 
 * pausieren().
Erstellen sie eine Subklasse Boss mit dem Attribut firmenwagen und der Methode fuehren().
Erstellen Sie eine weitere Subklasse von Mitarbeiter - Azubi mit den Attributen arbeitsstunden und schulstunden und weiterhin der Methode lernen();
Überschreiben Sie die Methoden arbeiten() der Azubi Klasse, sodass sie die Arbeitsstunden des Azubi angibt.
Vergessen sie nicht die Konstruktoren zu erstellen.
Erstellen sie ein Objekt von jeder der drei Klassen und geben Sie die Methoden fuehren() von Boss und arbeiten () von Azubi aus.

Gib einfach den jeweiligen Text aus, was die jeweiligen Mitarbeiter machen.
 */

public class Main {

	public static void main(String[] args) {
		Mitarbeiter m1 = new Mitarbeiter("Dmitri", "Gluchowski", 3450);
		Boss b1 = new Boss("Isaac", "Clarke", 3700.50, "BMW 6");
		Azubi a1 = new Azubi("Ellie", "Langford", 1200, 32, 8);
		b1.infoAnzeigen();
		b1.arbeiten();
		m1.arbeiten(); 
		b1.pausieren();
		b1.fuehren();
		a1.arbeiten();
		a1.lernen();
		a1.infoAnzeigen();
		a1.arbeiten(128);
		//System.out.println(m1.name);

	}

}
