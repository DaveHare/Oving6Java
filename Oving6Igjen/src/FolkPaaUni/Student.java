package FolkPaaUni;

import java.util.ArrayList;

public class Student extends Person {
	private String studieprogram;
	private int aarskurs;
	private ArrayList<Emne> listeMedEmner; 
	
	public Student(int id, String fnavn, String enavn, int faar, String studieprogram, int aarskurs, ArrayList<Emne> listeMedEmner) {
		super(id, fnavn, enavn,faar);
		this.studieprogram = studieprogram; 
		this.aarskurs = aarskurs; 
		this.listeMedEmner = listeMedEmner;
	}
	
	@Override public String toString() {
		return super.toString() + ". Studenten studerer: " + studieprogram +
				", arskurs: " + aarskurs + ", og har emnene: " + listeMedEmner.toString();
	}
	
	
	

}
