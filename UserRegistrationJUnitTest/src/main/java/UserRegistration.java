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
     * created testValidateFirstName method to check the exception
     * @param firstName - passing first name
     * @return - returns true if first name pattern is correct
     * @throws InvalidDetailsException - throw custom exception
     */
    public boolean testValidateFirstName(String firstName) throws InvalidDetailsException {
        try {
            if (!validateFirstName(firstName)) {
                throw new InvalidDetailsException("Entered first name is invalid");
            }
            else {
                System.out.println("Entered first name is valid");
            }
        }
        catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        return validateFirstName(firstName);
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
     * created testValidateLastName method to check the exception
     * @param lastName - passing last name
     * @return - returns true if first name pattern is correct
     * @throws InvalidDetailsException - throw custom exception
     */
    public boolean testValidateLastName(String lastName) throws InvalidDetailsException {
        try {
            if (!validateLastName(lastName)) {
                throw new InvalidDetailsException("Entered last name is invalid");
            }
            else {
                System.out.println("Entered last name is valid");
            }
        }
        catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        return validateLastName(lastName);
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
     * created testValidateEmail method to check the exception
     * @param email - passing email id
     * @return - returns true if first name pattern is correct
     * @throws InvalidDetailsException - throw custom exception
     */
    public boolean testValidateEmail(String email) throws InvalidDetailsException {
        try {
            if (!validateEmail(email)) {
                throw new InvalidDetailsException("Entered email is invalid");
            }
            else {
                System.out.println("Entered email is valid");
            }
        }
        catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        return validateEmail(email);
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
     * created testValidateMobileNumber method to check the exception
     * @param mobileNumber - passing mobile number
     * @return - returns true if first name pattern is correct
     * @throws InvalidDetailsException - throw custom exception
     */
    public boolean testValidateMobileNumber(String mobileNumber) throws InvalidDetailsException {
        try {
            if (!validateMobileNumber(mobileNumber)) {
                throw new InvalidDetailsException("Entered mobile number is invalid");
            }
            else {
                System.out.println("Entered mobile number is valid");
            }
        }
        catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        return validateMobileNumber(mobileNumber);
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

    /***
     * created testValidatePassword method to check the exception
     * @param password - passing password
     * @return - returns true if first name pattern is correct
     * @throws InvalidDetailsException - throw custom exception
     */
    public boolean testValidatePassword(String password) throws InvalidDetailsException {
        try {
            if (!validateMobileNumber(password)) {
                throw new InvalidDetailsException("Entered password is invalid");
            }
            else {
                System.out.println("Entered password is valid");
            }
        }
        catch (InvalidDetailsException e) {
            System.out.println(e.getMessage());
        }
        return validatePassword(password);
    }
}
