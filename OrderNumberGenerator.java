public class OrderNumberGenerator {
	private static OrderNumberGenerator instance = new OrderNumberGenerator();
	private int orderNumber;
	private OrderNumberGenerator() {
		orderNumber = 0;
	}

	public static OrderNumberGenerator getInstance() {
		return instance;
	}
  
	public int getOrderNumber() {
		orderNumber++;
		return orderNumber;
	}
}