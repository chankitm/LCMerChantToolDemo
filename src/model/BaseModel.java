package model;

import java.util.Date;

public class BaseModel {
    private Date createDate;
    private Date lastUpdDate;
    private String lastUpdUser;
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdDate() {
		return lastUpdDate;
	}
	public void setLastUpdDate(Date lastUpdDate) {
		this.lastUpdDate = lastUpdDate;
	}
	public String getLastUpdUser() {
		return lastUpdUser;
	}
	public void setLastUpdUser(String lastUpdUser) {
		this.lastUpdUser = lastUpdUser;
	}
	@Override
	public String toString() {
		return "BaseModel [createDate=" + createDate + ", lastUpdDate="
				+ lastUpdDate + ", lastUpdUser=" + lastUpdUser + "]";
	}
}
