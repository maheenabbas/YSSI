import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreditCardStrategy implements PaymentStrategy {
	public boolean pay(double total) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your credit card number:");
			System.out.println("============================");
			String creditCardNumber = br.readLine();
			var valid = Validate(creditCardNumber, 0);
			if (!valid) {
				System.out.println("Credit card number incorrect number of digits");
				return false;
			}

			System.out.println("Enter the expiration month:");
			System.out.println("============================");
			String creditCardMonth = br.readLine();
			valid = Validate(creditCardMonth, 1);
			if (!valid) {
				System.out.println("Credit card month incorrect number of digits");
				return false;
			}

			System.out.println("Enter the expiration year:");
			System.out.println("============================");
			String creditCardYear = br.readLine();
			valid = Validate(creditCardYear, 2);
			if (!valid) {
				System.out.println("Credit card year incorrect number of digits");
				return false;
			}

			System.out.println("Enter the cvv:");
			System.out.println("============================");
			String creditCardCvv = br.readLine();
			valid = Validate(creditCardCvv, 3);
			if (!valid) {
				System.out.println("Credit card cvv incorrect number of digits");
				return false;
			}

			System.out.println(String.format("$%.2f paid with Credit Card", total));

			return true;
		}

		catch (Exception ex) {
			return false;
		}
	}

	private boolean Validate(String input, int ccProperty) {
		try {
			long d = Long.parseLong(input);

			if (ccProperty == 0) {
				if (input.length() != 16) {
					return false;
				}
			} else if (ccProperty == 1) {
				if (input.length() != 2) {
					return false;
				}
			} else if (ccProperty == 2) {
				if (input.length() != 4) {
					return false;
				}
			} else if (ccProperty == 3) {
				if (input.length() != 3) {
					return false;
				}
			}

			return true;
		} catch (Exception ex) {
			return false;
		}
	}
}