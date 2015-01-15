package model;

public class PcLcHtml extends BaseModel {
	private String id;
	private String displayName;
	private String html;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PcLcHtml [id=" + id + ", displayName=" + displayName
				+ ", html=" + html + ", status=" + status + "]";
	}
}
