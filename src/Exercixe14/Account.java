package Exercixe14;

import java.io.*;

import static Exercixe14.MainCurrency.accounts;

public class Account {

    double summa;
    Currency currency;


    public Account(double summa, Currency currency) {
        this.summa = summa;
        this.currency = currency;
    }

    public static void createAndPutNewAccount(double summa,Currency currency){
        accounts.add(new Account(summa,currency));
    }


    public void deposit(double summa, Account account){

        IConvertor icon = new Convertor();
        double summaInAccountCurrency = icon.fromCurrencyToCurrency(summa, currency, account.currency);
        if (summaInAccountCurrency > account.summa){
            System.out.println("Nedostatochno sredstv");
            return;
        }else{
            account.summa = account.summa - summaInAccountCurrency;
            this.summa = this.summa + summa;
            System.out.println("Vipolneno");
        }
    }

    public static void createAccount() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Currency newCurrency = null;
        System.out.println("Viberite valyutu scheta:\na) BYN\nb) USD\nc) EUR\nd) PLN\ne) Back");
        String currency = bf.readLine();
        switch (currency) {
            case "a":
                newCurrency = Currency.BYN;
                break;
            case "b":
                newCurrency = Currency.USD;
                break;
            case "c":
                newCurrency = Currency.EUR;
                break;
            case "d":
                newCurrency = Currency.PLN;
                break;
            case "e":
                menu();
        }
        createAndPutNewAccount(0, newCurrency);
        System.out.println("Nomer vashego scheta - " + (accounts.size() - 1));
        System.out.println("a) Menu");
        String m = bf.readLine();
        if (m.equals("a")) menu();
    }

    public static void putMoney() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite nomer vashego scheta");
        int accountNumber = Integer.parseInt(bf.readLine());
        System.out.println("Vvedite summu popoleniya");
        double moneyToPut = Double.parseDouble(bf.readLine());
        accounts.get(accountNumber).summa += moneyToPut;
        System.out.println("Schet popolnen");
        menu();
    }

    public static void sendMoney() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite nomer otpravitelya");
        int accountNumber1 = Integer.parseInt(bf.readLine());
        System.out.println("Vvedite nomer poluchatelya");
        int accountNumber2 = Integer.parseInt(bf.readLine());
        System.out.println("Vvedite summu perevoda");
        double moneyToSend = Double.parseDouble(bf.readLine());
        accounts.get(accountNumber2).deposit(moneyToSend, accounts.get(accountNumber1));
        System.out.println("a) Menu");
        String m = bf.readLine();
        if (m.equals("a")) menu();
    }
    public static void ballance() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vvedite nomer scheta");
        int accountNumber = Integer.parseInt(bf.readLine());
        System.out.print("Na schetu: ");
        System.out.println(accounts.get(accountNumber).summa + " " + accounts.get(accountNumber).currency);
        System.out.println("a) Menu");
        String m = bf.readLine();
        if (m.equals("a")) menu();
    }


    public static void menu() throws IOException {
        System.out.println("Viberite operaciyu:\n1. Sozdat schet\n2. Popolnit schet\n3. Perevesti dengi so scheta na schet\n4. Posmotret ballans\n5. Exit\n6. size\n7. save");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number =  Integer.parseInt(bf.readLine());
        switch (number){
            case 1:
                createAccount();
                break;
            case 2:
                putMoney();
                break;
            case 3:
                sendMoney();
                break;
            case 4:
                ballance();
                break;
            case 5:
                break;
            case 6:
            System.out.println("Kolichestvo schetov - " + accounts.size());
                System.out.println("a) Menu");
                String m = bf.readLine();
                if (m.equals("a")) menu();
//            case 7:
//                saveAccouts();
//                break;

        }
    }

//    public static void saveAccouts() throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/1.txt"));
//        oos.writeObject(accounts);
//        System.out.println("Sohraneno");
//        System.out.println("a) Menu");
//        String m = bf.readLine();
//        if (m.equals("a")) menu();
//    }
}
