package model;

import java.util.Date;

public class PcMediaExternal extends BaseModel {
	private String id;
	private String description;
	private Date endDate;
	private String name;
	private String parentFolder;
	private Date startDate;
	private String url;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentFolder() {
		return parentFolder;
	}
	public void setParentFolder(String parentFolder) {
		this.parentFolder = parentFolder;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PcMediaExternal [id=" + id + ", description=" + description
				+ ", endDate=" + endDate + ", name=" + name + ", parentFolder="
				+ parentFolder + ", startDate=" + startDate + ", url=" + url
				+ ", status=" + status + "]";
	}
}
