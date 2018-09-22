/* Wir haben hart gearbeitet und das Geld häuft sich auf unserem Konto. Nun möchten wir gerne wissen, wie viel Geld wir auf unserem Konto in einigen Jahren haben werden.

Erstellt ein Java Projekt mit der Hauptklasse und der Main Methode.
Erstellt die Variablen: grundbetrag, zinssatz, jahre, endbetrag. Achtet auf den Datentypen.
Importiert die Scanner Klasse und fragt den Nutzer jeweils nach den Werten von grundbetrag, zinssatz und jahre. Weist die Werte den Variablen zu.
Verwendet zur berechnung des Wertes endbetrag die folgende Zeile code: endbetrag = grundbetrag*(Math.pow((1+zinssatz/100),jahre));
Gebt den Endbetrag aus.
 
 */

import java.util.Scanner;

public class Zinsen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grundbetrag, zinssatz, endbetrag;
		int jahre;
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Geben Sie den Grundbetrag als double-Wert ein: ");
		grundbetrag = eingabe.nextDouble();
		System.out.println("Geben Sie den Zinssatz als double-Wert ein: ");
		zinssatz = eingabe.nextDouble();
		System.out.println("Geben Sie die Jahre als int-Wert ein: ");
		jahre = eingabe.nextInt();
		eingabe.close();
		
		endbetrag = grundbetrag*(Math.pow((1+zinssatz/100), jahre));
		System.out.println("Endbetrag auf dem Konto ist nach " + jahre +" Jahren " + endbetrag + ".");
	}

}
