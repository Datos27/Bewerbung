package Wissenskarte;

import java.util.ArrayList;

//import Wissenskarte.Vorderseite;
//import Wissenskarte.R�ckseite;



public class Wissenskarten {

	protected Vorderseite neueVorderseite = new Vorderseite();
	protected R�ckseite neueR�ckseite = new R�ckseite();
	protected Vorderseite neuerTitelv = new Vorderseite();
	protected R�ckseite neuerTitelr = new R�ckseite();
	protected String a = "this.getVorderseite()";
	protected Frage neueFrage = new Frage();
	protected String neueFrage1;
	protected String schl�sselwort;
//	protected String [] schl�sselw�rter;
	protected ArrayList<String> schl�sselw�rter = new ArrayList<String>();
	protected boolean b;
	
	public Wissenskarten(){
		
	}
	
	public String getAktuelleseite(){
		if(a=="this.getVorderseite()"){
			return "Titel: "+ neuerTitelv.getTitel() +"\nInhalt: "+ neueVorderseite.getInhalt();
		}else{
			return "Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+ neueR�ckseite.getInformationen();
		}
	}
	
	public String flip(){
		if(a=="this.getVorderseite()"){
			a = "this.getR�ckseite()";
			return "Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+ neueR�ckseite.getInformationen();
		}else{
			a = "this.getVorderseite()";
			return "Titel: "+ neuerTitelv.getTitel() +"\nInhalt: "+ neueVorderseite.getInhalt();
		}
	}
	
	public String getTitel(){
		return neuerTitelv.getTitel();
	}
	
	public void setTitel(String titel){
		neuerTitelv = new Vorderseite();
		neuerTitelr = new R�ckseite();
		neuerTitelv.setTitel(titel);
		neuerTitelr.setTitel(titel);
	}
	
	
	public void setVorderseite(String inhalt){
		neueVorderseite = new Vorderseite();
		neueVorderseite.setInhalt(inhalt);
	}
	
	public String getVorderseite(){
//		"Titel: "+ neuerTitelv.getTitel() +"\nInhalt: "+
		return neueVorderseite.getInhalt();
	}
	
	
	public void setR�ckseite(String informationen){
		neueR�ckseite = new R�ckseite();
		neueR�ckseite.setInformationen(informationen);
	}
	
	public String getR�ckseite(){
//		"Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+
		return neueR�ckseite.getInformationen();  
	}
	
	
	public void setFrage(String frage){
		neueFrage.setFrage(frage);
	}
	
	public String getFrage(){
		
		return neueFrage.getFrage();
	}
	
	public void setAntwort(String antwort){
		neueFrage.setAntwort(antwort);
	}
	
	public String getAntwort(){
		return neueFrage.getAntwort();
	}
	
	public String getSchl�sselw�rter(){
	
		
			for(String s: schl�sselw�rter){
				return s +", ";
			}
		return "nix da";
	}
	
	public void setSchl�sselwort(String s){
		this.schl�sselwort = s;
		schl�sselw�rter.add(schl�sselwort);
	}
	
//	public void setSchl�sselwort(String schl�sselwort[]){
//		this.schl�sselwort = schl�sselwort;
//	}

	
	public boolean enthalten(String suchbegriff){
		for(String suche: schl�sselw�rter){
			if(suchbegriff.equals(suche)){
				
				return true;
				
			}
		}
		return false;
	}

}

	

