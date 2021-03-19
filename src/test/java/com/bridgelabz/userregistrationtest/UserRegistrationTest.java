package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userregistration.isFirstNameValid("Samiksha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_MustHaveMinThreeLetters_ShouldReturn_True() {
        boolean result = userregistration.isFirstNameValid("Sam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_HaveLessThanThreeLetters_ShouldReturn_False() {
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
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userregistration.isLastNameValid("Shende");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_MustHaveMinThreeLetters_ShouldReturn_True() {
        boolean result = userregistration.isLastNameValid("She");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_HaveLessThanThreeLetters_ShouldReturn_False() {
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
    public void givenEmailId_WhenEmailIdDoNotHaveMandatoryPart2_ShouldReturn_True() {
        boolean result = userregistration.isEmailIdValid("shende.samiksha@.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenEmailIdDoNotHaveMandatoryPart3_ShouldReturn_False() {
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
}

