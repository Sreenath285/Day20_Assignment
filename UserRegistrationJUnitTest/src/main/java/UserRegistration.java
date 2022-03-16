import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public String regexPattern;

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) throws InvalidDetailsException {
        /***
         * PROCEDURE
         * 1. created user registration object
         * 2. created validateEnteredFirstName lambda function
         * 3. created validateEnteredLastName lambda function
         * 4. created validateEnteredEmail lambda function
         * 5. created validateEnteredMobileNumber lambda function
         * 6. created validateEnteredPassword lambda function
         */
        Scanner sc = new Scanner(System.in);
        /***
         * 1. created user registration object
         */
        UserRegistration userRegistration = new UserRegistration();
        /***
         * 2. created validateEnteredFirstName lambda function
         */
        IUserRegistration validateEnteredFirstName = () -> {
            System.out.print("Enter first name : ");
            String firstName = sc.next();
            return userRegistration.testValidateFirstName(firstName);
        };
        validateEnteredFirstName.userRegistration();
        /***
         * 3. created validateEnteredLastName lambda function
         */
        IUserRegistration validateEnteredLastName = () -> {
            System.out.print("Enter last name : ");
            String lastName = sc.next();
            return userRegistration.testValidateLastName(lastName);
        };
        validateEnteredLastName.userRegistration();
        /***
         * 4. created validateEnteredEmail lambda function
         */
        IUserRegistration validateEnteredEmail = () -> {
            System.out.print("Enter email id : ");
            String email = sc.next();
            return userRegistration.testValidateEmail(email);
        };
        validateEnteredEmail.userRegistration();
        /***
         * 5. created validateEnteredMobileNumber lambda function
         */
        IUserRegistration validateEnteredMobileNumber = () -> {
            System.out.print("Enter mobile number : ");
            String mobileNumber = sc.next();
            return userRegistration.testValidateMobileNumber(mobileNumber);
        };
        validateEnteredMobileNumber.userRegistration();
        /***
         * 6. created validateEnteredPassword lambda function
         */
        IUserRegistration validateEnteredPassword = () -> {
            System.out.print("Enter password : ");
            String password = sc.next();
            return userRegistration.testValidatePassword(password);
        };
        validateEnteredPassword.userRegistration();
    }

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
            if (!validatePassword(password)) {
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
