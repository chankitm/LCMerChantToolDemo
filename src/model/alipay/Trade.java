package model.alipay;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(namespace = "Response")
/*
@XmlType(propOrder = { "buyerEmail" , "buyerId" , "discount" , "flagTradeLocked" , "gmtCreate" , "gmtLastModifiedTime" , "gmtPayment" , 
		"isTotalFeeAdjust" , "operatorRole" , "outTradeNo" , "paymentType" , "price" , "quantity" , "sellerEmail" , "sellerId" , 
		"subject" , "toBuyerFee" , "toSellerFee" , "totalFee" , "tradeNo" , "tradeStatus" , "useCoupon" })
		*/
public class Trade {
	private String buyerEmail;
	private String buyerId;
	private String discount;
	private String flagTradeLocked;
	private String gmtCreate;
	private String gmtLastModifiedTime;
	private String gmtPayment;
	private String isTotalFeeAdjust;
	private String operatorRole;
	private String outTradeNo;
	private String paymentType;
	private String price;
	private String quantity;
	private String sellerEmail;
	private String sellerId;
	private String subject;
	private String toBuyerFee;
	private String toSellerFee;
	private String totalFee;
	private String tradeNo;
	private String tradeStatus;
	private String useCoupon;
	
	public String getBuyerEmail() {
		return buyerEmail;
	}
	@XmlElement(name = "buyer_email")
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerId() {
		return buyerId;
	}
	@XmlElement(name = "buyer_id")
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getDiscount() {
		return discount;
	}
	@XmlElement(name = "discount")
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getFlagTradeLocked() {
		return flagTradeLocked;
	}
	@XmlElement(name = "flag_trade_locked")
	public void setFlagTradeLocked(String flagTradeLocked) {
		this.flagTradeLocked = flagTradeLocked;
	}
	public String getGmtCreate() {
		return gmtCreate;
	}
	@XmlElement(name = "gmt_create")
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtLastModifiedTime() {
		return gmtLastModifiedTime;
	}
	@XmlElement(name = "gmt_last_modified_time")
	public void setGmtLastModifiedTime(String gmtLastModifiedTime) {
		this.gmtLastModifiedTime = gmtLastModifiedTime;
	}
	public String getGmtPayment() {
		return gmtPayment;
	}
	@XmlElement(name = "gmt_payment")
	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getIsTotalFeeAdjust() {
		return isTotalFeeAdjust;
	}
	@XmlElement(name = "is_total_fee_adjust")
	public void setIsTotalFeeAdjust(String isTotalFeeAdjust) {
		this.isTotalFeeAdjust = isTotalFeeAdjust;
	}
	public String getOperatorRole() {
		return operatorRole;
	}
	@XmlElement(name = "operator_role")
	public void setOperatorRole(String operatorRole) {
		this.operatorRole = operatorRole;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	@XmlElement(name = "out_trade_no")
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getPaymentType() {
		return paymentType;
	}
	@XmlElement(name = "payment_type")
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPrice() {
		return price;
	}
	@XmlElement(name = "price")
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	@XmlElement(name = "quantity")
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	@XmlElement(name = "seller_email")
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	public String getSellerId() {
		return sellerId;
	}
	@XmlElement(name = "seller_id")
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSubject() {
		return subject;
	}
	@XmlElement(name = "subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getToBuyerFee() {
		return toBuyerFee;
	}
	@XmlElement(name = "to_buyer_fee")
	public void setToBuyerFee(String toBuyerFee) {
		this.toBuyerFee = toBuyerFee;
	}
	public String getToSellerFee() {
		return toSellerFee;
	}
	@XmlElement(name = "to_seller_fee")
	public void setToSellerFee(String toSellerFee) {
		this.toSellerFee = toSellerFee;
	}
	public String getTotalFee() {
		return totalFee;
	}
	@XmlElement(name = "total_fee")
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	@XmlElement(name = "trade_no")
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeStatus() {
		return tradeStatus;
	}
	@XmlElement(name = "trade_status")
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
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
		return "Trade [buyerEmail=" + buyerEmail + ", buyerId=" + buyerId
				+ ", discount=" + discount + ", flagTradeLocked="
				+ flagTradeLocked + ", gmtCreate=" + gmtCreate
				+ ", gmtLastModifiedTime=" + gmtLastModifiedTime
				+ ", gmtPayment=" + gmtPayment + ", isTotalFeeAdjust="
				+ isTotalFeeAdjust + ", operatorRole=" + operatorRole
				+ ", outTradeNo=" + outTradeNo + ", paymentType=" + paymentType
				+ ", price=" + price + ", quantity=" + quantity
				+ ", sellerEmail=" + sellerEmail + ", sellerId=" + sellerId
				+ ", subject=" + subject + ", toBuyerFee=" + toBuyerFee
				+ ", toSellerFee=" + toSellerFee + ", totalFee=" + totalFee
				+ ", tradeNo=" + tradeNo + ", tradeStatus=" + tradeStatus
				+ ", useCoupon=" + useCoupon + "]";
	}
}
