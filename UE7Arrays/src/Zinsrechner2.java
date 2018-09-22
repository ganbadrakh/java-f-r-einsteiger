/*
 * Für diese Übungsaufgabe Modifizieren wir den Code aus der Übungsaufgabe zu Input und Output - Simpler Zinsrechner.

Legt dazu einen Array jahresWert an der eine unbestimmte Anzahl an Elementen tragen können soll.
Fügt in die Schleife ein, dass der Wert von grundbetrag für jedes Jahr in ein Element eingtragen wird. D.h. in Jahr 0(Element 0 des Arrays) ist jahresWert = grundbetrag. 
In Jahr 1(Element 1 des Arrays) ist jahreswert = grundbetrag*(1+zins/100)
 */

import java.util.Scanner;

public class Zinsrechner2 {

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
		
		double[] jahresWert = new double[jahre];
		for(int i=0; i<jahre;i++){
			jahresWert[i] = grundbetrag;
			grundbetrag = grundbetrag*(1+zinssatz/100);
			System.out.println("Jahreswert für Jahr " + i + " ist " + jahresWert[i]);	
		}
		endbetrag = grundbetrag;
		System.out.println("Der Betrag auf dem Konto nach " + jahre + " Jahren ist " + endbetrag);
	}

}
