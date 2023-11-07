import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class OrderBuilder {

    Toppings toppings = new Toppings();
    public Order prepareOrder() throws IOException {
        Order itemsOrder = new Order();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MenuInterface yogurtMenu = new YogurtMenu();
        MenuInterface smoothieMenu = new SmoothieMenu();
        MenuInterface toppingsMenu = new ToppingsMenu();

      
        int yogurtandsmoothiechoice = 0;
      
        while (yogurtandsmoothiechoice != 3) {
            yogurtMenu.getMenu();
            yogurtandsmoothiechoice = Integer.parseInt(br.readLine());
            switch (yogurtandsmoothiechoice) {
                case 1: {
                    yogurtMenu.getFlavour();
                    int yogurtchoice = Integer.parseInt(br.readLine());
                    switch (yogurtchoice) {
                        case 1: {
                            yogurtMenu.getSize("Original");
                            int originalyogurtsize = Integer.parseInt(br.readLine());
                            switch (originalyogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("original yogurt", 4.95, "Small"));
                                    
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("original yogurt", 6.95, "Regular"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("original yogurt", 7.95, "Large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }


                        case 2: {
                            yogurtMenu.getSize("White Peach");
                            int whitepeachyogurtsize = Integer.parseInt(br.readLine());
                            switch (whitepeachyogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("White Peach yogurt", 4.95, "small"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("White Peach yogurt", 6.95, "Regular"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("White Peach yogurt", 7.95, "Large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }
                        case 3: {
                            yogurtMenu.getSize("Mango");
                            int mangoyogurtsize = Integer.parseInt(br.readLine());
                            switch (mangoyogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Mango yogurt", 4.95, "small"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("Mango yogurt", 6.95, "regular"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("Mango yogurt", 7.95, "large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }
                        case 4: {
                            yogurtMenu.getSize("Vanilla");
                            int vanillayogurtsize = Integer.parseInt(br.readLine());
                            switch (vanillayogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Vanilla yogurt", 4.95, "small"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("Vanilla yogurt", 6.95, "regular"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("Vanilla yogurt", 7.95, "large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }
                        case 5: {
                            yogurtMenu.getSize("Chocolate");
                            int chocolateyogurtsize = Integer.parseInt(br.readLine());
                            switch (chocolateyogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Chocolate yogurt", 4.95, "small"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("Chocolate yogurt", 6.95, "large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("Chocolate yogurt", 4.95, "large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }
                        case 6: {
                            yogurtMenu.getSize("Pistachio");
                            int Pistachioyogurtsize = Integer.parseInt(br.readLine());
                            switch (Pistachioyogurtsize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Pistachio yogurt", 4.95, "small"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 2:
                                    itemsOrder.addItem(new Item("Pistachio yogurt", 6.95, "regular"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                                case 3:
                                    itemsOrder.addItem(new Item("Pistachio yogurt", 7.95, "large"));
                                    toppingsMenu.getMenu();
                                    toppings.prepareTopping(itemsOrder);
                                    break;
                            }
                            break;
                        }
                        default: System.out.println("testing default");
                    }
                    break;
                }
                case 2: {
                    smoothieMenu.getFlavour();
                    int smoothie = Integer.parseInt(br.readLine());
                    switch (smoothie) {
                        case 1: {
                            smoothieMenu.getSize("Strawberry Banana");
                            int strawberrybananasize = Integer.parseInt(br.readLine());
                            switch (strawberrybananasize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Strawberry Banana Smoothie", 6.75, "regular"));
                                    break;

                                case 2:
                                    itemsOrder.addItem(new Item("Strawberry Banana Smoothie", 7.75, "large"));
                                    break;

                            }
                            break;
                        }
                        case 2: {
                            smoothieMenu.getSize("Berry Banana");
                            int berrybananasize = Integer.parseInt(br.readLine());
                            switch (berrybananasize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Berry Banana Smoothie", 6.75, "regular"));
                                    break;

                                case 2:
                                    itemsOrder.addItem(new Item("Berry Banana Smoothie", 7.75, "large"));
                                    break;

                            }

                            break;
                        }
                        case 3: {
                            smoothieMenu.getSize("Topical Mango");
                            int tropicalmangosize = Integer.parseInt(br.readLine());
                            switch (tropicalmangosize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Tropical Mango Smoothie", 6.75, "regular"));
                                    break;

                                case 2:
                                    itemsOrder.addItem(new Item("Tropical Mango Smoothie", 7.75, "large"));
                                    break;

                            }
                            break;
                        }
                        case 4: {
                            smoothieMenu.getSize("Banana Peanut Butter Protein");
                            int bananapeanutbuttersize = Integer.parseInt(br.readLine());
                            switch (bananapeanutbuttersize) {
                                case 1:
                                    itemsOrder.addItem(new Item("Banana Peanut Butter", 6.95, "regular"));
                                    break;

                                case 2:
                                    itemsOrder.addItem(new Item("Banana Peanut Butter", 7.95, "large"));
                                    break;
                            }
                            break;
                        }
                        case 5: {
                            smoothieMenu.getSize("Super Peanut Butter Cup");
                            int superpeanutbutter = Integer.parseInt(br.readLine());
                            switch (superpeanutbutter) {
                                case 1:
                                    itemsOrder.addItem(new Item("Super Peanut Butter Cup", 6.95, "regular"));
                                    break;

                                case 2:
                                    itemsOrder.addItem(new Item("Super Peanut Butter Cup", 7.95, "large"));
                                    break;

                            }
                            break;
                        }
                    }
                }
              case 3:
                System.out.println("\nThank you, come again\n");
                break;
              default:
                System.out.println("You have not chosen an item from the list");
                break;  

            }


        }return itemsOrder;
    }
}