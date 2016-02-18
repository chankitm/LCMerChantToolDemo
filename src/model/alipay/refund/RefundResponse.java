package model.alipay.refund;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "alipay")
public class RefundResponse {
	private String isSuccess;
	private String error;

	public String getIsSuccess() {
		return isSuccess;
	}
	@XmlElement(name = "is_success")
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getError() {
		return error;
	}
	@XmlElement(name = "error")
	public void setError(String error) {
		this.error = error;
	}
	/*
	<?xml version="1.0" encoding="GBK" ?> 
	<alipay>
		<is_success>T</is_success>
	</alipay>
	 */
	@Override
	public String toString() {
		return "RefundResponse [isSuccess=" + isSuccess + ", error=" + error
				+ "]";
	}

	/*
	<?xml version="1.0" encoding="GBK" ?> 
	<alipay>
	<is_success>F</is_success>
	<error>DUPLICATE_BATCH_NO</error>
	</alipay>
	 */
}
