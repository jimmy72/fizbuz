package be.vdab.valueobjects;

public class FizBuz {
	private int number;

	public FizBuz() {
		
	}
	public FizBuz(int number) {
		this.setNumber(number);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String whoAmI() {
		if((number % 3 + number % 5) == 0) {
			return "You are FizBuz";
		}
		return number % 3 == 0 ? "You are Fiz" : number % 5 == 0 ? "You are Buz" : "Sorry, I don't know your name";
	}
}
