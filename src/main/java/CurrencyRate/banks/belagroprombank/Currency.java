package CurrencyRate.banks.belagroprombank;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


@XStreamAlias("Currency")
public class Currency {

    @XStreamAlias("Id")
    @XStreamAsAttribute
    private int Id;
    @XStreamAlias("NumCode")
    private String NumCode;
    @XStreamAlias("CharCode")
    private String CharCode;
    @XStreamAlias("Scale")
    private String Scale;
    @XStreamAlias("Name")
    private String Name;
    @XStreamAlias("RateBuy")
    private String RateBuy;
    @XStreamAlias("RateSell")
    private String RateSell;
    @XStreamAlias("CityId")
    private String CityId;
    @XStreamAlias("BankId")
    private String BankId;

    public Currency() {
    }

    public Currency(String numCode, String charCode, String scale, String name, String rateBuy, String rateSell, String cityId, String bankId) {
        NumCode = numCode;
        CharCode = charCode;
        Scale = scale;
        Name = name;
        RateBuy = rateBuy;
        RateSell = rateSell;
        CityId = cityId;
        BankId = bankId;
    }

    public String getNumCode() {
        return NumCode;
    }

    public void setNumCode(String numCode) {
        NumCode = numCode;
    }

    public String getCharCode() {
        return CharCode;
    }

    public void setCharCode(String charCode) {
        CharCode = charCode;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRateBuy() {
        return RateBuy;
    }

    public void setRateBuy(String rateBuy) {
        RateBuy = rateBuy;
    }

    public String getRateSell() {
        return RateSell;
    }

    public void setRateSell(String rateSell) {
        RateSell = rateSell;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getBankId() {
        return BankId;
    }

    public void setBankId(String bankId) {
        BankId = bankId;
    }
}
