package Wissenskarte;


public class Vorderseite {
	private String titel;
	private String inhalt;
	
	public Vorderseite(){
		this.setInhalt(inhalt);
		this.setTitel(titel);
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

}