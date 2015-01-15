package model;

import java.util.List;


public class MerchToolSortRequest {
	private String SearchMethod;
	private String TargetCategory_ID;
	private String TargetNewIn_SearchMode;
	private String TargetNewIn_Date;
	private String TargetBrand_ID;
	private String TargetBrand_BU;

	private String Region;
	private List<String> Colour;
	private List<String> SubCategory;
	private String NewestIn;
	private String PricePoint;
//	private String StockLevel;
	private List<String> SortLevel;
	private String CallerReferenceNo;

	private boolean Cache = true;//default: enable the Cache feature
	private boolean PurgeCache = false;//default: disable the purge cache logic flow
	private boolean testMode = false;//default: disabled
	
	public String getSearchMethod() {
		return SearchMethod;
	}
	public void setSearchMethod(String searchMethod) {
		SearchMethod = searchMethod;
	}
	public String getTargetCategory_ID() {
		return TargetCategory_ID;
	}
	public void setTargetCategory_ID(String targetCategory_ID) {
		TargetCategory_ID = targetCategory_ID;
	}
	public String getTargetNewIn_SearchMode() {
		return TargetNewIn_SearchMode;
	}
	public void setTargetNewIn_SearchMode(String targetNewIn_SearchMode) {
		TargetNewIn_SearchMode = targetNewIn_SearchMode;
	}
	public String getTargetNewIn_Date() {
		return TargetNewIn_Date;
	}
	public void setTargetNewIn_Date(String targetNewIn_Date) {
		TargetNewIn_Date = targetNewIn_Date;
	}
	public String getTargetBrand_ID() {
		return TargetBrand_ID;
	}
	public void setTargetBrand_ID(String targetBrand_ID) {
		TargetBrand_ID = targetBrand_ID;
	}
	public String getTargetBrand_BU() {
		return TargetBrand_BU;
	}
	public void setTargetBrand_BU(String targetBrand_BU) {
		TargetBrand_BU = targetBrand_BU;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getPricePoint() {
		return PricePoint;
	}
	public void setPricePoint(String pricePoint) {
		PricePoint = pricePoint;
	}
	public String getNewestIn() {
		return NewestIn;
	}
	public void setNewestIn(String newestIn) {
		NewestIn = newestIn;
	}
/*
	public String getStockLevel() {
		return StockLevel;
	}
	public void setStockLevel(String stockLevel) {
		StockLevel = stockLevel;
	}
	*/
	public List<String> getSortLevel() {
		return SortLevel;
	}
	public void setSortLevel(List<String> sortLevel) {
		SortLevel = sortLevel;
	}
	public List<String> getColour() {
		return Colour;
	}
	public void setColour(List<String> colour) {
		Colour = colour;
	}
	public List<String> getSubCategory() {
		return SubCategory;
	}
	public void setSubCategory(List<String> subCategory) {
		SubCategory = subCategory;
	}
	public String getCallerReferenceNo() {
		return CallerReferenceNo;
	}
	public void setCallerReferenceNo(String callerReferenceNo) {
		CallerReferenceNo = callerReferenceNo;
	}
	public boolean isCache() {
		return Cache;
	}
	public void setCache(boolean cache) {
		Cache = cache;
	}
	public boolean isPurgeCache() {
		return PurgeCache;
	}
	public void setPurgeCache(boolean purgeCache) {
		PurgeCache = purgeCache;
	}
	public boolean isTestMode() {
		return testMode;
	}
	public void setTestMode(boolean testMode) {
		this.testMode = testMode;
	}
	//Search Logic
	/*
	public boolean isOneDimensionSort(){
		return (null == this.getSortLevel())?false:(this.getSortLevel().size() == 1)?true:false;
	}
	public boolean isSortbyPricePoint(){
		return (null == this.getSortLevel())?false:(this.getSortLevel().contains(MerchandiseToolConstants.SORT_PRI_PRICE))?true:false;
	}
	public boolean isSortbyNewestIn(){
		return (null == this.getSortLevel())?false:(this.getSortLevel().contains(MerchandiseToolConstants.SORT_PRI_NEWESTIN))?true:false;
	}
	*/
	
	// Cache logic
	public String getCacheKey() {
		return SearchMethod + TargetCategory_ID + TargetNewIn_SearchMode
				+ TargetNewIn_Date + TargetBrand_ID + TargetBrand_BU + Cache
				+ PurgeCache + Region + Colour + SubCategory + NewestIn
				+ PricePoint + SortLevel;
	}
	@Override
	public String toString() {
		return "MerchToolSortRequest [SearchMethod=" + SearchMethod
				+ ", TargetCategory_ID=" + TargetCategory_ID
				+ ", TargetNewIn_SearchMode=" + TargetNewIn_SearchMode
				+ ", TargetNewIn_Date=" + TargetNewIn_Date
				+ ", TargetBrand_ID=" + TargetBrand_ID + ", TargetBrand_BU="
				+ TargetBrand_BU + ", Region=" + Region + ", Colour=" + Colour
				+ ", SubCategory=" + SubCategory + ", NewestIn=" + NewestIn
				+ ", PricePoint=" + PricePoint + ", SortLevel=" + SortLevel
				+ ", CallerReferenceNo=" + CallerReferenceNo + ", Cache="
				+ Cache + ", PurgeCache=" + PurgeCache + ", testMode="
				+ testMode + "]";
	}
}
