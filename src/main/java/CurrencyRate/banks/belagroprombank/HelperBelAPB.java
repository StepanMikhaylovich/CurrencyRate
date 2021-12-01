package CurrencyRate.banks.belagroprombank;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class HelperBelAPB {

    private LocalDateTime now = LocalDateTime.now();
    private final String monthDayYear = now.format(DateTimeFormatter.ofPattern(now.getMonthValue() + "/" + now.getDayOfMonth() + "/" + now.getYear()));
    private final String addToFile = Integer.toString(now.getHour())
            .concat(Integer.toString(now.getDayOfMonth()))
            .concat(Integer.toString(now.getMonthValue()))
            .concat(Integer.toString(now.getYear()));
    private URL currencyURL;
    private URL bankInfoURL;
    private File currencyFile;
    private File bankInfoFile;
    private Currencies currencies;
    private Bank bank;

    public URL getCurrencyURL() {
        return currencyURL;
    }

    public URL getBankInfoURL() {
        return bankInfoURL;
    }

    public File getCurrencyFile() {
        return currencyFile;
    }

    public File getBankInfoFile() {
        return bankInfoFile;
    }

    public HelperBelAPB() {
        connectToBankCurrency();
    }

    public void connectToBankCurrency() {
        try {
            this.currencyURL = new URL("https://belapb.by/CashExRatesDaily.php?ondate=".concat(monthDayYear));
            this.bankInfoURL = new URL("https://belapb.by/ExBanks.php");
            setPathToFile();
            parseToFile(this.currencyURL, this.currencyFile);
            parseToFile(this.bankInfoURL, this.bankInfoFile);
            this.currencies = getCurrencyObject();
            this.bank = getBanksObject();
            System.out.println("object created");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void setPathToFile() {
        this.currencyFile = new File("C:\\Users\\ASUS\\IdeaProjects\\CurrencyRate\\src\\main\\resources\\belagroprombank\\currency\\"
                .concat("currency").concat(addToFile).concat(".xml"));
        this.bankInfoFile = new File("C:\\Users\\ASUS\\IdeaProjects\\CurrencyRate\\src\\main\\resources\\belagroprombank\\bankinfo\\"
                .concat("bankinfo").concat(addToFile).concat(".xml"));
    }

    public void parseToFile(URL url, File file) {
        try (FileWriter fileWriter = new FileWriter(file);
             InputStreamReader inputStreamReader = new InputStreamReader(url.openStream())) {
            int c = inputStreamReader.read();
            while (c != -1) {
                fileWriter.write(c);
                c = inputStreamReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Currencies getCurrencyObject() {
        XStream xStream = new XStream();
        xStream.addPermission(AnyTypePermission.ANY);
        xStream.processAnnotations(Currencies.class);
        return  (Currencies) xStream.fromXML(this.currencyFile);
//
    }

    public Bank getBanksObject() {
        XStream xStream = new XStream();
        xStream.addPermission(AnyTypePermission.ANY);
        xStream.processAnnotations(Bank.class);
        return  (Bank) xStream.fromXML(this.bankInfoFile);

    }

    public void showCurrency(String currency, int limit) {
        currencies.getCurrency().stream()
                .filter(currency1 -> currency1.getCharCode().equals(currency))
                .sorted((m, n) -> (int) ((n.getRateBuy() * 100000 - m.getRateBuy() * 100000)))
                .limit(limit)
                .forEach(currency1 -> bank.show(currency1.getBankId(),currency1));

    }

}
