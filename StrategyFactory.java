//Done
public class StrategyFactory {
	private PaymentStrategy paymentStrategy;
	
	public StrategyFactory(int paymentOption) {
		if (paymentOption == 1) {
			this.paymentStrategy = new CashStrategy();
		} else if (paymentOption == 2) {
			this.paymentStrategy = new CreditCardStrategy();
		}
	}

	public PaymentStrategy paymentStrategy() {
		return this.paymentStrategy;
	}
}
