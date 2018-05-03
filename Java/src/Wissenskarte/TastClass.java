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
		wissenskarte1.setVorderseite("Deutscher Philosoph der Aufkl�rung");
		wissenskarte1.setR�ckseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		wissenskarte1.setFrage("In welchem Jahr wurde Immanuel Kant geboren?");
		wissenskarte1.setAntwort("1724");
		wissenskarte1.setSchl�sselwort("kant");
		wissenskarte1.setSchl�sselwort("1724");
		wissenskarte1.setSchl�sselwort("urteilskraft");
		wissenskarte1.setSchl�sselwort("philosoph");
		
		wissenskarte2.setTitel("Fabian Kunz");
		wissenskarte2.setVorderseite("Student an der TH K�ln");
		wissenskarte2.setR�ckseite("Geboren 27.04.1995\nGeschlecht: M�nnlich");
		wissenskarte2.setFrage("Wie alt ist Fabian Kunz");
		wissenskarte2.setAntwort("21");
		wissenskarte2.setSchl�sselwort("fabian");
		wissenskarte2.setSchl�sselwort("kunz");
		wissenskarte2.setSchl�sselwort("m�nnlich");
		wissenskarte2.setSchl�sselwort("1995");
	
		
		wissenskarte3.setTitel("AC/DC");
		wissenskarte3.setVorderseite("Australische hardrock Band");
		wissenskarte3.setR�ckseite("Gegr�ndet 31 Dezember 1973");
		wissenskarte3.setFrage("aus welchem Land kommt AC/DC?");
		wissenskarte3.setAntwort("australien");
		wissenskarte2.setSchl�sselwort("australien");
		wissenskarte2.setSchl�sselwort("rock");
		wissenskarte2.setSchl�sselwort("1973");
		wissenskarte2.setSchl�sselwort("ac/dc");

		
		wissenskarte4.setTitel("K�lner Haie (KEC)");
		wissenskarte4.setVorderseite("Deutsche Eishockey Manschaft");
		wissenskarte4.setR�ckseite("seid 43 jahren in der Dutschen Eishockey Liga (DEL)\nGewonnene Meisterschaften: 8");
		wissenskarte4.setFrage("wie oft wurde der KEC Deutschermeister?");
		wissenskarte4.setAntwort("8");
		wissenskarte2.setSchl�sselwort("kec");
		wissenskarte2.setSchl�sselwort("del");
		wissenskarte2.setSchl�sselwort("meister");
		wissenskarte2.setSchl�sselwort("k�ln");
		
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
