package Exercise11;

public class Main {
    public static void main(String[] args) {


        Account a1 = new Account(100, Currency.USD);
        Account a2 = new Account(100, Currency.BLR);

        a2.deposit(100, a1);
        System.out.println(a1.summa);
        System.out.println(a2.summa);
    }
}
