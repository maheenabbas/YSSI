import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Toppings {
    MenuInterface toppingsMenu = new ToppingsMenu();

    public void prepareTopping(Order order) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choose = 0;
        while(choose!= 2){
            choose =  Integer.parseInt(br.readLine());
            switch (choose){
                case 1:
                    toppingsMenu.getFlavour();
                    int chooseToppingsFlavour = Integer.parseInt(br.readLine());
                    switch (chooseToppingsFlavour){
                        case 1:
                            order.addItem(new Item("Chocolate Chip", 1.95, ""));
                            break;
                        case 2:
                            order.addItem(new Item("Sprinkles", 1.7, ""));
                            break;
                        case 3:
                            order.addItem(new Item("Fresh Fruits", 1.3, ""));
                            break;
                        case 4:
                            order.addItem(new Item("Syrup Topping", 1.3, ""));
                            break;
                        case 5:
                            order.addItem(new Item("Gummies", 1.3, ""));
                            break;
                        case 6:
                            order.addItem(new Item("Caramel Crunch", 1.3, ""));
                            break;
                        case 7:
                            order.addItem(new Item("Waffles", 1.3, ""));
                            break;
                        case 8:
                            order.addItem(new Item("M&Ms", 1.3, ""));
                            break;
                        case 9:
                            order.addItem(new Item("Mini Marshmallows", 1.3, ""));
                            break;
                        case 10:
                            order.addItem(new Item("Oreo Cookies", 1.3, ""));
                            break;
                        default:
                            System.out.println("Main Menu:");
                    }
                    break;
            }
            break;
        }

    }
}
