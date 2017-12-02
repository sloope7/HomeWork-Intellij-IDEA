package Exercixe14;

import java.util.HashMap;


public class Convertor implements IConvertor {

    HashMap<Currency,Double> courses = new HashMap<Currency,Double>();
    {
        courses.put(Currency.BYN,1.00);
        courses.put(Currency.USD,1.99);
        courses.put(Currency.EUR,2.33);
        courses.put(Currency.PLN,0.55);

    }

    public double fromCurrencyToBYN(double summa, Currency cur){
        return summa * courses.get(cur);
    }
    public double fromBYNToCurrency(double summa, Currency cur){
        return summa / courses.get(cur);
    }

    public double fromCurrencyToCurrency(double summa, Currency from, Currency to){
        double summaInUsd = fromCurrencyToBYN(summa, from);
        return fromBYNToCurrency(summaInUsd, to);
    }
}
