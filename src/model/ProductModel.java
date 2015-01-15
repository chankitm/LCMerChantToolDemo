package model;

public class ProductModel {
	String id;
	String colour;
	String SubCategory;
	String combine;
	Double pricePoint;
	boolean NewestIn;
	boolean Stocklevel;

	Double MAX = 1000000.0;
	public ProductModel(String id, String colour, String subCategory,
			Double pricePoint, boolean newestIn,
			boolean stocklevel) {
		super();
		this.id = id;
		this.colour = colour;
		SubCategory = subCategory;
		//this.combine = colour+subCategory+pricePoint.toString();
		//this.combine = subCategory+","+colour+","+Long.toBinaryString(Double.doubleToRawLongBits(pricePoint));
		
		
		//ASC price first
		//this.combine = Long.toBinaryString(Double.doubleToRawLongBits(pricePoint))+","+subCategory+","+colour;
		//desc price
		//this.combine = Long.toBinaryString(Double.doubleToRawLongBits(MAX-pricePoint))+","+subCategory+","+colour;

		//ASC price last
		//this.combine = subCategory+","+colour+","+Long.toBinaryString(Double.doubleToRawLongBits(pricePoint));
		//desc price
		this.combine = subCategory+","+colour+","+Long.toBinaryString(Double.doubleToRawLongBits(MAX-pricePoint));

		//ASC price mid
		//this.combine = subCategory+","+Long.toBinaryString(Double.doubleToRawLongBits(pricePoint))+","+colour;
		//desc price
		//this.combine = subCategory+","+Long.toBinaryString(Double.doubleToRawLongBits(MAX-pricePoint))+","+colour;
		
//		this.combine = Long.toBinaryString(Double.doubleToRawLongBits(pricePoint))+","+colour+","+subCategory;
		this.pricePoint = pricePoint;
		NewestIn = newestIn;
		Stocklevel = stocklevel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getCombine() {
		return combine;
	}
	public void setCombine(String combine) {
		this.combine = combine;
	}
	public String getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	public Double isPricePoint() {
		return pricePoint;
	}
	public void setPricePoint(Double pricePoint) {
		this.pricePoint = pricePoint;
	}
	public boolean isNewestIn() {
		return NewestIn;
	}
	public void setNewestIn(boolean newestIn) {
		NewestIn = newestIn;
	}
	public boolean isStocklevel() {
		return Stocklevel;
	}
	public void setStocklevel(boolean stocklevel) {
		Stocklevel = stocklevel;
	}
	@Override
	public String toString() {
		return "ProductModel ["
				+ "combine=" + combine
				+ ", pricePoint=" + pricePoint
				+ ", id=" + id + ", colour=" + colour
				+ ", SubCategory=" + SubCategory 
				+ ", NewestIn=" + NewestIn
				+ ", Stocklevel=" + Stocklevel + "]";
	}

}
