package model;

public class testModel {
	int number;
	String text;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "testModel [number=" + number + ", text=" + text + "]";
	}
}
