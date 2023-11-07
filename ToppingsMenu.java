public class ToppingsMenu implements MenuInterface{
    @Override
    public void getMenu() {
        System.out.println(" Topping for the Yogurt?");
        System.out.println("        1: YES");
        System.out.println("        2: NO");
    }

    @Override
    public void getSize(String flavour) {

    }

    @Override
    public void getFlavour() {
        System.out.println(" Toppings: ");
        System.out.println("============================");
        System.out.println("        1. Chocolate Chip");
        System.out.println("        2. Sprinkles");
        System.out.println("        3. Fresh Fruits");
        System.out.println("        4. Syrup Topping");
        System.out.println("        5. Gummies");
        System.out.println("        6. Caramel Crunch");
        System.out.println("        7. Waffles");
        System.out.println("        8. M&Ms");
        System.out.println("        9. Mini Marshmallows");
        System.out.println("        10. Oreo Cookies");
        System.out.println("        11. Return to the Main Menu");
        System.out.println("============================");
    }
}
