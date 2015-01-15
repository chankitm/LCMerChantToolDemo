package model;

import java.util.List;

public class RetrieveToLocByAtgOrderIdRequest {
	private List<String> atgOrderIds;

	public List<String> getAtgOrderIds() {
		return atgOrderIds;
	}
	public void setAtgOrderIds(List<String> atgOrderIds) {
		this.atgOrderIds = atgOrderIds;
	}
	@Override
	public String toString() {
		return "RetrieveToLocByAtgOrderIdRequest [atgOrderIds=" + atgOrderIds
				+ "]";
	}
}
