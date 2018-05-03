package Wissenskarte;

import java.util.ArrayList;

//import Wissenskarte.Vorderseite;
//import Wissenskarte.Rückseite;



public class Wissenskarten {

	protected Vorderseite neueVorderseite = new Vorderseite();
	protected Rückseite neueRückseite = new Rückseite();
	protected Vorderseite neuerTitelv = new Vorderseite();
	protected Rückseite neuerTitelr = new Rückseite();
	protected String a = "this.getVorderseite()";
	protected Frage neueFrage = new Frage();
	protected String neueFrage1;
	protected String schlüsselwort;
//	protected String [] schlüsselwörter;
	protected ArrayList<String> schlüsselwörter = new ArrayList<String>();
	protected boolean b;
	
	public Wissenskarten(){
		
	}
	
	public String getAktuelleseite(){
		if(a=="this.getVorderseite()"){
			return "Titel: "+ neuerTitelv.getTitel() +"\nInhalt: "+ neueVorderseite.getInhalt();
		}else{
			return "Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+ neueRückseite.getInformationen();
		}
	}
	
	public String flip(){
		if(a=="this.getVorderseite()"){
			a = "this.getRückseite()";
			return "Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+ neueRückseite.getInformationen();
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
		neuerTitelr = new Rückseite();
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
	
	
	public void setRückseite(String informationen){
		neueRückseite = new Rückseite();
		neueRückseite.setInformationen(informationen);
	}
	
	public String getRückseite(){
//		"Titel: "+ neuerTitelr.getTitel() +"\nInformationen: "+
		return neueRückseite.getInformationen();  
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
	
	public String getSchlüsselwörter(){
	
		
			for(String s: schlüsselwörter){
				return s +", ";
			}
		return "nix da";
	}
	
	public void setSchlüsselwort(String s){
		this.schlüsselwort = s;
		schlüsselwörter.add(schlüsselwort);
	}
	
//	public void setSchlüsselwort(String schlüsselwort[]){
//		this.schlüsselwort = schlüsselwort;
//	}

	
	public boolean enthalten(String suchbegriff){
		for(String suche: schlüsselwörter){
			if(suchbegriff.equals(suche)){
				
				return true;
				
			}
		}
		return false;
	}

}

	

