package model.gwp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "model.gwp.ATG_ORDER_XML")
@XmlType(propOrder = { "quantity", "catalogRefId", "priceInfo"})
public class CommerceItem {
	private long quantity;
	private String catalogRefId;//atg sku id
	private PriceInfo priceInfo;
	public long getQuantity() {
		return quantity;
	}
	@XmlElement(name = "commerceItem.quantity")
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getCatalogRefId() {
		return catalogRefId;
	}
	@XmlElement(name = "commerceItem.catalogRefId")
	public void setCatalogRefId(String catalogRefId) {
		this.catalogRefId = catalogRefId;
	}
	public PriceInfo getPriceInfo() {
		return priceInfo;
	}
	@XmlElement(name = "commerceItem.priceInfo")
	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	@Override
	public String toString() {
		return "CommerceItem [quantity=" + quantity + ", catalogRefId="
				+ catalogRefId + ", priceInfo=" + priceInfo
				+ ", getDiscountedUnitPrice()=" + getDiscountedUnitPrice()
				+ ", getDiscountedTotalPrice()=" + getDiscountedTotalPrice()
				+ "]";
	}
	//logic
	public double getDiscountedTotalPrice(){
		double ret = 0.0;
		try{
			double totalItemPrice = (this.getQuantity() * this.getPriceInfo().getItemPriceInfo().getSalePrice());
			ret = totalItemPrice - this.getPriceInfo().getItemPriceInfo().getOrderDiscountShare();
		} catch (Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	public double getDiscountedUnitPrice(){
		double ret = 0.0;
		try{
			ret = this.getDiscountedTotalPrice() / this.getQuantity();
		} catch (Exception e){
			e.printStackTrace();
		}
		return ret;
	}
}
