
public class UniStudent extends Student{
	
	protected String forschung;
	
	UniStudent(String name, String matNr, int semester, int semesterwochenstunden, String skills, String forschung) {
		super(name, matNr, semester, semesterwochenstunden, skills);
		
		this.forschung = forschung;
	}
	
	public void forschen(){
		System.out.println("Ich forsche im Studium über " + forschung);
	}
}
