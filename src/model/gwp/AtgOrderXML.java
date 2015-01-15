package model.gwp;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "order")
@XmlType(propOrder = { "commerceItems", "description"})
public class AtgOrderXML {

	private String description;
	private List<CommerceItem> commerceItems;
	public String getDescription() {
		return description;
	}
	@XmlElement(name = "order.description")
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CommerceItem> getCommerceItems() {
		return commerceItems;
	}
	@XmlElementWrapper(name = "order.commerceItems")
	@XmlElement(name = "commerceItem")
	public void setCommerceItems(List<CommerceItem> commerceItems) {
		this.commerceItems = commerceItems;
	}
	@Override
	public String toString() {
		return "AtgOrderXML [description=" + description + ", commerceItems="
				+ commerceItems + "]";
	}
}
