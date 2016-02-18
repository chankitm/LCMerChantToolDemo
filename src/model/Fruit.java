package model;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	 
	private String fruitName;
	private String fruitDesc;
	private Double quantity;
 
	public Fruit(String fruitName, String fruitDesc, Double quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
 
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
 
	public int compareTo(Fruit compareFruit) {
 
		Double compareQuantity = ((Fruit) compareFruit).getQuantity(); 
 
		//ascending order
//		return (int) (this.quantity - compareQuantity);
 
		//descending order
		//return compareQuantity - this.quantity;
		
        if (this.quantity < compareQuantity) return -1;
        if (this.quantity > compareQuantity) return 1;
        return 0;
 
	}
	
	public static Comparator<Fruit> FruitNameComparator = new Comparator<Fruit>() {

	public int compare(Fruit fruit1, Fruit fruit2) {
	
	String fruitName1 = fruit1.getFruitName().toUpperCase();
	String fruitName2 = fruit2.getFruitName().toUpperCase();
	
	//ascending order
	return fruitName1.compareTo(fruitName2);
	
	//descending order
	//return fruitName2.compareTo(fruitName1);
	}

};

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitDesc=" + fruitDesc
				+ ", quantity=" + quantity + "]";
	}	
}