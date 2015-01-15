package model;

public class PcProductTranslation extends BaseModel {
	private String id;
	private String displayName;
	private String description;
	private String detailsAndCareText;
	private String keywords;
	private String longDescription;
	private String sizeAndFit;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetailsAndCareText() {
		return detailsAndCareText;
	}
	public void setDetailsAndCareText(String detailsAndCareText) {
		this.detailsAndCareText = detailsAndCareText;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getSizeAndFit() {
		return sizeAndFit;
	}
	public void setSizeAndFit(String sizeAndFit) {
		this.sizeAndFit = sizeAndFit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PcProductTranslation [id=" + id + ", displayName="
				+ displayName + ", description=" + description
				+ ", detailsAndCareText=" + detailsAndCareText + ", keywords="
				+ keywords + ", longDescription=" + longDescription
				+ ", sizeAndFit=" + sizeAndFit + ", status=" + status + "]";
	}
}
