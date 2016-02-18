package model.oopg;

public class PaymentChannel {
	private String type;
	private Double amount;
	public PaymentChannel(String type, Double amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PaymentChannel [type=" + type + ", amount=" + amount + "]";
	}
}
