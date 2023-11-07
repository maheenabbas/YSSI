public class SmoothieMenu implements MenuInterface{
    @Override
    public void getMenu() {

    }

    @Override
    public void getSize(String flavour) {
        System.out.println("You ordered " + flavour);
        System.out.println("Enter the size of Smoothie");
        System.out.println("------------------------------------");
        System.out.println("    1." + " Regular" + " " + flavour);
        System.out.println("    2." + " Large" + " " + flavour);
        System.out.println("------------------------------------");
    }

    @Override
    public void getFlavour() {
        System.out.println(" Smoothie ");
        System.out.println("============================");
        System.out.println("        1. Strawberry Banana            ");
        System.out.println("        2. Berry Banana             ");
        System.out.println("        3. Tropical Mango             ");
        System.out.println("        4. Banana Peanut Butter Protein             ");
        System.out.println("        5. Super Peanut Butter Cup             ");
        System.out.println("        6. Exit             ");
        System.out.println("============================");
    }
}
