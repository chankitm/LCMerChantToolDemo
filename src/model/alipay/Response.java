package model.alipay;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "alipay")
public class Response {
	private Trade trade;
	
	public Trade getTrade() {
		return trade;
	}
	@XmlElement(name = "trade")
	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	
	@Override
	public String toString() {
		return "Response [trade=" + trade + "]";
	}
}
