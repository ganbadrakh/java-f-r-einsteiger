/*
 * Erstellen Sie mit einer for-Schleife eine Arraylist, die die Zahlen 0,10,20,30... bis 1000 enthält.

Lassen Sie sich alle Elemente ausgeben,

- einmal mit einer foreach-Schleife.

Fragen Sie mit Hilfe einr If-Abfrage ob die Zahl 50 in der Arrayliste Vorhanden ist und geben sie in diesem Fall einen Text aus, der aussagt:

"Die 50 ist vorhanden!".

Wenn nicht, dann soll ausgegeben werden: "Die 50 ist nicht vorhanden!"
 */

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
				
		ArrayList<Integer> zahlenListe = new ArrayList<Integer>();
		for(int i=0; i < 1001; i=i+10){
			zahlenListe.add(i);
		for (Integer elem : zahlenListe)	
			System.out.println(elem);
		}
		if(zahlenListe.contains(50)){
			System.out.println("Die 50 ist vorhanden!");
		}else{
			System.out.println("Die 50 ist nicht vorhanden!");
		}
			
	}

}
