/* import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest{
    @Test
    void testOrder1() throws IOException {
        AYogurtStore store = new AYogurtStore();
        store.addlistener(new Customer());
        Order o = new Order();

        store.notify(o.getOrderNumber());
        assertTrue(o.getOrderNumber()==1);
    }

    @Test
    void testOrderIncreases(){
        AYogurtStore store = new AYogurtStore();
        store.addlistener(new Customer());
        Order o = new Order();
        store.notify(o.getOrderNumber());
        Order o1 = new Order();
        store.notify(o1.getOrderNumber());
        Order o2 = new Order();
        store.notify(o2.getOrderNumber());
        
        assertTrue(o2.getOrderNumber()==3);
    }
}
*/