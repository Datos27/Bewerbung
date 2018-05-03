package Wissenskarte;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlashCardPlayer extends JFrame {
	
	private Wissenskarten aktuelleWissenskarte = new Wissenskarten();
	private int i;
	
	public FlashCardPlayer(Wissenskarten w){
		aktuelleWissenskarte = w;
		buildGUI();
	}

	private void buildGUI(){
		Container content = this.getContentPane();
		
		JFlashCard panel = new JFlashCard(aktuelleWissenskarte);
			panel.anzeigeModus(1);
		
		JPanel interactionPanel = new JPanel(new FlowLayout());
			JLabel vorne = new JLabel("Vorderseite");
				interactionPanel.add(vorne);
			JLabel hinten = new JLabel("Rückseite");
				interactionPanel.add(hinten);
			JLabel frage = new JLabel("Frage");
				frage.setForeground(Color.RED);
				interactionPanel.add(frage);
			JLabel antwort = new JLabel("Antwort");
				antwort.setForeground(Color.GREEN);
				interactionPanel.add(antwort);
				
		vorne.addMouseListener(new MouseListener(){

			@Override
			public void mouseEntered(MouseEvent e) {
				panel.anzeigeModus(1);
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		hinten.addMouseListener(new MouseListener(){

			@Override
			public void mouseEntered(MouseEvent e) {
				panel.anzeigeModus(2);
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		frage.addMouseListener(new MouseListener(){

			@Override
			public void mouseEntered(MouseEvent e) {
				panel.anzeigeModus(3);
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		antwort.addMouseListener(new MouseListener(){

			@Override
			public void mouseEntered(MouseEvent e) {
				panel.anzeigeModus(4);
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
				
		content.add(interactionPanel, BorderLayout.SOUTH);
		content.add(panel, BorderLayout.CENTER);
		
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}
