package FolkPaaUni;

public class VitenskapeligAnsatt extends Ansatt {
	public String fagfelt; 
	
	public VitenskapeligAnsatt(int id, String fnavn, String enavn, int faar, int ansattnummer,String stilling, int aarslonn, String fagfelt) {
		super(id, fnavn,  enavn,  faar,  ansattnummer, stilling, aarslonn);
		this.fagfelt = fagfelt; 
	}
	
	@Override public String toString() {
		return super.toString() + ", pluss et fagfelt som er: " + fagfelt; 
	}

}
