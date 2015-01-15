package model;

public class ColorObject extends BaseModel{
    private String id;
    private String locale;
    private String displayName;
    private String colorValue;
    private String imagePath;
    private String rmsColorCode;
    private String remarks;
    private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getColorValue() {
		return colorValue;
	}
	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getRmsColorCode() {
		return rmsColorCode;
	}
	public void setRmsColorCode(String rmsColorCode) {
		this.rmsColorCode = rmsColorCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ColorObject [id=" + id + ", locale=" + locale
				+ ", displayName=" + displayName + ", colorValue=" + colorValue
				+ ", imagePath=" + imagePath + ", rmsColorCode=" + rmsColorCode
				+ ", remarks=" + remarks + ", status=" + status
				+ ", getCreateDate()=" + getCreateDate()
				+ ", getLastUpdDate()=" + getLastUpdDate()
				+ ", getLastUpdUser()=" + getLastUpdUser() + "]";
	}
}
