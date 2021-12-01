package CurrencyRate.banks.belarusbank;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BelarusBank {
    @JsonProperty("USD_in")
    private double USD_in;

    @JsonProperty("USD_out")
    private double USD_out;

    @JsonProperty("EUR_in")
    private double EUR_in;

    @JsonProperty("EUR_out")
    private double EUR_out;

    @JsonProperty("RUB_in")
    private double RUB_in;

    @JsonProperty("RUB_out")
    private double RUB_out;

    @JsonProperty("GBP_in")
    private double GBP_in;

    @JsonProperty("GBP_out")
    private double GBP_out;

    @JsonProperty("CAD_in")
    private double CAD_in;

    @JsonProperty("CAD_out")
    private double CAD_out;

    @JsonProperty("PLN_in")
    private double PLN_in;

    @JsonProperty("PLN_out")
    private double PLN_out;

    @JsonProperty("UAH_in")
    private double UAH_in;

    @JsonProperty("UAH_out")
    private double UAH_out;

    @JsonProperty("SEK_in")
    private double SEK_in;

    @JsonProperty("SEK_out")
    private double SEK_out;

    @JsonProperty("CHF_in")
    private double CHF_in;

    @JsonProperty("CHF_out")
    private double CHF_out;

    @JsonProperty("USD_EUR_in")
    private double USD_EUR_in;

    @JsonProperty("USD_EUR_out")
    private double USD_EUR_out;

    @JsonProperty("USD_RUB_in")
    private double USD_RUB_in;

    @JsonProperty("USD_RUB_out")
    private double USD_RUB_out;

    @JsonProperty("RUB_EUR_in")
    private double RUB_EUR_in;

    @JsonProperty("RUB_EUR_out")
    private double RUB_EUR_out;

    @JsonProperty("JPY_in")
    private double JPY_in;

    @JsonProperty("JPY_out")
    private double JPY_out;

    @JsonProperty("CNY_in")
    private double CNY_in;

    @JsonProperty("CNY_out")
    private double CNY_out;

    @JsonProperty("CZK_in")
    private double CZK_in;

    @JsonProperty("CZK_out")
    private double CZK_out;

    @JsonProperty("NOK_in")
    private double NOK_in;

    @JsonProperty("NOK_out")
    private double NOK_out;

    @JsonProperty("filial_id")
    private String filial_id;

    @JsonProperty("sap_id")
    private String sap_id;

    @JsonProperty("info_worktime")
    private String info_worktime;

    @JsonProperty("street_type")
    private String street_type;

    @JsonProperty("street")
    private String street;

    @JsonProperty("filials_text")
    private String filials_text;

    @JsonProperty("home_number")
    private String home_number;

    @JsonProperty("name")
    private String name;

    @JsonProperty("name_type")
    private String name_type;

    public BelarusBank() {
    }

    public BelarusBank(double USD_in, double USD_out, double EUR_in, double EUR_out, double RUB_in, double RUB_out, double GBP_in, double GBP_out, double CAD_in, double CAD_out, double PLN_in, double PLN_out, double UAH_in, double UAH_out, double SEK_in, double SEK_out, double CHF_in, double CHF_out, double USD_EUR_in, double USD_EUR_out, double USD_RUB_in, double USD_RUB_out, double RUB_EUR_in, double RUB_EUR_out, double JPY_in, double JPY_out, double CNY_in, double CNY_out, double CZK_in, double CZK_out, double NOK_in, double NOK_out, String filial_id, String sap_id, String info_worktime, String street_type, String street, String filials_text, String home_number, String name, String name_type) {
        this.USD_in = USD_in;
        this.USD_out = USD_out;
        this.EUR_in = EUR_in;
        this.EUR_out = EUR_out;
        this.RUB_in = RUB_in;
        this.RUB_out = RUB_out;
        this.GBP_in = GBP_in;
        this.GBP_out = GBP_out;
        this.CAD_in = CAD_in;
        this.CAD_out = CAD_out;
        this.PLN_in = PLN_in;
        this.PLN_out = PLN_out;
        this.UAH_in = UAH_in;
        this.UAH_out = UAH_out;
        this.SEK_in = SEK_in;
        this.SEK_out = SEK_out;
        this.CHF_in = CHF_in;
        this.CHF_out = CHF_out;
        this.USD_EUR_in = USD_EUR_in;
        this.USD_EUR_out = USD_EUR_out;
        this.USD_RUB_in = USD_RUB_in;
        this.USD_RUB_out = USD_RUB_out;
        this.RUB_EUR_in = RUB_EUR_in;
        this.RUB_EUR_out = RUB_EUR_out;
        this.JPY_in = JPY_in;
        this.JPY_out = JPY_out;
        this.CNY_in = CNY_in;
        this.CNY_out = CNY_out;
        this.CZK_in = CZK_in;
        this.CZK_out = CZK_out;
        this.NOK_in = NOK_in;
        this.NOK_out = NOK_out;
        this.filial_id = filial_id;
        this.sap_id = sap_id;
        this.info_worktime = info_worktime;
        this.street_type = street_type;
        this.street = street;
        this.filials_text = filials_text;
        this.home_number = home_number;
        this.name = name;
        this.name_type = name_type;
    }

    public double getUSD_EUR_in() {
        return this.USD_EUR_in;
    }

    @Override
    public String toString() {
        return "BelarusBank{" +
                "USD_in='" + USD_in + '\'' +
                ", USD_out='" + USD_out + '\'' +
                ", EUR_in='" + EUR_in + '\'' +
                ", EUR_out='" + EUR_out + '\'' +
                ", RUB_in='" + RUB_in + '\'' +
                ", RUB_out='" + RUB_out + '\'' +
                ", street_type='" + street_type + '\'' +
                ", street='" + street + '\'' +
                ", home_number='" + home_number + '\'' +
                ", name='" + name + '\'' +
                ", name_type='" + name_type + '\'' +
                '}';
    }

}
