package CurrencyRate.utility;

import java.time.LocalDateTime;

public class MyTime {
    LocalDateTime timer;

    public MyTime() {
        this.timer = LocalDateTime.now();
    }

    public String getCurrentDate(){
        String date = Integer.toString(timer.getDayOfMonth())
                .concat(Integer.toString(timer.getMonthValue()))
                .concat(Integer.toString(timer.getYear()));
        return date;
    }

    public String getDateTime(){
        String dateTime =Integer.toString(timer.getHour())
                .concat(Integer.toString(timer.getMinute()))
                .concat(Integer.toString(timer.getDayOfMonth()))
                .concat(Integer.toString(timer.getMonthValue()))
                .concat(Integer.toString(timer.getYear()));
        return dateTime;
    }

}
