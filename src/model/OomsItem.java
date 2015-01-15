package model;

public class OomsItem {
	private String atgOrderId;
	private String toLoc;
	
	public OomsItem(String atgOrderId, String toLoc) {
		super();
		this.atgOrderId = atgOrderId;
		this.toLoc = toLoc;
	}
	
	public String getAtgOrderId() {
		return atgOrderId;
	}
	public void setAtgOrderId(String atgOrderId) {
		this.atgOrderId = atgOrderId;
	}
	public String getToLoc() {
		return toLoc;
	}
	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	@Override
	public String toString() {
		return "oomsItem [atgOrderId=" + atgOrderId + ", toLoc=" + toLoc + "]";
	}
}
