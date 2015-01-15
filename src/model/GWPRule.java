package model;

import java.sql.Timestamp;

public class GWPRule {
	private String institCde;
	private long gwpCde;
	private String locCde;
	private long seqCde;
	private String gwpDesc;
	private Timestamp effStartDT;
	private Timestamp effEndDT;
	private Timestamp lastUpdDtRms;
	private String lastUpdUsrRms;
	private String giftStyle;
	private Double giftMinPurchaseAmt;
	private String giftDesc;
	private String giftCurrency;
	private Double giftValue;
	private String buCde;
	private String deptCde;
	private String classCde;
	private String brandCde;
	private String seasonCde;
	private String style;
	private String prodType;
	private String sku;
	private Timestamp lastUpdDt;
	private String lastUpdUsr;
	public String getInstitCde() {
		return institCde;
	}
	public void setInstitCde(String institCde) {
		this.institCde = institCde;
	}
	public long getGwpCde() {
		return gwpCde;
	}
	public void setGwpCde(long gwpCde) {
		this.gwpCde = gwpCde;
	}
	public String getLocCde() {
		return locCde;
	}
	public void setLocCde(String locCde) {
		this.locCde = locCde;
	}
	public long getSeqCde() {
		return seqCde;
	}
	public void setSeqCde(long seqCde) {
		this.seqCde = seqCde;
	}
	public String getGwpDesc() {
		return gwpDesc;
	}
	public void setGwpDesc(String gwpDesc) {
		this.gwpDesc = gwpDesc;
	}
	public Timestamp getEffStartDT() {
		return effStartDT;
	}
	public void setEffStartDT(Timestamp effStartDT) {
		this.effStartDT = effStartDT;
	}
	public Timestamp getEffEndDT() {
		return effEndDT;
	}
	public void setEffEndDT(Timestamp effEndDT) {
		this.effEndDT = effEndDT;
	}
	public Timestamp getLastUpdDtRms() {
		return lastUpdDtRms;
	}
	public void setLastUpdDtRms(Timestamp lastUpdDtRms) {
		this.lastUpdDtRms = lastUpdDtRms;
	}
	public String getLastUpdUsrRms() {
		return lastUpdUsrRms;
	}
	public void setLastUpdUsrRms(String lastUpdUsrRms) {
		this.lastUpdUsrRms = lastUpdUsrRms;
	}
	public String getGiftStyle() {
		return giftStyle;
	}
	public void setGiftStyle(String giftStyle) {
		this.giftStyle = giftStyle;
	}
	public Double getGiftMinPurchaseAmt() {
		return giftMinPurchaseAmt;
	}
	public void setGiftMinPurchaseAmt(Double giftMinPurchaseAmt) {
		this.giftMinPurchaseAmt = giftMinPurchaseAmt;
	}
	public String getGiftDesc() {
		return giftDesc;
	}
	public void setGiftDesc(String giftDesc) {
		this.giftDesc = giftDesc;
	}
	public String getGiftCurrency() {
		return giftCurrency;
	}
	public void setGiftCurrency(String giftCurrency) {
		this.giftCurrency = giftCurrency;
	}
	public Double getGiftValue() {
		return giftValue;
	}
	public void setGiftValue(Double giftValue) {
		this.giftValue = giftValue;
	}
	public String getBuCde() {
		return buCde;
	}
	public void setBuCde(String buCde) {
		this.buCde = buCde;
	}
	public String getDeptCde() {
		return deptCde;
	}
	public void setDeptCde(String deptCde) {
		this.deptCde = deptCde;
	}
	public String getClassCde() {
		return classCde;
	}
	public void setClassCde(String classCde) {
		this.classCde = classCde;
	}
	public String getBrandCde() {
		return brandCde;
	}
	public void setBrandCde(String brandCde) {
		this.brandCde = brandCde;
	}
	public String getSeasonCde() {
		return seasonCde;
	}
	public void setSeasonCde(String seasonCde) {
		this.seasonCde = seasonCde;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Timestamp getLastUpdDt() {
		return lastUpdDt;
	}
	public void setLastUpdDt(Timestamp lastUpdDt) {
		this.lastUpdDt = lastUpdDt;
	}
	public String getLastUpdUsr() {
		return lastUpdUsr;
	}
	public void setLastUpdUsr(String lastUpdUsr) {
		this.lastUpdUsr = lastUpdUsr;
	}
	@Override
	public String toString() {
		return "GWPRule [institCde=" + institCde + ", gwpCde=" + gwpCde
				+ ", locCde=" + locCde + ", seqCde=" + seqCde + ", gwpDesc="
				+ gwpDesc + ", effStartDT=" + effStartDT + ", effEndDT="
				+ effEndDT + ", lastUpdDtRms=" + lastUpdDtRms
				+ ", lastUpdUsrRms=" + lastUpdUsrRms + ", giftStyle="
				+ giftStyle + ", giftMinPurchaseAmt=" + giftMinPurchaseAmt
				+ ", giftDesc=" + giftDesc + ", giftCurrency=" + giftCurrency
				+ ", giftValue=" + giftValue + ", buCde=" + buCde
				+ ", deptCde=" + deptCde + ", classCde=" + classCde
				+ ", brandCde=" + brandCde + ", seasonCde=" + seasonCde
				+ ", style=" + style + ", prodType=" + prodType + ", sku="
				+ sku + ", lastUpdDt=" + lastUpdDt + ", lastUpdUsr="
				+ lastUpdUsr + "]";
	}
}
