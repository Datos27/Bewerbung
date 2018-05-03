package Wissenskarte;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Wissenskarte.Wissenskarten;


public class WissenskartenOrdner {
	private static Scanner in;
	
	
	public static void main(String[] args){
		
		in = new Scanner(System.in);
		
		ArrayList<String[]> schl�sselw�rter = new ArrayList<String[]>();
		ArrayList<Wissenskarten> wissenskartenliste = new ArrayList<Wissenskarten>();
		List list = new List();
		Wissenskarten wissenskarte1 = new Wissenskarten();
		Wissenskarten wissenskarte2 = new Wissenskarten();
		Wissenskarten wissenskarte3 = new Wissenskarten();
		Wissenskarten wissenskarte4 = new Wissenskarten();
		Wissenskarten wissenskarte5 = new Wissenskarten();
		Wissenskarten aktuelleWissenskarte = new Wissenskarten();
		Lernkarte neueLernkarte = new Lernkarte();
		
		
		
		FlashCardEditor frame = new FlashCardEditor();
		
		
		
		
		neueLernkarte.setTitel("Immanuel Kant");
		neueLernkarte.setVorderseite("Deutscher Philosoph der Aufkl�rung");
		neueLernkarte.setR�ckseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		String frage = "In welchem Jahr wurde Immanuel Kant geboren?";
		String antwort = "1724";
		neueLernkarte.addfrage(frage, antwort);
		String frage1 = "blabliblub?";
		String antwort1 = "jops!";
		neueLernkarte.addfrage(frage1, antwort1);
		String [] schl�sselwort0 = {"kant2", "philosoph2", "urteilskraft2", "17242"};
//		neueLernkarte.setSchl�sselwort(schl�sselwort0);
		boolean z = false;
//		wissenskartenliste.add(neueLernkarte);

		
		
		wissenskarte1.setTitel("Immanuel Kant");
		wissenskarte1.setVorderseite("Deutscher Philosoph der Aufkl�rung");
		wissenskarte1.setR�ckseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		wissenskarte1.setFrage("In welchem Jahr wurde Immanuel Kant geboren?");
		wissenskarte1.setAntwort("1724");
		wissenskarte1.setSchl�sselwort("kant");
		wissenskarte1.setSchl�sselwort("1724");
		wissenskarte1.setSchl�sselwort("urteilskraft");
		wissenskarte1.setSchl�sselwort("philosoph");
//		String [] schl�sselwort1 = {"kant", "philosoph", "urteilskraft", "1724"};
//		wissenskarte1.setSchl�sselwort(schl�sselwort1);
//		schl�sselw�rter.add(schl�sselwort1);
		wissenskartenliste.add(wissenskarte1);

		
		
		wissenskarte2.setTitel("Fabian Kunz");
		wissenskarte2.setVorderseite("Student an der TH K�ln");
		wissenskarte2.setR�ckseite("Geboren 27.04.1995\nGeschlecht: M�nnlich");
		wissenskarte2.setFrage("Wie alt ist Fabian Kunz");
		wissenskarte2.setAntwort("21");
		String [] schl�sselwort2 = {"fabian", "kunz", "m�nnlich", "1995"};
//		wissenskarte2.setSchl�sselwort(schl�sselwort2);
		schl�sselw�rter.add(schl�sselwort2);
		wissenskartenliste.add(wissenskarte2);
		
		
		wissenskarte3.setTitel("AC/DC");
		wissenskarte3.setVorderseite("Australische hardrock Band");
		wissenskarte3.setR�ckseite("Gegr�ndet 31 Dezember 1973");
		wissenskarte3.setFrage("aus welchem Land kommt AC/DC?");
		wissenskarte3.setAntwort("australien");
		String [] schl�sselwort3 = {"australien", "rock", "1973", "ac/dc"};
//		wissenskarte3.setSchl�sselwort(schl�sselwort3);
		schl�sselw�rter.add(schl�sselwort3);
		wissenskartenliste.add(wissenskarte3);

		
		
		wissenskarte4.setTitel("K�lner Haie (KEC)");
		wissenskarte4.setVorderseite("Deutsche Eishockey Manschaft");
		wissenskarte4.setR�ckseite("seid 43 jahren in der Dutschen Eishockey Liga (DEL)\nGewonnene Meisterschaften: 8");
		wissenskarte4.setFrage("wie oft wurde der KEC Deutschermeister?");
		wissenskarte4.setAntwort("8");
		String [] schl�sselwort4 = {"kec", "del", "meister", "k�ln"};
//		wissenskarte4.setSchl�sselwort(schl�sselwort4);
		schl�sselw�rter.add(schl�sselwort4);
		wissenskartenliste.add(wissenskarte4);

		
		
		wissenskarte5.setTitel("TH K�ln");
		wissenskarte5.setVorderseite("Teschnische Hochschule K�ln");
		wissenskarte5.setR�ckseite("Gr��te Technische Hochschule f�r Angewandte Wissenschaften in Deutschland\nGegr�ndet: 1971");
		wissenskarte5.setFrage("In welchem Jahr wurde die TH K�ln gegr�ndet?");
		wissenskarte5.setAntwort("1971");
		String [] schl�sselwort5 = {"th", "1971", "wissenschaft"};
//		wissenskarte5.setSchl�sselwort(schl�sselwort5);
		schl�sselw�rter.add(schl�sselwort5);
		wissenskartenliste.add(wissenskarte5);
		
		
		
		frame.addKarte(wissenskarte1);
		frame.addKarte(wissenskarte2);
		frame.addKarte(wissenskarte3);
		frame.addKarte(wissenskarte4);
		frame.addKarte(wissenskarte5);

		
		
		System.out.println("Men�");
		System.out.println("mit 'g' wird ihnen die Aktuelleseite der Karte angezeigt");
		System.out.println("mit 'f' wechseln sie auf die andere Seite der ausgew�hlten Karte");
		System.out.println("mit 's' kommen sie zur�ck zur Suche");
		System.out.println("mit 'q' wird ihen die Frage zu der ausgew�hlten Karte angezeigt");
		System.out.println("mit 'e' beenden sie das Programm");
		
		
		
		while(z==false){
			System.out.print("\n\nSuche: ");
			String suchbegriff = in.next();
			for(Wissenskarten w : wissenskartenliste){
				if(w.enthalten(suchbegriff)==true){
					aktuelleWissenskarte = w;
					System.out.println(aktuelleWissenskarte.getAktuelleseite());
					z = true;
				}
			}
			if (z==false){
				System.out.println("kein treffer");
			}
		}
		
		
//		Frage tempFrage = new Frage();
		char i = 0;
		while(i != 'e'){
		i = in.findWithinHorizon(".",0).charAt(0);
			
			switch(i){
			
			case 'g':
				System.out.println(aktuelleWissenskarte.getAktuelleseite());
					break;
			case 'f':
				System.out.println(aktuelleWissenskarte.flip());
					break;
			case 's':
				z = false;
				while(z==false){
					System.out.print("Suche: ");
					String suchbegriff = in.next();
					for(Wissenskarten w : wissenskartenliste){
						if(w.enthalten(suchbegriff)==true){
							aktuelleWissenskarte = w;
							System.out.println(aktuelleWissenskarte.getAktuelleseite());
							z = true;
						}
					}
					if (z==false){
						System.out.println("kein treffer");
					}
				}
					break;
			case 'q':
//				tempFrage = aktuelleWissenskarte.getFrage();
//				System.out.println(tempFrage.getFrage());
				System.out.println(aktuelleWissenskarte.getFrage());
				System.out.println("\n('a' eingeben f�r Antwort)");
					break;
			case 'a':
//				System.out.println(tempFrage.getAntwort());
				System.out.println(aktuelleWissenskarte.getAntwort());
					break;
			case 'e':
				System.out.println("Das Programm wurde beendet.");
					break;
			default:
				System.out.println("Keine g�ltige eingabe\n");
				System.out.println("Men�");
				System.out.println("mit 'g' wird ihnen die Aktuelleseite der Karte angezeigt");
				System.out.println("mit 'f' w�chseln sie auf die R�ckseite der ausgew�hlten Karte");
				System.out.println("mit 's' kommen sie zur�ck zur suche");
				System.out.println("mit 'q' wird ihen die Frage zu der ausgew�hlten Karte angezeigt");
				System.out.println("mit 'e' beenden sie das Programm");
					break;
			}
			
		}
		
	}

}