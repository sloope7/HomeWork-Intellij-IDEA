package Exercise11;

public class Convertor implements IConvertor {

    public double fromCurrencyToUSD(double summa, Currency cur){
        if (cur == Currency.BLR){
            return summa/1.97;
        }
        if (cur == Currency.EUR){
            return summa*1.16;
        }
        if (cur == Currency.PLN){
            return summa/3.64;
        }
        if (cur == Currency.USD){
            return summa;
        }
        return 0;
    }
    public double fromUSDToCurrency(double summa, Currency cur){
        if (cur == Currency.BLR){
            return summa*1.97;
        }
        if (cur == Currency.EUR){
            return summa/1.16;
        }
        if (cur == Currency.PLN){
            return summa*3.64;
        }
        if (cur == Currency.USD){
            return summa;
        }
        return 0;
    }

    public double fromCurrencyToCurrency(double summa, Currency from, Currency to){
        double summaInUsd = fromCurrencyToUSD(summa, from);
        return fromUSDToCurrency(summaInUsd, to);
    }
}
