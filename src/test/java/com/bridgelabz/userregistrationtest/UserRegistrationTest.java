package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userregistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userregistration.isFirstNameValid("Samiksha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_MustHaveMinThreeLetters_ShouldReturn_True()
    {
        boolean result = userregistration.isFirstNameValid("Sam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_HaveLessThanThreeLetters_ShouldReturn_False()
    {
        boolean result = userregistration.isFirstNameValid("Sa");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveAllLowerCase_ShouldReturn_false()
    {
        boolean result = userregistration.isFirstNameValid("samiksha");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveDigits_ShouldReturn_false()
    {
        boolean result = userregistration.isFirstNameValid("samiksha27");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameHaveSpecialChar_ShouldReturn_false()
    {
        boolean result = userregistration.isFirstNameValid("samiksha@27");
        Assertions.assertFalse(result);
    }
}
