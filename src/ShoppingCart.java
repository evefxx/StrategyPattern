
public class ShoppingCart{
	private PaymentStrategy paymentSatrategy;
	
	public ShoppingCart() {
		this.paymentSatrategy = new CashPayment();
	}
	
	public void setPaymentSatrateg(PaymentStrategy strategy) {
		this.paymentSatrategy = strategy;
	}
	
	public void checout(int amount) {
		paymentSatrategy.pay(amount);
	}
	
}
