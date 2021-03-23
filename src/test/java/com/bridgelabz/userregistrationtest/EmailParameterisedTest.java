package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.UserRegistration;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailParameterisedTest {

    private final String inputEmail;
    private final boolean expectedTestOutput;
    private UserRegistration userRegistration;
    public EmailParameterisedTest(String inputEmail, boolean expectedTestOutput){
        super();
        this.inputEmail = inputEmail;
        this.expectedTestOutput = expectedTestOutput;
    }

    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input(){
        return Arrays.asList(new Object[][] {{"abc@yahoo.com", true},
                                            {"abc-100@yahoo.com", true},
                                            {"abc.100@yahoo.com", true},
                                            {"abc111@abccom", true},
                                            {"abc.100@abc.com.au",true},
                                            {"abc@1.com", true},
                                            {"abc123@gamil.a", false},
                                            {"abc123@.com", false},
                                            {"abc@gmail.com.1a", false},
                                            {"abc..2002@gamil.com", false},
                                            {"abc-100@abc.net", true}});
                                            }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedTest(){
        boolean result = userRegistration.isEmailIdValid(inputEmail);
        Assertions.assertEquals(expectedTestOutput, result);
    }
}
