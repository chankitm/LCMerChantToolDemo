package model;

public class ArchiveRecord {
	private String ATGOrderId;
	private String orderGuid;
	private boolean isPackNoteArchived;
	private boolean isCustomerInvoiceArchived;
	private boolean isReturnInfoArchived;
	private boolean isInterCustomInvoiceArchived;
	public String getATGOrderId() {
		return ATGOrderId;
	}
	public void setATGOrderId(String aTGOrderId) {
		ATGOrderId = aTGOrderId;
	}
	public String getOrderGuid() {
		return orderGuid;
	}
	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}
	public boolean isPackNoteArchived() {
		return isPackNoteArchived;
	}
	public void setPackNoteArchived(boolean isPackNoteArchived) {
		this.isPackNoteArchived = isPackNoteArchived;
	}
	public boolean isCustomerInvoiceArchived() {
		return isCustomerInvoiceArchived;
	}
	public void setCustomerInvoiceArchived(boolean isCustomerInvoiceArchived) {
		this.isCustomerInvoiceArchived = isCustomerInvoiceArchived;
	}
	public boolean isReturnInfoArchived() {
		return isReturnInfoArchived;
	}
	public void setReturnInfoArchived(boolean isReturnInfoArchived) {
		this.isReturnInfoArchived = isReturnInfoArchived;
	}
	public boolean isInterCustomInvoiceArchived() {
		return isInterCustomInvoiceArchived;
	}
	public void setInterCustomInvoiceArchived(boolean isInterCustomInvoiceArchived) {
		this.isInterCustomInvoiceArchived = isInterCustomInvoiceArchived;
	}
	@Override
	public String toString() {
		return "ArchiveRecord [ATGOrderId=" + ATGOrderId + ", orderGuid="
				+ orderGuid + ", isPackNoteArchived=" + isPackNoteArchived
				+ ", isCustomerInvoiceArchived=" + isCustomerInvoiceArchived
				+ ", isReturnInfoArchived=" + isReturnInfoArchived
				+ ", isInterCustomInvoiceArchived="
				+ isInterCustomInvoiceArchived + "]";
	}
	


}
