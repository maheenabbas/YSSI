import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<Order> allOrders;

    public Report() {
        allOrders = new ArrayList<>();
    }

    void addOrder(Order order){
        allOrders.add(order);
    }

  public class AllOrdersIterator implements Iterator {
		public int index;

		public AllOrdersIterator() {
			index = -1; // This indicates our place in the list. Initialized to -1 so the 0th is returned by next() on its first call.
		}

		public boolean hasNext() {
			return index < allOrders.size() - 1;
		}

		public Order next() {
			index++;
			return allOrders.get(index);
		}
	}

	public AllOrdersIterator getAllOrdersIterator() {
		return new AllOrdersIterator();
	}
    
    void dailyReport(){
        double netSales = 0.0;
        double taxOwed = 0.0;

        AllOrdersIterator allOrdersIterator = new AllOrdersIterator();
        while(allOrdersIterator.hasNext()) {
        	Order order = allOrdersIterator.next();
            netSales += order.getSubtotal();
            taxOwed += order.getSalesTax();
        }

        System.out.println(String.format("Net Sales          :      $ %.2f" , netSales));
        System.out.println(String.format("Tax Owed           :      $ %.2f" , taxOwed));
        System.out.println(String.format("Total Sales + Tax  :      $ %.2f" , (taxOwed + netSales)));
        //System.out.println("Net Sales          :   " + netSales);
        //System.out.println("Tax Owed           :   " + taxOwed);
        //System.out.println("Total Sales + Tax  :   " + (taxOwed+netSales));
    }
}
