package ua.lpnuai.Mamchur08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab12 {
    public static void main(String[] args) {

        System.out.println(dateChecker("Понеділок"));
        System.out.println(dateChecker("Середа"));
        System.out.println(dateChecker("неділя"));
        System.out.println(dateChecker("Понеділок "));
        System.out.println(dateChecker("Вівторок"));
    }

    public static boolean timeChecker(String string) {
        Pattern time = Pattern.compile("^\\d\\d[:]\\d\\d$");
        Matcher match = time.matcher(string);
        return match.matches();
    }

    public static boolean dateChecker(String string) {
        Pattern time = Pattern.compile("^Понеділок$|^Вівторок$|^Середа$|^Четвер$|^П'ятниця$|^Субота$|^Неділя$");
        Matcher match = time.matcher(string);
        return match.matches();
    }

    public static boolean numberChecker(String string) {
        Pattern time = Pattern.compile("^\\d\\d\\d\\d$");
        Matcher match = time.matcher(string);
        return match.matches();

    }
}
