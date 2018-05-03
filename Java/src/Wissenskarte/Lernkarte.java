package Wissenskarte;

import java.util.ArrayList;
import java.util.Random;

public class Lernkarte extends Wissenskarten{
	Frage neueFrage = new Frage();
	ArrayList<Frage> alleFragen = new ArrayList<Frage>();
	
	public Lernkarte(){
	super();
}

public void addfrage(String frage, String antwort){
	
	Frage frage1 = new Frage();
	frage1.setFrage(frage);
	frage1.setAntwort(antwort);
	alleFragen.add(frage1);
	 
}

//@Override
//public Frage getFrage(){
//	int randomInt = 0;
//	Random randomGenerator = new Random();
//	randomInt = randomGenerator.nextInt(alleFragen.size());
//
//	System.out.println("randomInt = "+randomInt);
//	return alleFragen.get(randomInt);
//}

}

