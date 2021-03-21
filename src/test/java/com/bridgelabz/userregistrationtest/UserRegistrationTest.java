package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_true() {
        boolean result = userregistration.isFirstNameValid("Samiksha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_MustHaveMinThreeLetters_ShouldReturn_true() {
        boolean result = userregistration.isFirstNameValid("Sam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_HaveLessThanThreeLetters_ShouldReturn_false() {
        boolean result = userregistration.isFirstNameValid("Sa");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveAllLowerCase_ShouldReturn_false() {
        boolean result = userregistration.isFirstNameValid("samiksha");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveDigits_ShouldReturn_false() {
        boolean result = userregistration.isFirstNameValid("samiksha27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveSpecialChar_ShouldReturn_false() {
        boolean result = userregistration.isFirstNameValid("samiksha@27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("Shende");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_MustHaveMinThreeLetters_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("She");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_HaveLessThanThreeLetters_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("Sh");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveAllLowerCase_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("shende");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveDigits_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("Shende27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameHaveSpecialChar_ShouldReturn_false() {
        boolean result = userregistration.isLastNameValid("Shende@27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdDoNotHaveMandatoryPart1_ShouldReturn_false() {
        boolean result = userregistration.isEmailIdValid(".samiksha@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdDoNotHaveMandatoryPart2_ShouldReturn_false() {
        boolean result = userregistration.isEmailIdValid("shende.samiksha@.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdDoNotHaveMandatoryPart3_ShouldReturn_false() {
        boolean result = userregistration.isEmailIdValid("consultant@miracleindia..in");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdHaveAllMandatoryPart_ShouldReturn_true() {
        boolean result = userregistration.isEmailIdValid("support_etender@mahadiscom.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdHaveAllMandatoryAndOptionalPart_ShouldReturn_true() {
        boolean result = userregistration.isEmailIdValid("abc.100@abc.co.au");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberDoNotHaveSpace_ShouldReturn_false() {
        boolean result = userregistration.isMobileNumberValid("917896532149");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberDoNotHaveCountryCodeAndSpace_ShouldReturn_false() {
        boolean result = userregistration.isMobileNumberValid("9185694878");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberDoNotHave10Digit_ShouldReturn_false() {
        boolean result = userregistration.isMobileNumberValid("91 869757936");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberHaveAlphabates_ShouldReturn_false() {
        boolean result = userregistration.isMobileNumberValid("91 456987105O");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberHaveSpecialCharacter_ShouldReturn_false() {
        boolean result = userregistration.isMobileNumberValid("91 698745@369");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMobileNumberIsProper_ShouldReturn_true() {
        boolean result = userregistration.isMobileNumberValid("91 7865943589");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveMinimum8Characters_ShouldReturn_true() {
        boolean result = userregistration.isPasswordValid("Samiksha27");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveLessThan8Characters_ShouldReturn_false() {
        boolean result = userregistration.isPasswordValid("Sami");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleast1UpperCase_ShouldReturn_true() {
        boolean result = userregistration.isPasswordValid("Samiksha27");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordDoNotHaveAtleast1UpperCase_ShouldReturn_false() {
        boolean result = userregistration.isPasswordValid("samiksh27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleast1Digit_ShouldReturn_true() {
        boolean result = userregistration.isPasswordValid("Samiksha27");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordDoNotHaveAtleast1Digit_ShouldReturn_false() {
        boolean result = userregistration.isPasswordValid("samiksha");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveAtleast1SpecialCharacter_ShouldReturn_true() {
        boolean result = userregistration.isPasswordValid("Samiksha@27");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordDoNotHaveAtleast1SpecialCharacter_ShouldReturn_false() {
        boolean result = userregistration.isPasswordValid("samiksha27");
        Assertions.assertFalse(result);
    }

    @Test
    public void WhenEntrySuccessfull_ShouldReturn_true() {
        boolean isValid = true;
        String validateEntry = userregistration.isEntryValid(isValid);
        Assertions.assertEquals("HAPPY", validateEntry);
    }


    @Test
    public void WhenEntryNotSuccessfull_ShouldReturn_false() {
        boolean isValid = false;
        String validateEntry = userregistration.isEntryValid(isValid);
        Assertions.assertEquals("SAD", validateEntry);
    }

}