
public class Mitarbeiter {

		protected String name;
		protected String vorname;
		protected double gehalt;
		
		Mitarbeiter (String n, String v, double g){
			name = n;
			vorname = v;
			gehalt = g;
		}
		
		public String getName(){
			return name;
		}
		//this.name = name;
		
		public String getVorname(){
			return vorname;
		}
		
		public double getGehalt(){
			return gehalt;
		}
		
		public String arbeiten(){
			return name + " " + vorname + " ist ein Mitarbeiter und arbeitet im Büro und bekommt pro Monat " + gehalt + "€.";
		}
		//public void arbeiten(){
		//	System.out.println(name + " " + vorname + " ist ein Mitarbeiter und arbeitet im Büro und bekommt pro Monat " + gehalt + "€.");
		//}
		
		public String pausieren(){
			return name + " " + vorname + " macht jetzt Pause.";
		}

}
