
public class CollegeStudent extends Student {
	
	private String ausbildung;
	
	CollegeStudent(String name, String matNr, int semester, int semesterwochenstunden, String skills, String ausbildung) {
		super(name, matNr, semester, semesterwochenstunden, skills);
		
		this.ausbildung = ausbildung;
	}
	
	public void ausbilden(){
		System.out.println("ich mache Ausbildung im Bereich " + ausbildung);
	}

}
