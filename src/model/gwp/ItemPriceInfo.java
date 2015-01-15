package model.gwp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "model.gwp.PriceInfo")
@XmlType(propOrder = { "salePrice","currencyCode","orderDiscountShare"})
public class ItemPriceInfo {
	private double salePrice;
	private double orderDiscountShare;
	private String currencyCode;
	public double getSalePrice() {
		return salePrice;
	}
	@XmlElement(name = "itemPriceInfo.salePrice")
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getOrderDiscountShare() {
		return orderDiscountShare;
	}
	@XmlElement(name = "itemPriceInfo.orderDiscountShare")
	public void setOrderDiscountShare(double orderDiscountShare) {
		this.orderDiscountShare = orderDiscountShare;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	@XmlElement(name = "itemPriceInfo.currencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	@Override
	public String toString() {
		return "ItemPriceInfo [salePrice=" + salePrice
				+ ", orderDiscountShare=" + orderDiscountShare
				+ ", currencyCode=" + currencyCode + "]";
	}
}