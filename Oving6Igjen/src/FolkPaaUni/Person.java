package FolkPaaUni;

public class Person {

	private int ID; 
	private String fornavn;
	private String etternavn;
	private int fodselsaar;
	
	public Person(int id, String fnavn,String enavn, int faar) {
		ID = id;
		fornavn = fnavn; 
		etternavn = enavn; 
		fodselsaar = faar; 
	}
	
	public Person() {	
	}
	
	
	public int getId() {
		return ID; 
	}
	public String getFnavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn; 
	}
	public int getFaar() {
		return fodselsaar; 
	}
	public  void setID( int nyID) {
		ID = nyID; 
	}
	public void setFaar(int nyttFAar) {
		fodselsaar = nyttFAar;
	}
	
	public String toString() {
		return "Navnet til personen med id "+ ID + " er " + fornavn + " " + etternavn +" og fodselsaaret er "+ fodselsaar;
	}
	
	public static void main(String [] args) {
		Person david = new Person(5, "David", "Harestad", 1987);
		System.out.println(david.toString());
		david.setFaar(1988);
		System.out.println(david.toString());
	} 
	
}