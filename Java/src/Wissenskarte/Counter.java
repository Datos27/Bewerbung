package Wissenskarte;

public class Counter implements ApplyInterface{

	private int counter = 0;
	
	@Override
	public void apply(Wissenskarten w) {
		counter++;	
	}

	public int getCounter(){
		return counter;
	}
	
	
}
