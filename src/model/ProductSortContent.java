package model;

import java.sql.Timestamp;
import java.util.List;

public class ProductSortContent{
	String productID;
	List<String> ancestorCategories;
//	String str_ancestorCategories="";
	java.sql.Timestamp startDate;
	String lcFacetColor1;
	Double displayPrice;
	String productKey;

	public ProductSortContent(String productID,
			List<String> ancestorCategories, Timestamp startDate,
			String lcFacetColor1, Double displayPrice) {
		super();
		this.productID = productID;
		this.ancestorCategories = ancestorCategories;
		this.startDate = startDate;
		this.lcFacetColor1 = lcFacetColor1;
		this.displayPrice = displayPrice;
		/*
		if(null!=this.ancestorCategories){
			for(String ac:this.ancestorCategories){
				this.str_ancestorCategories += ac;
			}
		}
		*/
	}
	
	public String getProductKey() {
		return productKey;
	}
	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public List<String> getAncestorCategories() {
		return ancestorCategories;
	}
	public void setAncestorCategories(List<String> ancestorCategories) {
		this.ancestorCategories = ancestorCategories;
	}
	/*
	public String getStr_ancestorCategories() {
		return str_ancestorCategories;
	}
	public void setStr_ancestorCategories(String str_ancestorCategories) {
		this.str_ancestorCategories = str_ancestorCategories;
	}
	*/
	public java.sql.Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(java.sql.Timestamp startDate) {
		this.startDate = startDate;
	}
	public String getLcFacetColor1() {
		return lcFacetColor1;
	}
	public void setLcFacetColor1(String lcFacetColor1) {
		this.lcFacetColor1 = lcFacetColor1;
	}
	public Double getDisplayPrice() {
		return displayPrice;
	}
	public void setDisplayPrice(Double displayPrice) {
		this.displayPrice = displayPrice;
	}
	@Override
	public String toString() {
		String s_ancestorCategory= "";
		for(Object ancestorCategory:getAncestorCategories()){
			if(null != ancestorCategory){
				if(ancestorCategory instanceof String){
					if("".contentEquals(s_ancestorCategory)){
						s_ancestorCategory += (String)ancestorCategory;
					}else{
						s_ancestorCategory += (", "+ (String)ancestorCategory);
					}
				}
			}
		}
		return "ProductSortContent [productID=" + productID
				+ ", ancestorCategories=" + s_ancestorCategory
//				+ ", str_ancestorCategories=" + str_ancestorCategories
				+ ", startDate=" + startDate + ", lcFacetColor1="
				+ lcFacetColor1  + ", displayPrice="
				+ displayPrice + "]";
	}
}
