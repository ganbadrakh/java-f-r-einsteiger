
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Max Plankton", "a1234567", 1, 20, "Java");
		FHStudent fhs1 = new FHStudent("Steve Jones", "fh745241", 3, 30, "Programmiersprachen: Java und C++.", "Webentwickler");
		UniStudent unis1 = new UniStudent("Dmitri Petrovich", "a0742333", 5, 25, "Astronomiekenntnisse", "Stringtheorie");
		CollegeStudent cos1 = new CollegeStudent("Eva Mariucs", "bc234586", 2, 22, "Bilanzpraxis", "Online Handel");
		s1.infoAnzeigen();
		fhs1.infoAnzeigen();
		unis1.infoAnzeigen();
		cos1.infoAnzeigen();
		s1.aneignen();
		fhs1.arbeiten();
		unis1.forschen();
		cos1.ausbilden();
		
		Student dieStudis[] = new Student[3];
		dieStudis[0] = new FHStudent("Carina Gadenstetter", "fh12345", 1, 18, "Malen", "Kellner");
		dieStudis[1] = new UniStudent("Özil Gülen", "a12345", 2, 15, "Soziologieforschung", "Soziopathen");
		dieStudis[2] = new CollegeStudent("Manuel Neuer", "bc12345", 3, 13, "Physik", "Maschinenbau");
		
		dieStudis[2].infoAnzeigen();
		dieStudis[2].aneignen();
		//dieStudis[0]= s1;
		Student s2 = new FHStudent("Paul Panzer", "mat123", 16, 26, "film anschauen", "Faulenzer");
		s2.lernen();
		((FHStudent) s2).arbeiten();
	
		
		for(int i = 0; i < dieStudis.length; i++){
			dieStudis[i].infoAnzeigen();
		}
		//dieStudis[1] = unis1;
		//unis1.forschen();
		
		unis1 = (UniStudent) dieStudis[1];
		unis1.forschen();
		
	}

}
