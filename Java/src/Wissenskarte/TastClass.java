package Wissenskarte;

public class TastClass {

public static void main(String[] args) {
		
		Wissenskarten wissenskarte1 = new Wissenskarten();
		Wissenskarten wissenskarte2 = new Wissenskarten();
		Wissenskarten wissenskarte3 = new Wissenskarten();
		Wissenskarten wissenskarte4 = new Wissenskarten();
		Wissenskarten aktuelleWissenskarte = new Wissenskarten();
		List list = new List();
		ApplyInterface keyword = new AppendKeyWord();
		int size;
		
		
		
		wissenskarte1.setTitel("Immanuel Kant");
		wissenskarte1.setVorderseite("Deutscher Philosoph der Aufklärung");
		wissenskarte1.setRückseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		wissenskarte1.setFrage("In welchem Jahr wurde Immanuel Kant geboren?");
		wissenskarte1.setAntwort("1724");
		wissenskarte1.setSchlüsselwort("kant");
		wissenskarte1.setSchlüsselwort("1724");
		wissenskarte1.setSchlüsselwort("urteilskraft");
		wissenskarte1.setSchlüsselwort("philosoph");
		
		wissenskarte2.setTitel("Fabian Kunz");
		wissenskarte2.setVorderseite("Student an der TH Köln");
		wissenskarte2.setRückseite("Geboren 27.04.1995\nGeschlecht: Männlich");
		wissenskarte2.setFrage("Wie alt ist Fabian Kunz");
		wissenskarte2.setAntwort("21");
		wissenskarte2.setSchlüsselwort("fabian");
		wissenskarte2.setSchlüsselwort("kunz");
		wissenskarte2.setSchlüsselwort("männlich");
		wissenskarte2.setSchlüsselwort("1995");
	
		
		wissenskarte3.setTitel("AC/DC");
		wissenskarte3.setVorderseite("Australische hardrock Band");
		wissenskarte3.setRückseite("Gegründet 31 Dezember 1973");
		wissenskarte3.setFrage("aus welchem Land kommt AC/DC?");
		wissenskarte3.setAntwort("australien");
		wissenskarte2.setSchlüsselwort("australien");
		wissenskarte2.setSchlüsselwort("rock");
		wissenskarte2.setSchlüsselwort("1973");
		wissenskarte2.setSchlüsselwort("ac/dc");

		
		wissenskarte4.setTitel("Kölner Haie (KEC)");
		wissenskarte4.setVorderseite("Deutsche Eishockey Manschaft");
		wissenskarte4.setRückseite("seid 43 jahren in der Dutschen Eishockey Liga (DEL)\nGewonnene Meisterschaften: 8");
		wissenskarte4.setFrage("wie oft wurde der KEC Deutschermeister?");
		wissenskarte4.setAntwort("8");
		wissenskarte2.setSchlüsselwort("kec");
		wissenskarte2.setSchlüsselwort("del");
		wissenskarte2.setSchlüsselwort("meister");
		wissenskarte2.setSchlüsselwort("köln");
		
//		aktuelleWissenskarte = list.getFirst();
//		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		list.addFirst(wissenskarte1);
		list.addFirst(wissenskarte2);
		list.addFirst(wissenskarte3);
		list.addLast(wissenskarte4);
		
		aktuelleWissenskarte = list.getFirst();
		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		aktuelleWissenskarte = list.getLast();
		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		aktuelleWissenskarte = list.getWissenskarte(1);
		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		aktuelleWissenskarte = list.getWissenskarte("kant");
		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		list.applyForEach(keyword);
		
//		aktuelleWissenskarte = list.getWissenskarte("www");
//		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		size = list.size();
		System.out.println(size);
		
//		aktuelleWissenskarte = list.getWissenskarte(5);
//		System.out.println(aktuelleWissenskarte.getAktuelleseite());
		
		FlashCardEditor frame = new FlashCardEditor();
		frame.addKarte(wissenskarte1);
		frame.addKarte(wissenskarte2);
		frame.addKarte(wissenskarte3);
		frame.addKarte(wissenskarte4);
		
		
	}

}
