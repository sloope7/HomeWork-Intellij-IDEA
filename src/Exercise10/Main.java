package Exercise10;

import static Exercise10.Value.$;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Vasia",new Account("1",10.5,$));
        Customer customer2 = new Customer("Petia",new Account("2",20.5,$));

    }
}