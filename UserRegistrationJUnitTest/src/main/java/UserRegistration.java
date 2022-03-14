import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String regexPattern;
    Scanner sc = new Scanner(System.in);

    /***
     * validateFirstName method created to check given first name matches the pattern or not
     */
    public boolean validateFirstName (String firstName) {

        regexPattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    /***
     * validateLastName method created to check given last name matches the pattern or not
     */
    public boolean validateLastName(String lastName) {

        regexPattern = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    /***
     * validateEmail method created to check given email matches the pattern or not
     */
    public boolean validateEmail(String email) {

        regexPattern = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}+(.[a-z]{2}+.[a-z]{2}+)*$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /***
     * validateMobileNumber method created to check given mobile number matches the pattern or not
     */
    public boolean validateMobileNumber(String mobileNumber) {

        regexPattern = "^(\\d{2}[- ]?){1}\\d{10}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    /***
     * validatePassword method created to check given password matches the pattern or not
     * password must contain minimum 8 characters
     * at least 1 upper case letter
     * at least 1 numeric number
     * exactly 1 special character
     */
    public boolean validatePassword(String password) {

        regexPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]{1})[A-Za-z\\d!@#$%^&*]{8,}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
