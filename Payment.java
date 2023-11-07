import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Payment {

	public void processPayment(double total) {
		System.out.println("Select your payment method");
		System.out.println("============================");
		System.out.println("        1. $ Cash $   ");
		System.out.println("        2. Credit Card   ");
		System.out.println("============================");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int paymentOption = Integer.parseInt(br.readLine());

			StrategyFactory factory = new StrategyFactory(paymentOption);

			boolean paid = factory.paymentStrategy().pay(total);
			while (!paid) {
				System.out.println("payment failed. Please try again.");
				System.out.println("============================");
				paid = factory.paymentStrategy().pay(total);
			}

		} catch (Exception e) {

		}

	}
}
