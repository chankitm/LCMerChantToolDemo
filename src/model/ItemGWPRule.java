package model;

public class ItemGWPRule {
	//item
	private String ATG_SKU_ID;
	private String CURRENCY_CODE;
	private Double SALE_PRICE;
	
	//info
	private String INSTIT_CDE;
	private long GWP_CDE;
	private String LOC_CDE;
	private long SEQ_NO;
	private String GWP_DESC;
	private String GIFT_STYLE;
	private String GIFT_DESC;
	private String GIFT_CURRENCY;
	private Double GIFT_VALUE;

	//mask
	private long MAX_GIFT_QTY_PER_ORDER;
	private Double GIFT_MIN_PURCHASE_AMT;
	private String GIFT_DESC_MASK;
	private Double GIFT_VALUE_MASK;
	
	private String thumbnail;
	private int qty;
	
	public String getATG_SKU_ID() {
		return ATG_SKU_ID;
	}
	public void setATG_SKU_ID(String aTG_SKU_ID) {
		ATG_SKU_ID = aTG_SKU_ID;
	}
	public String getCURRENCY_CODE() {
		return CURRENCY_CODE;
	}
	public void setCURRENCY_CODE(String cURRENCY_CODE) {
		CURRENCY_CODE = cURRENCY_CODE;
	}
	public Double getSALE_PRICE() {
		return SALE_PRICE;
	}
	public void setSALE_PRICE(Double sALE_PRICE) {
		SALE_PRICE = sALE_PRICE;
	}
	public String getINSTIT_CDE() {
		return INSTIT_CDE;
	}
	public void setINSTIT_CDE(String iNSTIT_CDE) {
		INSTIT_CDE = iNSTIT_CDE;
	}
	public long getGWP_CDE() {
		return GWP_CDE;
	}
	public void setGWP_CDE(long gWP_CDE) {
		GWP_CDE = gWP_CDE;
	}
	public String getLOC_CDE() {
		return LOC_CDE;
	}
	public void setLOC_CDE(String lOC_CDE) {
		LOC_CDE = lOC_CDE;
	}
	public long getSEQ_NO() {
		return SEQ_NO;
	}
	public void setSEQ_NO(long sEQ_NO) {
		SEQ_NO = sEQ_NO;
	}
	public String getGWP_DESC() {
		return GWP_DESC;
	}
	public void setGWP_DESC(String gWP_DESC) {
		GWP_DESC = gWP_DESC;
	}
	public String getGIFT_STYLE() {
		return GIFT_STYLE;
	}
	public void setGIFT_STYLE(String gIFT_STYLE) {
		GIFT_STYLE = gIFT_STYLE;
	}
	public String getGIFT_DESC() {
		return GIFT_DESC;
	}
	public void setGIFT_DESC(String gIFT_DESC) {
		GIFT_DESC = gIFT_DESC;
	}
	public String getGIFT_CURRENCY() {
		return GIFT_CURRENCY;
	}
	public void setGIFT_CURRENCY(String gIFT_CURRENCY) {
		GIFT_CURRENCY = gIFT_CURRENCY;
	}
	public Double getGIFT_VALUE() {
		return GIFT_VALUE;
	}
	public void setGIFT_VALUE(Double gIFT_VALUE) {
		GIFT_VALUE = gIFT_VALUE;
	}
	public Double getGIFT_MIN_PURCHASE_AMT() {
		return GIFT_MIN_PURCHASE_AMT;
	}
	public void setGIFT_MIN_PURCHASE_AMT(Double gIFT_MIN_PURCHASE_AMT) {
		GIFT_MIN_PURCHASE_AMT = gIFT_MIN_PURCHASE_AMT;
	}
	public String getGIFT_DESC_MASK() {
		return GIFT_DESC_MASK;
	}
	public void setGIFT_DESC_MASK(String gIFT_DESC_MASK) {
		GIFT_DESC_MASK = gIFT_DESC_MASK;
	}
	public Double getGIFT_VALUE_MASK() {
		return GIFT_VALUE_MASK;
	}
	public void setGIFT_VALUE_MASK(Double gIFT_VALUE_MASK) {
		GIFT_VALUE_MASK = gIFT_VALUE_MASK;
	}
	public long getMAX_GIFT_QTY_PER_ORDER() {
		return MAX_GIFT_QTY_PER_ORDER;
	}
	public void setMAX_GIFT_QTY_PER_ORDER(long mAX_GIFT_QTY_PER_ORDER) {
		MAX_GIFT_QTY_PER_ORDER = mAX_GIFT_QTY_PER_ORDER;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	//logic
	public String getKeyWithSeq(){
		return INSTIT_CDE+":"+GWP_CDE+":"+LOC_CDE+":"+SEQ_NO;
	}
	public String getKey(){
		return INSTIT_CDE+":"+GWP_CDE+":"+LOC_CDE;
	}
	public boolean matchMinGiftPurchase(double deductSum){
		return (getSALE_PRICE() - deductSum) >= getGIFT_MIN_PURCHASE_AMT();
	}
	public void setThumbnailUrl(String urlFormat) {
		if(null != this.getGIFT_STYLE() && !this.getGIFT_STYLE().isEmpty()
			&& null != urlFormat && !urlFormat.isEmpty()
			&& urlFormat.contains("%s")){
			String thumbnail = String.format(urlFormat, this.getGIFT_STYLE());
			
			//if(HTTPClient.isExist(thumbnail)) this.setThumbnail(thumbnail);
		}
	}
	public void incrementQty(){
			this.qty += 1;
	}
	@Override
	public String toString() {
		return "ItemGWPRule [ATG_SKU_ID=" + ATG_SKU_ID + ", CURRENCY_CODE="
				+ CURRENCY_CODE + ", SALE_PRICE=" + SALE_PRICE
				+ ", INSTIT_CDE=" + INSTIT_CDE + ", GWP_CDE=" + GWP_CDE
				+ ", LOC_CDE=" + LOC_CDE + ", SEQ_NO=" + SEQ_NO + ", GWP_DESC="
				+ GWP_DESC + ", GIFT_STYLE=" + GIFT_STYLE + ", GIFT_DESC="
				+ GIFT_DESC + ", GIFT_CURRENCY=" + GIFT_CURRENCY
				+ ", GIFT_VALUE=" + GIFT_VALUE + ", MAX_GIFT_QTY_PER_ORDER="
				+ MAX_GIFT_QTY_PER_ORDER + ", GIFT_MIN_PURCHASE_AMT="
				+ GIFT_MIN_PURCHASE_AMT + ", GIFT_DESC_MASK=" + GIFT_DESC_MASK
				+ ", GIFT_VALUE_MASK=" + GIFT_VALUE_MASK + ", thumbnail="
				+ thumbnail + ", qty=" + qty + "]";
	}
}
