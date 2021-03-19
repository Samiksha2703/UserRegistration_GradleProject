package com.bridgelabz.userregistration;

public class UserRegistration {

    public boolean isFirstNameValid(String firstName){
        if (firstName.matches("^[A-Z]+[a-z]{2,}$"))
            return true;
        else
            return false;
    }

    public boolean isLastNameValid(String firstName){
        if (firstName.matches("^[A-Z]+[a-z]{2,}$"))
            return true;
        else
            return false;
    }

    public boolean isEmailIdValid(String emailId) {
        if (emailId.matches("^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4})?$"))
            return true;
        else
            return false;
    }

    public boolean isMobileNumberValid(String mobile) {
        if (mobile.matches("^[0-9]{2}[ ][0-9]{10}$"))
            return true;
        else
            return false;
    }

    public boolean isPasswordValid(String password) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        boolean upperCasePresent = false;
        boolean numberPresent = false;
        boolean specialCharsPresent = false;
        char[] passwordArray = password.toCharArray();

        for (int index = 0; index < passwordArray.length; index++) {
            if (Character.isUpperCase(passwordArray[index])) {
                upperCasePresent = true;
            }

            if (Character.isDigit(passwordArray[index])) {
                numberPresent = true;
            }

            if (specialChars.contains(String.valueOf(passwordArray[index]))) {
                specialCharsPresent = true;
            }
        }
        if (passwordArray.length >= 8 && upperCasePresent && numberPresent && specialCharsPresent)
            return true;
        else
            return false;
    }

}
