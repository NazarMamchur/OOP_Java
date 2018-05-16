package sample;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DayWeek {

    private ArrayList<String> days;

    public DayWeek(ArrayList<String> days) {
        for (int i = 0; i < days.size(); i++) {
            if(!dateChecker(days.get(i))) {
                days.set(i, "Invalid");
            }
        }
        this.days = days;
    }

    public ArrayList<String> getDays() {
        return days;
    }

    public static boolean dateChecker(String string) {
        Pattern time = Pattern.compile("^Понеділок$|^Вівторок$|^Середа$|^Четвер$|^П'ятниця$|^Субота$|^Неділя$");
        Matcher match = time.matcher(string);
        return match.matches();
    }

}
