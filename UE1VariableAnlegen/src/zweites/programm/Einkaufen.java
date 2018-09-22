/**
 * Paul's Vater ist faul. Er hat es zwar geschafft einkaufen zu gehen , jedoch hat er den Kassenbelege verloren und vergessen wie viel er bezahlt hat. Abgesehen davon, dass 
Paul's Mutter nicht damit einverstanden ist, was er gekauft hat, ist sie schrecklich sauer auf den vergesslichen Vater, weil sie nun nicht weiss ob er mehr ausgegeben hat als 
Haushaltsgeld für die Woche vorhanden ist.

Der Vater möchte nun, dass Paul zusammenrechnet wie viel Geld er ausgegeben hat. Paul rundest alle Produkte auf, weil er es im Moment nicht besser weiß und es auf den Cent ja 
eh nicht ankommt. Seine Mutter hat für diese Woche noch 40 € zur Verfügung. Auf den Produkten liest er die Preise ab. Sein Vater hat sich Schokolade für 5 € (natürlich die gute) 
gekauft, einen Kasten Bier für’s Fußballspiel am Wochenende für 20 € und für 16 € 2 Paar Schuheinlagen wegen der Plattfüße seines Vaters.

Da Paul nicht im Geringsten einsieht sein Gehirn für diesen Unsinn einzuschalten, entscheidet er sich ein Programm zu schreiben, das die Summe des Einkaufs ausgibt, und optional
auch ausrechnet wie viel vom Haushaltsgeld noch übrig ist. Hilf Paul das Programm zu schreiben.

Lege im Rumpf deiner Main-Funktion 3 Variablen vom Typen Integer an mit den Namen schokolade, kastenBier und schuhEinlagn. Weise ihnen ihren jeweiligen Wert zu (ohne die € Zeichen) 
und nenne die Klasse “Einkaufen”
Lege eine dritte Variable mit dem Namen ergebnisEinkauf an.
Weise ergebnis" die Summe der drei zuvor angelegten Variablen zu indem du sie addierst (NICHT die Zahlen nutzen).Drucke in die Konsole den Satz “Der Einkauf kostet [ERGEBNIS]“, 
wobei [ERGEBNIS] die endgültige Summe von ergebnisEinkauf als Zahl darstellt.
 * 
 * @author cerberus
 *
 */

package zweites.programm;

public class Einkaufen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int schokolade = 5, kastenBier = 20, schuhEinlagen = 16, ergebnisEinkauf;
		ergebnisEinkauf = schokolade + kastenBier + schuhEinlagen;
		System.out.println("Der Einkauf kostet " + ergebnisEinkauf + "€"+".");
		int haushaltsGeld = 40;
		int endgueltigesHaushaltsGeld = haushaltsGeld - ergebnisEinkauf;
		System.out.println("Das Haushaltsgeld beträgt nun " + endgueltigesHaushaltsGeld + "€"+".");
	}

}
