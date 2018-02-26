package FolkPaaUni;

public class TekniskAnsatt extends Ansatt {
	private Rom etRom;
	
	public TekniskAnsatt(int id, String fnavn, String enavn, int faar, int ansattnummer, String stilling, int aarslonn, Rom etRomMAnsvar) {
		super(id, fnavn, enavn, faar, ansattnummer, stilling, aarslonn);
		this.etRom = etRomMAnsvar; 
	}
	
	@Override public String toString() {
		return super.toString() + ", pluss er ansvarlig for rom: " + etRom;
	}

}
