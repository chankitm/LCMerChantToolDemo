package model.alipay;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Request {
	private List<XmlParam> param;
	
	public List<XmlParam> getParam() {
		return param;
	}
	public void setParam(List<XmlParam> param) {
		this.param = param;
	}
	
	@Override
	public String toString() {
		return "Request [param=" + param + "]";
	}
	/*
	 * sample data
   <request>
      <param name="trade_no">2015031124200354</param>
      <param name="_input_charset">utf-8</param>
      <param name="service">single_trade_query</param>
      <param name="partner">2088801766902304</param>
   </request>
	 */
}
