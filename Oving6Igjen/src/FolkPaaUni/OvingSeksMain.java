package FolkPaaUni;

import java.util.ArrayList;


public class OvingSeksMain {
	
	public static String SkrivUtPersoner(ArrayList<Person> personer) {
		String personerIListen = "";
		for(int i = 0; i < personer.size(); i++) {
			personerIListen += personer.get(i).toString() + "\n\n"; 
		}
		return personerIListen; 
	}


	public static void main(String[] args) {
		
		ArrayList<Person> enListeMedFolk = new ArrayList<Person>(); 
		
		Person nils = new Person(3, "Nils", "Bohr", 1976); 
//		System.out.println(nils);
		enListeMedFolk.add(nils);
		
		Person Gustav = new Person(56, "Gustav", "Severin", 2000);
//		System.out.println(Gustav);
		enListeMedFolk.add(Gustav);
		
		
		Ansatt Ole = new Ansatt(5, "Ole", "Klem", 1956, 567, "Professor", 350000);
//		System.out.println(Ole);
		enListeMedFolk.add(Ole);
		
		Ansatt Birger = new Ansatt(67, "Birger", "Enoksen", 1978, 7689, "Laerer", 450000);
//		System.out.println(Birger);
		enListeMedFolk.add(Birger);
		
		ArrayList<Emne> listeMedEmner = new ArrayList<Emne>();
		listeMedEmner.add(new Emne("Dat100", "Java", 'V'));
		listeMedEmner.add(new Emne("Ex100", "Exphil", 'V'));
		listeMedEmner.add(new Emne("Mat100", "Mat metoder", 'V'));
//		System.out.println(listeMedEmner);
		
		ArrayList<Emne> listeMedEmnerTo = new ArrayList<Emne>(); 
		listeMedEmnerTo.add(new Emne("Fys100", "NewtonFysikk", 'H'));
		listeMedEmnerTo.add(new Emne("Dat200", "algdat", 'H'));
		listeMedEmnerTo.add(new Emne("Dat150", "Dataarkitektur", 'H'));
		listeMedEmnerTo.add(new Emne("Mat150", "Diskret matematikk", 'H'));
//		System.out.println(listeMedEmnerTo);
		
		
		Student Jens = new Student(234, "Jens", "Jenseberg", 1956, "Data", 18, listeMedEmner);
//		System.out.println(Jens);
		enListeMedFolk.add(Jens);
		
		Student David = new Student(666, "David", "Harestad", 1987, "Data", 18, listeMedEmnerTo);
//		System.out.println(David);
		enListeMedFolk.add(David);
		
		
		VitenskapeligAnsatt Olaf = new VitenskapeligAnsatt(4567, "Olaf", "Olafsen", 1978, 653, "Dekan", 500000, "Matematikk");
//		System.out.println(Olaf);
		enListeMedFolk.add(Olaf);
		VitenskapeligAnsatt Kristian = new VitenskapeligAnsatt(5684, "Kristian", "Balrog", 1969, 543, "Labsjef", 354000, "Elektronikk");
		enListeMedFolk.add(Kristian);
//		Lager to rom til teknisk ansatt: 
		Rom KE200 = new Rom('K', 1, 200, 450); 
		Rom KE250 = new Rom('K', 3, 250, 56);
		
		TekniskAnsatt Borge = new TekniskAnsatt(657, "Borge", "Roum", 1988, 4576, "Vaktmester", 600000, KE200);
//		System.out.println(Borge);
		enListeMedFolk.add(Borge);
		TekniskAnsatt Mons = new TekniskAnsatt(234, "Mons", "Monsen", 1956, 5567, "Renholder", 600000, KE250);
		enListeMedFolk.add(Mons);
		
		
		
		
		
		System.out.println();
		System.out.println(SkrivUtPersoner(enListeMedFolk));
		

	}

}
