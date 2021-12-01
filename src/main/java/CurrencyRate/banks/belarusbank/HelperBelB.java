package CurrencyRate.banks.belarusbank;

import CurrencyRate.utility.MyTime;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelperBelB {

    private File file;
    private URL url;
    private MyTime myTime;
    private String addToFile;

    public HelperBelB() {
        this.myTime = new MyTime();
        this.addToFile = myTime.getDateTime();
        this.file = new File("C:\\Users\\ASUS\\IdeaProjects\\CurrencyRate\\src\\main\\resources\\belarusbank\\".concat(addToFile).concat(".json"));

    }

    public boolean connectToBank(String city) {
        boolean flag;
        try {
            this.url = new URL("https://belarusbank.by/api/kursExchange?city=".concat(city));
            flag = true;
        } catch (MalformedURLException e) {
            flag = false;
            e.printStackTrace();
            System.out.println("Не удалось подключится к банку или найти город");
        }
        return flag;
    }

    public void parseUrlToFile() {
        int c;
        try (InputStreamReader inputStreamReader = new InputStreamReader(this.url.openStream());
             FileWriter fileWriter = new FileWriter(file)) {
            c = inputStreamReader.read();
            while (c != -1) {
                fileWriter.write(c);
                c = inputStreamReader.read();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BelarusBank> parseFileToJava() {
        List<BelarusBank> list = new ArrayList<>();
            ObjectMapper objectMapper = new ObjectMapper();
        try {
            BelarusBank[] belarusBanks = objectMapper.readValue(this.file, BelarusBank[].class);
            list.addAll(Arrays.asList(belarusBanks));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}
