package model.gwp;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "model.gwp.CommerceItem")
@XmlType(propOrder = { "itemPriceInfo"})
public class PriceInfo {
	private ItemPriceInfo itemPriceInfo;
	public ItemPriceInfo getItemPriceInfo() {
		return itemPriceInfo;
	}
	@XmlElement(name = "itemPriceInfo")
	public void setItemPriceInfo(ItemPriceInfo itemPriceInfo) {
		this.itemPriceInfo = itemPriceInfo;
	}
	@Override
	public String toString() {
		return "PriceInfo [itemPriceInfo=" + itemPriceInfo + "]";
	}
}
