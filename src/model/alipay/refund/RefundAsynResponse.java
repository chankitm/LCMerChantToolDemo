package model.alipay.refund;

public class RefundAsynResponse {
//	2015042700001000760049110401^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS#2015042700001000760049110581^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS	
//	2015042700001000760049110401^1.00	  ^SUCCESS		$cnonlinegroup@lanecrawford.com	^2088711824364505	^0.01			^SUCCESS
//	alipayTraNo					^refundAmt^refundState	$alipayMerAcc					^alipayMerId		^refundMerFee	^refundMerState
	private String alipayTraNo;
	private Double refundAmt;
	private String refundState;
	private String alipayMerAcc;
	private String alipayMerId;
	private Double refundMerFee;
	private String refundMerState;
	public RefundAsynResponse(String alipayTraNo, Double refundAmt,
			String refundState, String alipayMerAcc, String alipayMerId,
			Double refundMerFee, String refundMerState) {
		super();
		this.alipayTraNo = alipayTraNo;
		this.refundAmt = refundAmt;
		this.refundState = refundState;
		this.alipayMerAcc = alipayMerAcc;
		this.alipayMerId = alipayMerId;
		this.refundMerFee = refundMerFee;
		this.refundMerState = refundMerState;
	}
	public String getAlipayTraNo() {
		return alipayTraNo;
	}
	public void setAlipayTraNo(String alipayTraNo) {
		this.alipayTraNo = alipayTraNo;
	}
	public Double getRefundAmt() {
		return refundAmt;
	}
	public void setRefundAmt(Double refundAmt) {
		this.refundAmt = refundAmt;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getAlipayMerAcc() {
		return alipayMerAcc;
	}
	public void setAlipayMerAcc(String alipayMerAcc) {
		this.alipayMerAcc = alipayMerAcc;
	}
	public String getAlipayMerId() {
		return alipayMerId;
	}
	public void setAlipayMerId(String alipayMerId) {
		this.alipayMerId = alipayMerId;
	}
	public Double getRefundMerFee() {
		return refundMerFee;
	}
	public void setRefundMerFee(Double refundMerFee) {
		this.refundMerFee = refundMerFee;
	}
	public String getRefundMerState() {
		return refundMerState;
	}
	public void setRefundMerState(String refundMerState) {
		this.refundMerState = refundMerState;
	}
	@Override
	public String toString() {
		return "RefundAsynResponse [alipayTraNo=" + alipayTraNo
				+ ", refundAmt=" + refundAmt + ", refundState=" + refundState
				+ ", alipayMerAcc=" + alipayMerAcc + ", alipayMerId="
				+ alipayMerId + ", refundMerFee=" + refundMerFee
				+ ", refundMerState=" + refundMerState + "]";
	}
}
