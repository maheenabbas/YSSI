import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {


    AYogurtStore store = new AYogurtStore();

    store.addlistener(new Customer());

    store.turnOnRegister();
    
    
  }
}