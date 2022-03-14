import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmails {

    /***
     * validateEmails method created to check given emails match the pattern or not
     */
    public boolean validateEmails(String email) {

        String regexPattern = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
