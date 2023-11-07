public class CashStrategy implements PaymentStrategy {
	public boolean pay(double total) {
	     System.out.println(String.format("$%.2f paid with Cash", total));
	     return true;
	}
}