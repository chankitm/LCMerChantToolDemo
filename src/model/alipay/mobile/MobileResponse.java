package model.alipay.mobile;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "notify")
public class MobileResponse {
	private String paymentType;
	private String subject;
	private String tradeNo;
	private String buyerEmail;
	private String gmtCreate;
	private String notifyType;
	private int quantity;
	private String outTradeNo;
	private String notifyTime;
	private String sellerId;
	private String tradeStatus;
	private String isTotalFeeAdjust;
	private Double totalFee;
	private String gmtPayment;
	private String sellerEmail;
	private Double price;
	private String buyerId;
	private String notifyId;
	private String useCoupon;
	public String getPaymentType() {
		return paymentType;
	}
	@XmlElement(name = "payment_type")
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getSubject() {
		return subject;
	}
	@XmlElement(name = "subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	@XmlElement(name = "trade_no")
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	@XmlElement(name = "buyer_email")
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getGmtCreate() {
		return gmtCreate;
	}
	@XmlElement(name = "gmt_create")
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getNotifyType() {
		return notifyType;
	}
	@XmlElement(name = "notify_type")
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}
	public int getQuantity() {
		return quantity;
	}
	@XmlElement(name = "quantity")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}	
	@XmlElement(name = "out_trade_no")
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getNotifyTime() {
		return notifyTime;
	}
	@XmlElement(name = "notify_time")
	public void setNotifyTime(String notifyTime) {
		this.notifyTime = notifyTime;
	}
	public String getSellerId() {
		return sellerId;
	}
	@XmlElement(name = "seller_id")
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getTradeStatus() {
		return tradeStatus;
	}
	@XmlElement(name = "trade_status")
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getIsTotalFeeAdjust() {
		return isTotalFeeAdjust;
	}
	@XmlElement(name = "is_total_fee_adjust")
	public void setIsTotalFeeAdjust(String isTotalFeeAdjust) {
		this.isTotalFeeAdjust = isTotalFeeAdjust;
	}
	public Double getTotalFee() {
		return totalFee;
	}
	@XmlElement(name = "total_fee")
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public String getGmtPayment() {
		return gmtPayment;
	}
	@XmlElement(name = "gmt_payment")
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	@XmlElement(name = "seller_email")
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public Double getPrice() {
		return price;
	}
	@XmlElement(name = "price")
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBuyerId() {
		return buyerId;
	}
	@XmlElement(name = "buyer_id")
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getNotifyId() {
		return notifyId;
	}
	@XmlElement(name = "notify_id")
	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}
	public String getUseCoupon() {
		return useCoupon;
	}
	@XmlElement(name = "use_coupon")
	public void setUseCoupon(String useCoupon) {
		this.useCoupon = useCoupon;
	}
	@Override
	public String toString() {
		return "MobileResponse [paymentType=" + paymentType + ", subject="
				+ subject + ", tradeNo=" + tradeNo + ", buyerEmail="
				+ buyerEmail + ", gmtCreate=" + gmtCreate + ", notifyType="
				+ notifyType + ", quantity=" + quantity + ", outTradeNo="
				+ outTradeNo + ", notifyTime=" + notifyTime + ", sellerId="
				+ sellerId + ", tradeStatus=" + tradeStatus
				+ ", isTotalFeeAdjust=" + isTotalFeeAdjust + ", totalFee="
				+ totalFee + ", gmtPayment=" + gmtPayment + ", sellerEmail="
				+ sellerEmail + ", price=" + price + ", buyerId=" + buyerId
				+ ", notifyId=" + notifyId + ", useCoupon=" + useCoupon + "]";
	}	
	/*
	<?xml version="1.0" encoding="UTF-8"?>
	<notify>
	   <payment_type>1</payment_type>
	   <subject>901173003</subject>
	   <trade_no>2015032500001000760045995663</trade_no>
	   <buyer_email>14714348178@163.com</buyer_email>
	   <gmt_create>2015-03-25 16:09:36</gmt_create>
	   <notify_type>trade_status_sync</notify_type>
	   <quantity>1</quantity>
	   <out_trade_no>901173003</out_trade_no>
	   <notify_time>2015-03-25 16:10:12</notify_time>
	   <seller_id>2088711824364505</seller_id>
	   <trade_status>TRADE_SUCCESS</trade_status>
	   <is_total_fee_adjust>N</is_total_fee_adjust>
	   <total_fee>1.00</total_fee>
	   <gmt_payment>2015-03-25 16:10:12</gmt_payment>
	   <seller_email>cnonlinegroup@lanecrawford.com</seller_email>
	   <price>1.00</price>
	   <buyer_id>2088812802232761</buyer_id>
	   <notify_id>72994e255d64bd37b07adebb43105cc768</notify_id>
	   <use_coupon>N</use_coupon>
	</notify>
		 */
}
