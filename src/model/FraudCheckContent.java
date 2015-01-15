package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "FRAUD_CHECK_CONTENT")
@XmlType(propOrder = { "shipping", "billing", "firstName","lastName","memberID"
		,"IPAddr","numberOfItem","copyAndPasteDetected","geoIPCountryDetected","highestQuantityInOrder"
		,"pCardNumberAwardedDiscount","email","atgOrderID","atgRMSID","staffID"
		,"staffDiscountLevel","staffDiscountAmount"})
public class FraudCheckContent {
	private FraudCheckContentAddress shipping;
	private FraudCheckContentAddress billing;
	private String firstName;
	private String lastName;
	private String memberID;
	private String IPAddr;
	private String numberOfItem;
	private String copyAndPasteDetected;
	private String geoIPCountryDetected;
	private String highestQuantityInOrder;
	private String pCardNumberAwardedDiscount;
	private String email;
	private String atgOrderID;
	private String atgRMSID;
	private String staffID;
	private String staffDiscountLevel;
	private String staffDiscountAmount;
	public FraudCheckContent() {
		super();
	}
	public FraudCheckContentAddress getShipping() {
		return shipping;
	}
	@XmlElement(name = "SHIPPING")
	public void setShipping(FraudCheckContentAddress shipping) {
		this.shipping = shipping;
	}
	public FraudCheckContentAddress getBilling() {
		return billing;
	}
	@XmlElement(name = "BILLING")
	public void setBilling(FraudCheckContentAddress billing) {
		this.billing = billing;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement(name = "FIRST-NAME")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement(name = "LAST-NAME")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMemberID() {
		return memberID;
	}
	@XmlElement(name = "MEMBER_ID")
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getIPAddr() {
		return IPAddr;
	}
	@XmlElement(name = "IP_ADDR")
	public void setIPAddr(String iPAddr) {
		IPAddr = iPAddr;
	}
	public String getNumberOfItem() {
		return numberOfItem;
	}
	@XmlElement(name = "NUMBER_OF_ITEMS")
	public void setNumberOfItem(String numberOfItem) {
		this.numberOfItem = numberOfItem;
	}
	public String getCopyAndPasteDetected() {
		return copyAndPasteDetected;
	}
	@XmlElement(name = "CopyAndPasteDetected")
	public void setCopyAndPasteDetected(String copyAndPasteDetected) {
		this.copyAndPasteDetected = copyAndPasteDetected;
	}
	public String getGeoIPCountryDetected() {
		return geoIPCountryDetected;
	}
	@XmlElement(name = "GeoIPCountryDetected")
	public void setGeoIPCountryDetected(String geoIPCountryDetected) {
		this.geoIPCountryDetected = geoIPCountryDetected;
	}
	public String getHighestQuantityInOrder() {
		return highestQuantityInOrder;
	}
	@XmlElement(name = "HighestQuantityInOrder")
	public void setHighestQuantityInOrder(String highestQuantityInOrder) {
		this.highestQuantityInOrder = highestQuantityInOrder;
	}
	public String getpCardNumberAwardedDiscount() {
		return pCardNumberAwardedDiscount;
	}
	@XmlElement(name = "PCardNumberAwardedDiscount ")
	public void setpCardNumberAwardedDiscount(String pCardNumberAwardedDiscount) {
		this.pCardNumberAwardedDiscount = pCardNumberAwardedDiscount;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement(name = "Email")
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAtgOrderID() {
		return atgOrderID;
	}
	@XmlElement(name = "ATG_ORDER_ID")
	public void setAtgOrderID(String atgOrderID) {
		this.atgOrderID = atgOrderID;
	}
	public String getAtgRMSID() {
		return atgRMSID;
	}
	@XmlElement(name = "ATG_RMS_ID")
	public void setAtgRMSID(String atgRMSID) {
		this.atgRMSID = atgRMSID;
	}
	public String getStaffID() {
		return staffID;
	}
	@XmlElement(name = "STAFF_ID")
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	public String getStaffDiscountLevel() {
		return staffDiscountLevel;
	}
	@XmlElement(name = "STAFF_DISCOUNT_LEVEL")
	public void setStaffDiscountLevel(String staffDiscountLevel) {
		this.staffDiscountLevel = staffDiscountLevel;
	}
	public String getStaffDiscountAmount() {
		return staffDiscountAmount;
	}
	@XmlElement(name = "STAFF_DISCOUNT_AMOUNT")
	public void setStaffDiscountAmount(String staffDiscountAmount) {
		this.staffDiscountAmount = staffDiscountAmount;
	}
	@Override
	public String toString() {
		return "FraudCheckContent [shipping=" + shipping + ", billing="
				+ billing + ", firstName=" + firstName + ", lastName="
				+ lastName + ", memberID=" + memberID + ", IPAddr=" + IPAddr
				+ ", numberOfItem=" + numberOfItem + ", copyAndPasteDetected="
				+ copyAndPasteDetected + ", geoIPCountryDetected="
				+ geoIPCountryDetected + ", highestQuantityInOrder="
				+ highestQuantityInOrder + ", pCardNumberAwardedDiscount="
				+ pCardNumberAwardedDiscount + ", email=" + email
				+ ", atgOrderID=" + atgOrderID + ", atgRMSID=" + atgRMSID
				+ ", staffID=" + staffID + ", staffDiscountLevel="
				+ staffDiscountLevel + ", staffDiscountAmount="
				+ staffDiscountAmount + "]";
	}
	
}
