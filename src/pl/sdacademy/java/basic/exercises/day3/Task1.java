package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static final String REGEX_EMAIL = "[A-Za-z0-9._]+@[a-z]+([.]{1}[a-z]+)+";

    public static void main(String[] args) {
    /*
    wielkie/małe litery, cufry, . _ @małe litery + kropka i po niej tekst + opcjonalnie znowu kropka i tekst
    aaa@wp.pl
    bbb@poczta.onet.pl.fdsfds.fsdfsdf.jjjj.hhhh

    ccc@com

    a? -> zero or one
    a* -> zero or more
    a+ -> one or more
     */
        String email1 = "sda@com.pl.pl";
        System.out.println(isCorrectEmailFormat(email1));
    }

    private static boolean isCorrectEmailFormat(String emailAddress) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        //return pattern.matcher(emailAddress).matches();
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
