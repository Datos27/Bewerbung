package Wissenskarte;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlashCardEditor extends JFrame {
	
	private JTextField inTitel = new JTextField();
	private JTextField inVorderseite = new JTextField();
	private JTextField inR�ckseite = new JTextField();
	private JTextField inSchl�sselw�rter = new JTextField();
	private JTextField inFrage = new JTextField();
	private JTextField inAntwort = new JTextField();
	private List list = new List();
	private int index;
	
	private ArrayList<Wissenskarten> wissenskarten = new ArrayList<Wissenskarten>();
	private Wissenskarten aktuelleWissenskarte = null;
	
	public FlashCardEditor(){
		buildGUI();
	}
	
private void buildGUI(){
		
		Font f = new Font("serif", Font.BOLD, 26);
		
		setPreferredSize(new Dimension (700,400));
		Container content = this.getContentPane();
		
		JButton next = new JButton(">");
			next.setFont(f);
		JButton back = new JButton("<");
			back.setFont(f);
		
		JPanel interactionPanel = new JPanel(new FlowLayout());
			JButton confirm = new JButton("�bernehmen");
			JButton reset = new JButton("Zur�cksetzen");
			JButton neu = new JButton("Neu");
			JButton show = new JButton("Anzeigen");
				interactionPanel.add(confirm);
				interactionPanel.add(reset);
				interactionPanel.add(show);
				interactionPanel.add(neu);
				
		JLabel Titel = new JLabel("Tite:");
		JLabel Vorderseite = new JLabel("Vorderseite:");
		JLabel R�ckseite = new JLabel("R�ckseite:");
		JLabel Schl�sselw�rter = new JLabel("Schl�sselw�rter:");
		JLabel FuA = new JLabel("Frage und Antwort:");
		
		JPanel KartenPanel = new JPanel();
			BoxLayout bl = new BoxLayout(KartenPanel, BoxLayout.Y_AXIS);
			KartenPanel.setLayout(bl);
				KartenPanel.add(Titel);
				KartenPanel.add(inTitel);
				KartenPanel.add(Vorderseite);
				KartenPanel.add(inVorderseite);
				KartenPanel.add(R�ckseite);
				KartenPanel.add(inR�ckseite);
				KartenPanel.add(Schl�sselw�rter);
				KartenPanel.add(inSchl�sselw�rter);
				KartenPanel.add(FuA);
				KartenPanel.add(inFrage);
				KartenPanel.add(inAntwort);
				
				
		
		content.add(next, BorderLayout.EAST);
		content.add(back, BorderLayout.WEST);
		content.add(interactionPanel, BorderLayout.NORTH);
		content.add(KartenPanel, BorderLayout.CENTER);
		
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ActionListener
		ActionListener l = new GoNext(this);
		ActionListener k = new GoBack(this);
		next.addActionListener(l);
		back.addActionListener(k);
		confirm.addActionListener(new ConfirmAction());
		show.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				FlashCardPlayer frame = new FlashCardPlayer(aktuelleWissenskarte);
				
			}
			
		});
		reset.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(aktuelleWissenskarte != null){
					inTitel.setText(aktuelleWissenskarte.getTitel());
					inVorderseite.setText(aktuelleWissenskarte.getVorderseite());
					inR�ckseite.setText(aktuelleWissenskarte.getR�ckseite());
					inFrage.setText(aktuelleWissenskarte.getFrage());
					inAntwort.setText(aktuelleWissenskarte.getAntwort());
				}
				
			}
			
		});
		
		neu.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				Wissenskarten neueKarte = new Wissenskarten();
				list.addLast(neueKarte);
				aktuelleWissenskarte = neueKarte;
				index = list.size()-1;
				showWissenskarteData();
			}
			
		});
		
	}

	public void addKarte (Wissenskarten w){
		
		list.addLast(w);
		aktuelleWissenskarte = list.getLast();
		showWissenskarteData();
		index = list.size()-1;
	}
	
	public void showWissenskarteData(){
		
		if(aktuelleWissenskarte == null) return;
		inTitel.setText(aktuelleWissenskarte.getTitel() );
		inVorderseite.setText(aktuelleWissenskarte.getVorderseite());
		inR�ckseite.setText(aktuelleWissenskarte.getR�ckseite());
		inFrage.setText(aktuelleWissenskarte.getFrage());
		inAntwort.setText(aktuelleWissenskarte.getAntwort());
		inSchl�sselw�rter.setText(aktuelleWissenskarte.getSchl�sselw�rter());
	}
	
	public void next(){
		
		if(index < list.size()){
			index = index+1;
			aktuelleWissenskarte = list.getWissenskarte(index);
			showWissenskarteData();
		}
		
	}
	
	public void back(){
		
		if(index >= 0){
			index = index-1;
			aktuelleWissenskarte = list.getWissenskarte(index);
			showWissenskarteData();
		}
		
	}

	
	class ConfirmAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(aktuelleWissenskarte != null){
				aktuelleWissenskarte.setTitel(inTitel.getText());
				aktuelleWissenskarte.setVorderseite(inVorderseite.getText());
				aktuelleWissenskarte.setR�ckseite(inR�ckseite.getText());
				aktuelleWissenskarte.setFrage(inFrage.getText());
				aktuelleWissenskarte.setAntwort(inAntwort.getText());
			}
		}
		
	}
	
}
