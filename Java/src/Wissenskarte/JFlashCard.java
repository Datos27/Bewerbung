package Wissenskarte;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JFlashCard extends JPanel{
	
	private Wissenskarten aktuelleWissenskarte = new Wissenskarten();
	private int modus;
	private String text;

	
	public JFlashCard(Wissenskarten w){
		
		aktuelleWissenskarte = w;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension (600,100));

	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawRect(10, 60, getWidth()-20, getHeight()-70);
		g.drawString(aktuelleWissenskarte.getTitel(), 30, 45);
			g.drawString(text, 30, 80);	
		
	}
	
	public void anzeigeModus(int i){
		modus = i;
		if(modus==1){
			text=aktuelleWissenskarte.getVorderseite();
			repaint();
		}
		if(modus==2){
			text=aktuelleWissenskarte.getRückseite();
			repaint();
		}
		if(modus==3){
			text=aktuelleWissenskarte.getFrage();
			repaint();
		}
		if(modus==4){
			text=aktuelleWissenskarte.getAntwort();
			repaint();
		}
	}

}
