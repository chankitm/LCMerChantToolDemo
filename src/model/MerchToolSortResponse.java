package model;

import java.util.List;

public class MerchToolSortResponse {
    private String callerReferenceNo;
    private long elapsedTime;
    private String responseCode;
    private String serverReferenceNo;
    private List<String> sortedProductID;
    private int sortedProductIDSize;
    private List<String> sortedProductContent;
	public String getCallerReferenceNo() {
		return callerReferenceNo;
	}
	public void setCallerReferenceNo(String callerReferenceNo) {
		this.callerReferenceNo = callerReferenceNo;
	}
	public long getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getServerReferenceNo() {
		return serverReferenceNo;
	}
	public void setServerReferenceNo(String serverReferenceNo) {
		this.serverReferenceNo = serverReferenceNo;
	}
	public List<String> getSortedProductID() {
		return sortedProductID;
	}
	public void setSortedProductID(List<String> sortedProductID) {
		this.sortedProductID = sortedProductID;
	}
	public int getSortedProductIDSize() {
		return sortedProductIDSize;
	}
	public void setSortedProductIDSize(int sortedProductIDSize) {
		this.sortedProductIDSize = sortedProductIDSize;
	}
	public List<String> getSortedProductContent() {
		return sortedProductContent;
	}
	public void setSortedProductContent(
			List<String> sortedProductContent) {
		this.sortedProductContent = sortedProductContent;
	}
	@Override
	public String toString() {
		return "MerchToolSortResponse [callerReferenceNo=" + callerReferenceNo
				+ ", elapsedTime=" + elapsedTime + ", responseCode="
				+ responseCode + ", serverReferenceNo=" + serverReferenceNo
				+ ", sortedProductID=" + sortedProductID
				+ ", sortedProductIDSize=" + sortedProductIDSize
				+ ", sortedProductContent=" + sortedProductContent + "]";
	}  
}
