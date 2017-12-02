package Exercise11;

public class Account {
    double summa;
    Currency currency;


    public Account(double summa, Currency currency) {
        this.summa = summa;
        this.currency = currency;
    }


    public void deposit(double summa, Account account){

        IConvertor convertor = new Convertor();

        double summaInAccountCurrency = convertor.fromCurrencyToCurrency(summa, currency, account.currency);
        if (summaInAccountCurrency > account.summa){
            System.out.println("Недостаточно средств");
            return;
        }else{
            account.summa = account.summa - summaInAccountCurrency;
            this.summa = this.summa + summa;
        }
    }
}
