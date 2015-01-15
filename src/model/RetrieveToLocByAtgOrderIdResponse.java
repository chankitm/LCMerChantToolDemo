package model;

import java.util.List;

import model.OomsItem;

public class RetrieveToLocByAtgOrderIdResponse extends BaseResponse {
	List<OomsItem> oomsItems;

	public List<OomsItem> getOomsItems() {
		return oomsItems;
	}
	public void setOomsItems(List<OomsItem> oomsItems) {
		this.oomsItems = oomsItems;
	}
	@Override
	public String toString() {
		return "RetrieveToLocByAtgOrderIdResponse [oomsItems=" + oomsItems
				+ ", toString()=" + super.toString() + "]";
	}
}
