package CurrencyRate.banks.belagroprombank;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.*;

@XStreamAlias("DailyExRates")
public class BelAgroPromBank {

    @XStreamAlias("Date")
    @XStreamAsAttribute
    String Date;

    @XStreamImplicit(itemFieldName = "Currency")
    private List<Currency> currency = new ArrayList<>();

    public BelAgroPromBank() {
    }

    public BelAgroPromBank(List<Currency> currency) {
        this.currency = currency;
    }

    public void showCurrency(){
        for (Currency currency : currency){
            System.out.println(currency.getRateBuy());
        }
    }
}
