package Wissenskarte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoBack implements ActionListener {
	
	private FlashCardEditor wissenskartenFrame;
	
	public GoBack(FlashCardEditor wissenskartenFrame){
		this.wissenskartenFrame = wissenskartenFrame;
	}
	
	public void actionPerformed(ActionEvent e){
		
		wissenskartenFrame.back();
		
	}

}
