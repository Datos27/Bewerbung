package Wissenskarte;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

import Wissenskarte.Wissenskarten;


public class WissenskartenOrdner {
	private static Scanner in;
	
	
	public static void main(String[] args){
		
		in = new Scanner(System.in);
		
		ArrayList<String[]> schlüsselwörter = new ArrayList<String[]>();
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
		neueLernkarte.setVorderseite("Deutscher Philosoph der Aufklärung");
		neueLernkarte.setRückseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		String frage = "In welchem Jahr wurde Immanuel Kant geboren?";
		String antwort = "1724";
		neueLernkarte.addfrage(frage, antwort);
		String frage1 = "blabliblub?";
		String antwort1 = "jops!";
		neueLernkarte.addfrage(frage1, antwort1);
		String [] schlüsselwort0 = {"kant2", "philosoph2", "urteilskraft2", "17242"};
//		neueLernkarte.setSchlüsselwort(schlüsselwort0);
		boolean z = false;
//		wissenskartenliste.add(neueLernkarte);

		
		
		wissenskarte1.setTitel("Immanuel Kant");
		wissenskarte1.setVorderseite("Deutscher Philosoph der Aufklärung");
		wissenskarte1.setRückseite("Geboren 1724\nWichtigstes werk: Kritik der reinen Vernunft...");
		wissenskarte1.setFrage("In welchem Jahr wurde Immanuel Kant geboren?");
		wissenskarte1.setAntwort("1724");
		wissenskarte1.setSchlüsselwort("kant");
		wissenskarte1.setSchlüsselwort("1724");
		wissenskarte1.setSchlüsselwort("urteilskraft");
		wissenskarte1.setSchlüsselwort("philosoph");
//		String [] schlüsselwort1 = {"kant", "philosoph", "urteilskraft", "1724"};
//		wissenskarte1.setSchlüsselwort(schlüsselwort1);
//		schlüsselwörter.add(schlüsselwort1);
		wissenskartenliste.add(wissenskarte1);

		
		
		wissenskarte2.setTitel("Fabian Kunz");
		wissenskarte2.setVorderseite("Student an der TH Köln");
		wissenskarte2.setRückseite("Geboren 27.04.1995\nGeschlecht: Männlich");
		wissenskarte2.setFrage("Wie alt ist Fabian Kunz");
		wissenskarte2.setAntwort("21");
		String [] schlüsselwort2 = {"fabian", "kunz", "männlich", "1995"};
//		wissenskarte2.setSchlüsselwort(schlüsselwort2);
		schlüsselwörter.add(schlüsselwort2);
		wissenskartenliste.add(wissenskarte2);
		
		
		wissenskarte3.setTitel("AC/DC");
		wissenskarte3.setVorderseite("Australische hardrock Band");
		wissenskarte3.setRückseite("Gegründet 31 Dezember 1973");
		wissenskarte3.setFrage("aus welchem Land kommt AC/DC?");
		wissenskarte3.setAntwort("australien");
		String [] schlüsselwort3 = {"australien", "rock", "1973", "ac/dc"};
//		wissenskarte3.setSchlüsselwort(schlüsselwort3);
		schlüsselwörter.add(schlüsselwort3);
		wissenskartenliste.add(wissenskarte3);

		
		
		wissenskarte4.setTitel("Kölner Haie (KEC)");
		wissenskarte4.setVorderseite("Deutsche Eishockey Manschaft");
		wissenskarte4.setRückseite("seid 43 jahren in der Dutschen Eishockey Liga (DEL)\nGewonnene Meisterschaften: 8");
		wissenskarte4.setFrage("wie oft wurde der KEC Deutschermeister?");
		wissenskarte4.setAntwort("8");
		String [] schlüsselwort4 = {"kec", "del", "meister", "köln"};
//		wissenskarte4.setSchlüsselwort(schlüsselwort4);
		schlüsselwörter.add(schlüsselwort4);
		wissenskartenliste.add(wissenskarte4);

		
		
		wissenskarte5.setTitel("TH Köln");
		wissenskarte5.setVorderseite("Teschnische Hochschule Köln");
		wissenskarte5.setRückseite("Größte Technische Hochschule für Angewandte Wissenschaften in Deutschland\nGegründet: 1971");
		wissenskarte5.setFrage("In welchem Jahr wurde die TH Köln gegründet?");
		wissenskarte5.setAntwort("1971");
		String [] schlüsselwort5 = {"th", "1971", "wissenschaft"};
//		wissenskarte5.setSchlüsselwort(schlüsselwort5);
		schlüsselwörter.add(schlüsselwort5);
		wissenskartenliste.add(wissenskarte5);
		
		
		
		frame.addKarte(wissenskarte1);
		frame.addKarte(wissenskarte2);
		frame.addKarte(wissenskarte3);
		frame.addKarte(wissenskarte4);
		frame.addKarte(wissenskarte5);

		
		
		System.out.println("Menü");
		System.out.println("mit 'g' wird ihnen die Aktuelleseite der Karte angezeigt");
		System.out.println("mit 'f' wechseln sie auf die andere Seite der ausgewählten Karte");
		System.out.println("mit 's' kommen sie zurück zur Suche");
		System.out.println("mit 'q' wird ihen die Frage zu der ausgewählten Karte angezeigt");
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
				System.out.println("\n('a' eingeben für Antwort)");
					break;
			case 'a':
//				System.out.println(tempFrage.getAntwort());
				System.out.println(aktuelleWissenskarte.getAntwort());
					break;
			case 'e':
				System.out.println("Das Programm wurde beendet.");
					break;
			default:
				System.out.println("Keine gültige eingabe\n");
				System.out.println("Menü");
				System.out.println("mit 'g' wird ihnen die Aktuelleseite der Karte angezeigt");
				System.out.println("mit 'f' wächseln sie auf die Rückseite der ausgewählten Karte");
				System.out.println("mit 's' kommen sie zurück zur suche");
				System.out.println("mit 'q' wird ihen die Frage zu der ausgewählten Karte angezeigt");
				System.out.println("mit 'e' beenden sie das Programm");
					break;
			}
			
		}
		
	}

}