package model;

import java.util.List;

public class testRequest {
	private String CallerReferenceNo;
	private List<testModel> tests;
	public String getCallerReferenceNo() {
		return CallerReferenceNo;
	}
	public void setCallerReferenceNo(String callerReferenceNo) {
		CallerReferenceNo = callerReferenceNo;
	}
	public List<testModel> getTests() {
		return tests;
	}
	public void setTests(List<testModel> tests) {
		this.tests = tests;
	}
	@Override
	public String toString() {
		return "testRequest [CallerReferenceNo=" + CallerReferenceNo
				+ ", tests=" + tests + "]";
	}
}
