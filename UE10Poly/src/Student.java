
public class Student {
	
	String name;
	String matNr;
	int semester;
	int semesterwochenstunden;
	String skills;
	
	Student(String name, String matNr, int semester, int semesterwochenstunden, String skills){
		this.name = name;
		this.matNr = matNr;
		this.semester = semester;
		this.semesterwochenstunden = semesterwochenstunden;
		this.skills = skills;		
	}
	
	public void infoAnzeigen(){
		System.out.println("Name: " + name + " MatNr: " + matNr + " Semester: " + semester);
	}
	
	public void lernen(){
		System.out.println("Ich lerne ca. " + semesterwochenstunden + " SWS.");
	}
	
	public void aneignen(){
		System.out.println("Ich kann unter anderem " + skills);
	}
}
