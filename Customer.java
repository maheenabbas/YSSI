public class Customer implements OrderListener{
    @Override
    public void notify(int orderReady) {
        System.out.println("\n**************************************\n"
                +"\nOrder " + orderReady+ " is ready.\n"+
                "\n**************************************\n");
    }
}
