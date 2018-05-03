package Wissenskarte;


public class Rückseite {
	private String informationen;
	private String titel;
	
	public Rückseite(){
		this.setInformationen(informationen);
		this.setTitel(titel);		
	}

	public String getInformationen() {
		return informationen;
	}

	public void setInformationen(String informationen) {
		this.informationen = informationen;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
}