package model;

import java.sql.Timestamp;

public class GWPRuleMask extends GWPRule{
	private String status;
	private long maxGiftQtyPerOrder;
	private String giftDescMask;
	private Double giftValueMask;
	private Timestamp lastUpdDtMask;
	private String lastUpdUsrMask;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getMaxGiftQtyPerOrder() {
		return maxGiftQtyPerOrder;
	}
	public void setMaxGiftQtyPerOrder(long maxGiftQtyPerOrder) {
		this.maxGiftQtyPerOrder = maxGiftQtyPerOrder;
	}
	public String getGiftDescMask() {
		return giftDescMask;
	}
	public void setGiftDescMask(String giftDescMask) {
		this.giftDescMask = giftDescMask;
	}
	public Double getGiftValueMask() {
		return giftValueMask;
	}
	public void setGiftValueMask(Double giftValueMask) {
		this.giftValueMask = giftValueMask;
	}
	public Timestamp getLastUpdDtMask() {
		return lastUpdDtMask;
	}
	public void setLastUpdDtMask(Timestamp lastUpdDtMask) {
		this.lastUpdDtMask = lastUpdDtMask;
	}
	public String getLastUpdUsrMask() {
		return lastUpdUsrMask;
	}
	public void setLastUpdUsrMask(String lastUpdUsrMask) {
		this.lastUpdUsrMask = lastUpdUsrMask;
	}
	@Override
	public String toString() {
		return "GWPRuleMask [status=" + status + ", maxGiftQtyPerOrder="
				+ maxGiftQtyPerOrder + ", giftDescMask=" + giftDescMask
				+ ", giftValueMask=" + giftValueMask + ", lastUpdDtMask="
				+ lastUpdDtMask + ", lastUpdUsrMask=" + lastUpdUsrMask
				+ ", toString()=" + super.toString() + "]";
	}
}
