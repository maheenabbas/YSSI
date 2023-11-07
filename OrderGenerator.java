public class OrderGenerator {
	static int orderNumber = 0;

	int getOrderNumber() {
		orderNumber++;
		return orderNumber;
	}
}