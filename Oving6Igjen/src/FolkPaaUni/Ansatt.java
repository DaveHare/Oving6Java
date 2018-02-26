package FolkPaaUni;

public class Ansatt extends Person {
	private int ansattnummer;
	private String stilling; 
	private int aarslonn; 
	
	public Ansatt(int id, String fnavn, String enavn, int faar, int ansattnummer,String stilling, int aarslonn) {
		super(id, fnavn, enavn,faar);
		this.ansattnummer = ansattnummer; 
		this.stilling = stilling;
		this.aarslonn = aarslonn; 
	}
	
	public Ansatt() {
	}
	
	public Ansatt(int id, String fnavn, String enavn, int faar) {
		super(id, fnavn, enavn,faar); 
	}
	
	
	@Override public String toString() {
		return super.toString() + ". Den ansatte har en ansattnummer som er: " + ansattnummer + 
				" en stilling som er " + stilling + " og en arslonn på " + aarslonn; 
		
	}
	
}
