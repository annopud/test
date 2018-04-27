package example;

public class NoNBill {
	private String Number;
	private float Cost;
	
	public NoNBill(String Num,float cost) {
		this.Number = Num;
		this.Cost = cost;
	}
	
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public float getValue() {
		return Cost;
	}
	public void setValue(float value) {
		this.Cost = value;
	}
		
}
