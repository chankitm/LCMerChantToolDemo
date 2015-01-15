package model;

public class PurchasedItem {
	private String ATG_SKU_ID;
	private Double unitPrice;
	private Double totalPrice;
	private int qty;
	public String getATG_SKU_ID() {
		return ATG_SKU_ID;
	}
	public void setATG_SKU_ID(String aTG_SKU_ID) {
		ATG_SKU_ID = aTG_SKU_ID;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
		//if(getQty() >= 0) setTotalPrice(getUnitPrice() * getQty());
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
		//if(getUnitPrice() >= 0) setTotalPrice(getUnitPrice() * getQty());
	}
	public void incrementQty(){
		setQty(getQty() + 1);
	}
	public void updateTotalPrice() {
		setTotalPrice(getQty() * getUnitPrice()); 
	}
	@Override
	public String toString() {
		return "PurchasedItem [ATG_SKU_ID=" + ATG_SKU_ID + ", unitPrice=" + unitPrice
				+ ", totalPrice=" + totalPrice + ", qty=" + qty + "]";
	}
}
