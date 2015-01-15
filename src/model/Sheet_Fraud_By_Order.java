package model;

import java.util.Date;

public class Sheet_Fraud_By_Order {
	String PROFILE_ID;
	String ORDER_ID;	
	String ORDER_REF;	
	String CURRENCY_CODE;	
	int AMOUNT;	
	Date SUBMITTED_DATE;	
	String PAYMENT_METHOD;	
	String PAYMENT_CURRENCY;	
	int PAYMENT_AMOUNT;	
	String CREDIT_CARD_TYPE;	
	String BILLING_COUNTRY;	
	String BILLING_CITY;	
	String SHIPPING_COUNTRY;	
	String SHIPPING_CITY;	
	String STATE;	
	Date FRAUD_ALERT_TIME;	
	String FRAUD_REASON;
	public String getPROFILE_ID() {
		return PROFILE_ID;
	}
	public void setPROFILE_ID(String pROFILE_ID) {
		PROFILE_ID = pROFILE_ID;
	}
	public String getORDER_ID() {
		return ORDER_ID;
	}
	public void setORDER_ID(String oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}
	public String getORDER_REF() {
		return ORDER_REF;
	}
	public void setORDER_REF(String oRDER_REF) {
		ORDER_REF = oRDER_REF;
	}
	public String getCURRENCY_CODE() {
		return CURRENCY_CODE;
	}
	public void setCURRENCY_CODE(String cURRENCY_CODE) {
		CURRENCY_CODE = cURRENCY_CODE;
	}
	public int getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public Date getSUBMITTED_DATE() {
		return SUBMITTED_DATE;
	}
	public void setSUBMITTED_DATE(Date sUBMITTED_DATE) {
		SUBMITTED_DATE = sUBMITTED_DATE;
	}
	public String getPAYMENT_METHOD() {
		return PAYMENT_METHOD;
	}
	public void setPAYMENT_METHOD(String pAYMENT_METHOD) {
		PAYMENT_METHOD = pAYMENT_METHOD;
	}
	public String getPAYMENT_CURRENCY() {
		return PAYMENT_CURRENCY;
	}
	public void setPAYMENT_CURRENCY(String pAYMENT_CURRENCY) {
		PAYMENT_CURRENCY = pAYMENT_CURRENCY;
	}
	public int getPAYMENT_AMOUNT() {
		return PAYMENT_AMOUNT;
	}
	public void setPAYMENT_AMOUNT(int pAYMENT_AMOUNT) {
		PAYMENT_AMOUNT = pAYMENT_AMOUNT;
	}
	public String getCREDIT_CARD_TYPE() {
		return CREDIT_CARD_TYPE;
	}
	public void setCREDIT_CARD_TYPE(String cREDIT_CARD_TYPE) {
		CREDIT_CARD_TYPE = cREDIT_CARD_TYPE;
	}
	public String getBILLING_COUNTRY() {
		return BILLING_COUNTRY;
	}
	public void setBILLING_COUNTRY(String bILLING_COUNTRY) {
		BILLING_COUNTRY = bILLING_COUNTRY;
	}
	public String getBILLING_CITY() {
		return BILLING_CITY;
	}
	public void setBILLING_CITY(String bILLING_CITY) {
		BILLING_CITY = bILLING_CITY;
	}
	public String getSHIPPING_COUNTRY() {
		return SHIPPING_COUNTRY;
	}
	public void setSHIPPING_COUNTRY(String sHIPPING_COUNTRY) {
		SHIPPING_COUNTRY = sHIPPING_COUNTRY;
	}
	public String getSHIPPING_CITY() {
		return SHIPPING_CITY;
	}
	public void setSHIPPING_CITY(String sHIPPING_CITY) {
		SHIPPING_CITY = sHIPPING_CITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public Date getFRAUD_ALERT_TIME() {
		return FRAUD_ALERT_TIME;
	}
	public void setFRAUD_ALERT_TIME(Date fRAUD_ALERT_TIME) {
		FRAUD_ALERT_TIME = fRAUD_ALERT_TIME;
	}
	public String getFRAUD_REASON() {
		return FRAUD_REASON;
	}
	public void setFRAUD_REASON(String fRAUD_REASON) {
		FRAUD_REASON = fRAUD_REASON;
	}
	@Override
	public String toString() {
		return "Sheet_Fraud_By_Order [PROFILE_ID=" + PROFILE_ID + ", ORDER_ID="
				+ ORDER_ID + ", ORDER_REF=" + ORDER_REF + ", CURRENCY_CODE="
				+ CURRENCY_CODE + ", AMOUNT=" + AMOUNT + ", SUBMITTED_DATE="
				+ SUBMITTED_DATE + ", PAYMENT_METHOD=" + PAYMENT_METHOD
				+ ", PAYMENT_CURRENCY=" + PAYMENT_CURRENCY
				+ ", PAYMENT_AMOUNT=" + PAYMENT_AMOUNT + ", CREDIT_CARD_TYPE="
				+ CREDIT_CARD_TYPE + ", BILLING_COUNTRY=" + BILLING_COUNTRY
				+ ", BILLING_CITY=" + BILLING_CITY + ", SHIPPING_COUNTRY="
				+ SHIPPING_COUNTRY + ", SHIPPING_CITY=" + SHIPPING_CITY
				+ ", STATE=" + STATE + ", FRAUD_ALERT_TIME=" + FRAUD_ALERT_TIME
				+ ", FRAUD_REASON=" + FRAUD_REASON + "]";
	}
	
}
