import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AYogurtStore {

    private Report dailyReport;
    AYogurtStore(){
        dailyReport = new Report();
    }
    void turnOnRegister() throws IOException {

        OrderBuilder orderBuilder = new OrderBuilder();
        Order order;
        Payment payment = new Payment();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;
        while(choice < 3){

            System.out.println("        Cash Register       ");
            System.out.println("============================");
            System.out.println("        1. Take Order.   ");
            System.out.println("        2. Produce daily report   ");
            System.out.println("        3. Exit            ");
            System.out.println("============================");
            choice = Integer.parseInt(br.readLine());
            if(choice == 1){
                order = orderBuilder.prepareOrder();
                order.checkout();
                dailyReport.addOrder(order);
                var grandTotal = order.getGrandTotal();
                if (grandTotal > 0) {
                    payment.processPayment(grandTotal);
                }

                notify(order.getOrderNumber());
            }
            if(choice ==2){
                dailyReport.dailyReport();
            }
            if(choice<1){ System.out.println("invalid choice\n");}
        }

        System.out.println("Register Shutting Down......");

    }







    private List<OrderListener> orderListeners = new ArrayList<>();

    public void addlistener(OrderListener orderListener){
        orderListeners.add(orderListener);
    }
    public void removeListener(OrderListener orderListener){
        orderListeners.remove(orderListener);
    }
    public void notify(int something){
        for(OrderListener l: orderListeners){
            l.notify(something);
        }
    }


}
