/* Erstelle zwei Methoden. Die eine Methode soll eine double als Rückggabewert haben und zwei double Variablen als Parameter haben. Diese Methode soll die Addition der beiden 
 * übergebenen Werte zurückgeben.

*Rufe diese erste Methode in der Main-Methode auf und übergib ihr zwei double Werte (Gleitkommazahlen).

*Die Zweite Methode soll keinen Rückgabewert haben, jedoch einen Parameter (lieblingswort) vom Datentypen String. Dabei soll die Methode den Text ausgeben: "Dein Lieblingswort 
*ist : " + lieblingswort

*Rufe diese Methode in der Main Methode auf und übergib ihr dein Lieblingswort in Anführungsstrichen als Argument.
*/

public class ZweiMethoden {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ersteZahl = 4000.56, zweiteZahl = 523.45;
		System.out.println(ersteMethode(ersteZahl, zweiteZahl));	
		zweiteMethode("Java " + ersteMethode(3.0, 4.6));
		
	}

	private static double ersteMethode(double ersteZahl, double zweiteZahl) {
		// TODO Auto-generated method stub
		return ersteZahl+zweiteZahl;
	}
	private static void zweiteMethode(String lieblingswort){
		System.out.println("Dein Lieblingswort ist: " + lieblingswort);
	}
}
