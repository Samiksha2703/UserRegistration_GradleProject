package com.bridgelabz.userregistration;

public class UserRegistration {

    public boolean isFirstNameValid(String firstName){
        if (firstName.matches("^[A-Z]+[a-z]{2,}$"))
            return true;
        else
            return false;
    }

}
