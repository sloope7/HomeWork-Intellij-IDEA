package Exercixe14;

public interface IConvertor {
    public  double fromCurrencyToBYN(double summa, Currency cur);
    public  double fromBYNToCurrency(double summa, Currency cur);
    public  double fromCurrencyToCurrency(double summa, Currency from, Currency to);
}
