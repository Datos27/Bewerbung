package Wissenskarte;

import java.util.Scanner;

public class AppendKeyWord implements ApplyInterface {
	
	Scanner in = new Scanner(System.in);
	@Override
	public void apply(Wissenskarten w) {
		System.out.println("was soll das neue Schl�sselwort f�r die karte "+ w.getTitel() + "sein?:");
		String s = in.nextLine();
		w.setSchl�sselwort(s);
		
	}

}
