package model;

import java.util.List;

import model.GWPRuleMask;

public class GWPRuleRequest {
	private List<GWPRuleMask> gwpRules;
	private boolean isEffOnly;
	private int giftPerOrder;
	public List<GWPRuleMask> getGwpRules() {
		return gwpRules;
	}
	public void setGwpRules(List<GWPRuleMask> gwpRules) {
		this.gwpRules = gwpRules;
	}
	public boolean isEffOnly() {
		return isEffOnly;
	}
	public void setEffOnly(boolean isEffOnly) {
		this.isEffOnly = isEffOnly;
	}
	public int getGiftPerOrder() {
		return giftPerOrder;
	}
	public void setGiftPerOrder(int giftPerOrder) {
		this.giftPerOrder = giftPerOrder;
	}
	@Override
	public String toString() {
		return "GWPRuleRequest [gwpRules=" + gwpRules + ", isEffOnly="
				+ isEffOnly + ", giftPerOrder=" + giftPerOrder
				+ ", toString()=" + super.toString() + "]";
	}
}
