package Exercise11;

public interface  IConvertor {
    public  double fromCurrencyToUSD(double summa, Currency cur);
    public  double fromUSDToCurrency(double summa, Currency cur);
    public double fromCurrencyToCurrency(double summa, Currency from, Currency to);
}
