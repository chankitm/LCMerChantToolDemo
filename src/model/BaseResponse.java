package model;


public abstract class BaseResponse {
   	private long elapsedTime;
   	private String responseCode = "SUCCESS";
   	private String serverReferenceNo;
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
	@Override
	public String toString() {
		return "BaseResponse [elapsedTime=" + elapsedTime + ", responseCode="
				+ responseCode + ", serverReferenceNo=" + serverReferenceNo
				+ "]";
	}
}
