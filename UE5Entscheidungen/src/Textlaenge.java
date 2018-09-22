/*
 * Erstellen Sie eine Methode die den Nutzer nach einer Eingabe fragt. Verwenden Sie If und Else-if dazu bei folgenden Bedingungen den jeweiligen Text auszugeben.

Sofern Eingabe kürzer als 10 Zeichen ist - "Zu faul?"

Sofern Eingabe zwischen 10 und 15 Zeichen ist - "10-15 Zeichen Lang"

Sofern Eingabe länger als 15 Zeichen ist - "Langer Text".

Um zu bestimmten wie lang der Text ist, können Sie die Methode .length der String Klasse verwenden.
D.h. String textLaenge...

textLaenge.length() - dies gibt einen int Wert aus, den Sie bei der Abfrage verwenden können.

 */
import java.util.Scanner;

public class Textlaenge {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dieLaenge();
	}
	public static void dieLaenge(){
		
	Scanner eingabe =  new Scanner(System.in);
	System.out.println("Geben Sie beliebig lange Text ein: ");
	String text = eingabe.nextLine();
	eingabe.close();
	
	if(text.length()<10){
		System.out.println("Zu faul? ");
	}
	else if(text.length()<16 && text.length()>10){
		System.out.println("10-15 Zeichen lang");
	}
	else{
		System.out.println("Langer Text und zwar um genau zu sein " + text.length() + " Zeichen hast du geschrieben.");
	}
	
	}

}
