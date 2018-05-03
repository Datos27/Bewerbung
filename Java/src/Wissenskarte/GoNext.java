package Wissenskarte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoNext implements ActionListener{
	
	private FlashCardEditor wissenskartenFrame;
	
	public GoNext(FlashCardEditor wissenskartenFrame){
		this.wissenskartenFrame = wissenskartenFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		
		wissenskartenFrame.next();
		
	}

}
