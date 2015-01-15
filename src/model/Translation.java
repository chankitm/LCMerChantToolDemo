package model;


public class Translation extends BaseModel {
	private String id;
	private String objectId;
	private String projectId;
	private String locale;
	private String displayName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
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
	@Override
	public String toString() {
		return "Translation [id=" + id + ", objectId=" + objectId
				+ ", projectId=" + projectId
				+ ", locale=" + locale + ", displayName=" + displayName
				+ ", super.toString()=" + super.toString() + "]";
	}
}
