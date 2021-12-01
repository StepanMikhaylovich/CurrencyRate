package CurrencyRate.banks.belagroprombank;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("DailyExRates")
public class Currencies extends Bank {

    @XStreamAlias("Date")
    @XStreamAsAttribute
    String Date;

    @XStreamImplicit(itemFieldName = "Currency")
    private List<Currency> currency;

    public Currencies() {
    }

    public Currencies(List<Currency> currency) {
        this.currency = currency;
    }

    public String getDate() {
        return Date;
    }

    public List<Currency> getCurrency() {
        return currency;
    }

}
