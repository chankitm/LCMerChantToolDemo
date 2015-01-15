package model.oopg;

import java.util.List;

public class FileTransferResult {
	private String accName;
	private String accNumber;
	private String bankName;
	private String currency;
	private String country;
	private String bic;
	private String dateRange;
	private List<TransferRecord> records;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}
	public List<TransferRecord> getRecords() {
		return records;
	}
	public void setRecords(List<TransferRecord> records) {
		this.records = records;
	}
	@Override
	public String toString() {
		return "FileTransferResult [accName=" + accName + ", accNumber="
				+ accNumber + ", bankName=" + bankName + ", currency="
				+ currency + ", country=" + country + ", bic=" + bic
				+ ", dateRange=" + dateRange + ", records=" + records + "]";
	}
}
