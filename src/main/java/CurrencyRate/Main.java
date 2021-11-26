package CurrencyRate;


import CurrencyRate.banks.belagroprombank.BelAgroPromBank;
import CurrencyRate.banks.belagroprombank.HelperBelAPB;
import CurrencyRate.banks.belarusbank.BelarusBank;
import CurrencyRate.banks.belarusbank.HelperBelB;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HelperBelAPB object = new HelperBelAPB();
        object.connectToBank();
        object.setPathToFile();
        object.parseToFile();
        BelAgroPromBank belAgroPromBank =  object.getCurrencyObject();
        HelperBelB helperBelB = new HelperBelB();
        helperBelB.connectToBank("Минск");
        helperBelB.parseUrlToFile();
        List<BelarusBank> b = helperBelB.parseFileToJava();
        System.out.println(b.get(9).getUSD_EUR_in());





    }
}
