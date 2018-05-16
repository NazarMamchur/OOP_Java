package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BusTime {

    private String time;

    public BusTime(String time) {

        if(timeChecker(time)) {
            this.time = time;
        }
        else {
            this.time = "Invalid";
        }
    }

    public String getTime() {
        return time;
    }

    public boolean isValid() {
        return this.time.length() == 5;
    }

    public static boolean timeChecker(String string) {
        Pattern time = Pattern.compile("^\\d\\d[:]\\d\\d$");
        Matcher match = time.matcher(string);
        return match.matches();
    }
}
