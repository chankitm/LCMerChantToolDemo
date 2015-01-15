package model.oopg;

import java.util.Date;

public class TransferRecord {
	private String bankReference;
	private String customerReference;
	private String trnType;
	private Date valueDate;
	private double creditAmount;
	private double debitAmount;
	private double balance;
	private String time;
	private String action;
	private Date postDate;
	public String getBankReference() {
		return bankReference;
	}
	public void setBankReference(String bankReference) {
		this.bankReference = bankReference;
	}
	public String getCustomerReference() {
		return customerReference;
	}
	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}
	public String getTrnType() {
		return trnType;
	}
	public void setTrnType(String trnType) {
		this.trnType = trnType;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	@Override
	public String toString() {
		return "FileTransferResult [bankReference=" + bankReference
				+ ", customerReference=" + customerReference + ", trnType="
				+ trnType + ", valueDate=" + valueDate + ", creditAmount="
				+ creditAmount + ", debitAmount=" + debitAmount + ", balance="
				+ balance + ", time=" + time + ", action=" + action
				+ ", postDate=" + postDate + "]";
	}
}
