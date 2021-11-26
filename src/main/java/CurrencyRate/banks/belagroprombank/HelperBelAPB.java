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
    private String monthDayYear = now.format(DateTimeFormatter.ofPattern(now.getMonthValue() + "/" + "24" + "/" + now.getYear()));
    private String addToFile = Integer.toString(now.getHour())
            .concat(Integer.toString(now.getDayOfMonth()))
            .concat(Integer.toString(now.getMonthValue()))
            .concat(Integer.toString(now.getYear()));
    private URL url;
    private File currencyFile;

    public HelperBelAPB() {

    }

    public void connectToBank() {
        try {
            this.url = new URL("https://belapb.by/CashExRatesDaily.php?ondate=".concat(monthDayYear));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void setPathToFile() {
        this.currencyFile = new File("C:\\Users\\ASUS\\IdeaProjects\\CurrencyRate\\src\\main\\resources\\belagroprombank\\"
                .concat("currency").concat(addToFile).concat(".xml"));
    }

    public void parseToFile() {
        try (FileWriter fileWriter = new FileWriter(this.currencyFile);
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

    public BelAgroPromBank getCurrencyObject() {
        XStream xStream = new XStream();
        xStream.addPermission(AnyTypePermission.ANY);
        xStream.processAnnotations(BelAgroPromBank.class);
        BelAgroPromBank belAgroPromBank = (BelAgroPromBank) xStream.fromXML(this.currencyFile);
        return belAgroPromBank;
    }


}
