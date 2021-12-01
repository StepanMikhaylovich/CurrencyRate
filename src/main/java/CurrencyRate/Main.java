package CurrencyRate;


import CurrencyRate.banks.belagroprombank.HelperBelAPB;

public class Main {
    public static void main(String[] args) {
        HelperBelAPB object = new HelperBelAPB();
        object.showCurrency("USD", 5);
    }
}
