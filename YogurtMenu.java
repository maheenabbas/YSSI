public class YogurtMenu implements MenuInterface {
    @Override
    public void getMenu() {
        System.out.println(" Choose an item from the menu ");
        System.out.println("============================");
        System.out.println("        1. Yogurt   ");
        System.out.println("        2. Smoothie   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");
    }

    @Override
    public void getSize(String flavour) {
        System.out.println("You ordered " + flavour + " Yogurt");
        System.out.println("Enter the size of Yogurt");
        System.out.println("------------------------------------");
        System.out.println("    1." + " Small" + " " + flavour + " Yogurt ");
        System.out.println("    2." + " Regular" + " " + flavour + " Yogurt ");
        System.out.println("    3." + " Large " + "" + flavour + " Yogurt ");
        System.out.println("------------------------------------");
    }

    @Override
    public void getFlavour() {
        System.out.println("You ordered a Yogurt");
        System.out.println("\n\n");
        System.out.println(" Enter the flavor of Yogurt ");
        System.out.println("------------------------------");
        System.out.println("        1. Original        ");
        System.out.println("        2. White Peach        ");
        System.out.println("        3. Mango        ");
        System.out.println("        4. Vanilla        ");
        System.out.println("        5. Chocolate        ");
        System.out.println("        6. Pistachio        ");
        System.out.println("        7. Exit            ");
        System.out.println("------------------------------");
    }


}
