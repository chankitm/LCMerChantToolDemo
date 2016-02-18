package model.alipay;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "alipay")
public class SingleTradeQueryResponse {
	private String isSuccess;
	
	private Request request;
	
	private Response response;

	public String getIsSuccess() {
		return isSuccess;
	}
	@XmlElement(name = "is_success")
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Request getRequest() {
		return request;
	}
	@XmlElement(name = "request")
	public void setRequest(Request request) {
		this.request = request;
	}
	public Response getResponse() {
		return response;
	}
	@XmlElement(name = "response")
	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "SingleTradeQueryResponse [isSuccess=" + isSuccess
				+ ", request=" + request 
				+ ", response=" + response + "]";
	}
	

/*
<?xml version="1.0" encoding="UTF-8"?>
<alipay>
   <is_success>T</is_success>
   <request>
      <param name="trade_no">2015031124200354</param>
      <param name="_input_charset">utf-8</param>
      <param name="service">single_trade_query</param>
      <param name="partner">2088801766902304</param>
   </request>
   <response>
      <trade>
         <buyer_email>alipay_test@alipay.com</buyer_email>
         <buyer_id>2088102151633543</buyer_id>
         <discount>0.00</discount>
         <flag_trade_locked>0</flag_trade_locked>
         <gmt_create>2015-03-11 10:28:41</gmt_create>
         <gmt_last_modified_time>2015-03-11 10:28:54</gmt_last_modified_time>
         <gmt_payment>2015-03-11 10:28:54</gmt_payment>
         <is_total_fee_adjust>F</is_total_fee_adjust>
         <operator_role>B</operator_role>
         <out_trade_no>150311288690</out_trade_no>
         <payment_type>8</payment_type>
         <price>0.01</price>
         <quantity>1</quantity>
         <seller_email>shuzhi_zsz@126.com</seller_email>
         <seller_id>2088801766902304</seller_id>
         <subject>管理付款编号 150311288690</subject>
         <to_buyer_fee>0.00</to_buyer_fee>
         <to_seller_fee>0.01</to_seller_fee>
         <total_fee>0.01</total_fee>
         <trade_no>2015031124200354</trade_no>
         <trade_status>TRADE_SUCCESS</trade_status>
         <use_coupon>F</use_coupon>
      </trade>
   </response>
   <sign>9517107e5ba7df60853f6d347ca3493b</sign>
   <sign_type>MD5</sign_type>
</alipay>
 */
	
}


