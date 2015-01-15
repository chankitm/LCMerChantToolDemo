package model;

import java.util.Map;

public class GiftResult {
	Map<String,PurchasedItem> purchasedItems;
	ItemGWPRule matchedRule;
	int eligibleGiftQty;
	public GiftResult(Map<String, PurchasedItem> purchasedItems,
			int eligibleGiftQty) {
		super();
		this.purchasedItems = purchasedItems;
		this.eligibleGiftQty = eligibleGiftQty;
	}
	public Map<String, PurchasedItem> getPurchasedItems() {
		return purchasedItems;
	}
	public void setPurchasedItems(Map<String, PurchasedItem> purchasedItems) {
		this.purchasedItems = purchasedItems;
	}
	public ItemGWPRule getMatchedRule() {
		return matchedRule;
	}
	public void setMatchedRule(ItemGWPRule matchedRule) {
		this.matchedRule = matchedRule;
	}
	public int getEligibleGiftQty() {
		return eligibleGiftQty;
	}
	public void setEligibleGiftQty(int eligibleGiftQty) {
		this.eligibleGiftQty = eligibleGiftQty;
	}
	@Override
	public String toString() {
		return "GiftResult [purchasedItems=" + purchasedItems
				+ ", matchedRule=" + matchedRule + ", eligibleGiftQty="
				+ eligibleGiftQty + "]";
	}
}
