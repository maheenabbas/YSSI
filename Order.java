import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<Item> items;
	private double subtotal;
	private double total;
	private double salesTax;
	private static double taxRate = 0.08;
	private int orderNum;
	
	public Order() {
		OrderNumberGenerator orderNumberGenerator = OrderNumberGenerator.getInstance();
    orderNum = orderNumberGenerator.getOrderNumber();
		items = new ArrayList<>();
		subtotal = 0.00;
		total = 0.0;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

  public int getOrderNumber(){ return orderNum; }
  
	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public void addItem(Item item) {
		items.add(item);
		subtotal += item.getPrice();
	}

	public void removeItem(Item item) {
		items.remove(item);
		subtotal -= item.getPrice();
	}

	private double calculateTax() {
		return subtotal * taxRate;
	}

	public double getGrandTotal() {
		return subtotal + salesTax;
	}

	public class OrderItemsIterator implements Iterator {
		public int index;

		public OrderItemsIterator() {
			index = -1; 
		}

		public boolean hasNext() {
			return index < items.size() - 1;
		}

		public Item next() {
			index++;
			return items.get(index);
		}
	}

	public OrderItemsIterator getOrderItemsIterator() {
		return new OrderItemsIterator();
	}

	public void checkout() {
		salesTax = calculateTax();
		total = subtotal + salesTax;

		OrderItemsIterator orderItemsIterator = new OrderItemsIterator();
		while (orderItemsIterator.hasNext()) {
			orderItemsIterator.next().printItem();
		}

		System.out.println("Your order number is: " + orderNum);
		System.out.println(String.format("subtotal  :      $ %.2f" , subtotal));
		System.out.println(String.format("tax       :      $ %.2f" , salesTax));
		System.out.println(String.format("total     :      $ %.2f" , total) + "\n\n");
	}
}