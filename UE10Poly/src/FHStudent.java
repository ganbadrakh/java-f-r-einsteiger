
public class FHStudent extends Student {

	private String nebenjob;

	FHStudent(String name, String matNr, int semester, int semesterwochenstunden, String skills, String nebenjob) {
		super(name, matNr, semester, semesterwochenstunden, skills);

		this.nebenjob = nebenjob;
	}
	public void arbeiten(){
		System.out.println("Ich, " + name + " arbeite nebenbei als " + nebenjob + ".");
	}
}
