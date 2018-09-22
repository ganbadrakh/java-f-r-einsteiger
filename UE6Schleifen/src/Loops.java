/*
 * Erstelle einen Zähler der von 1 bis 10 zählt mit den verschiedenen Arten die in diesem Kapitel durchgenommen wurden. (for, do while, while Schleife)
 */

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++){
			System.out.println("For-Schleife: " + i);;
		}
		
		int i = 1;
		do {
			System.out.println("Do-While-Schleife: " +i);
			i++;
			}while(i<=10);
		
		int count = 1;
		while (count<=10){
			System.out.println("While-Schleife : " + count);
			count++;
		}
	}

}
