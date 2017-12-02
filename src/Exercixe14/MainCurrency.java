package Exercixe14;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static Exercixe14.Account.createAndPutNewAccount;
import static Exercixe14.Account.menu;

public class MainCurrency {
    public static ArrayList<Account> accounts = new ArrayList<Account>();
    public static void main(String[] args) throws IOException {
//        IConvertor convertor = new Convertor();
//        double result = convertor.fromCurrencyToCurrency(100, Currency.BYN, Currency.USD);
//        System.out.println(result);
//
//        Account a1 = new Account(100, Currency.USD);
//        Account a2 = new Account(100, Currency.BYN);
//
//        a2.deposit(100, a1);
//        System.out.println(a1.summa);
//        System.out.println(a2.summa);1
        createAndPutNewAccount(100, Currency.USD);
        createAndPutNewAccount(100, Currency.BYN);
        menu();



    }
}
