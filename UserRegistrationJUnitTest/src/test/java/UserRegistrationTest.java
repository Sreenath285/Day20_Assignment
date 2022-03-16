import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void validateFirstName_IsProper_ReturnTrue() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateFirstName("Sreenath");
        Assert.assertTrue(result);
    }

    @Test
    void validateFirstName_IsNonProper_ReturnFalse() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateFirstName("sree");
        Assert.assertFalse(result);
    }

    @Test
    void validateLastName_IsProper_ReturnTrue() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateLastName("Emidi");
        Assert.assertTrue(result);
    }

    @Test
    void validateLastName_IsNonProper_ReturnFalse() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateLastName("emidi");
        Assert.assertFalse(result);
    }

    @Test
    void validateEmail_IsProper_ReturnTrue() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateEmail("sreenath.285@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    void validateEmail_IsNonProper_ReturnFalse() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateEmail("sreenath.285gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    void validateMobileNumber_IsProper_ReturnTrue() throws InvalidDetailsException {

        boolean result = userRegistration.testValidateMobileNumber("91 7075734744");
        Assert.assertTrue(result);
    }

    @Test
    void validateMobileNumber_IsNonProper_ReturnFalse() throws InvalidDetailsException {
        boolean result = userRegistration.testValidateMobileNumber("7070743744");
        Assert.assertFalse(result);
    }

    @Test
    void validatePassword_IsProper_ReturnTrue() throws InvalidDetailsException {

        boolean result = userRegistration.testValidatePassword("Admin@285");
        Assert.assertTrue(result);
    }

    @Test
    void validatePassword_IsNonProper_ReturnFalse() throws InvalidDetailsException {

        boolean result = userRegistration.testValidatePassword("admin@#285");
        Assert.assertFalse(result);
    }
}