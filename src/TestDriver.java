
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.checout(1500);
		cart1.setPaymentSatrateg(new CreditcardPayment());
		cart1.checout(2000);
		cart1.setPaymentSatrateg(new ScanPayment());
		cart1.checout(10000);

	}

}
