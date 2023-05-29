package ru.levelp.at.homework2;

import static org.testng.Assert.assertEquals;
import static ru.levelp.at.homework2.HappyTicket.isTicketHappy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HappyTicketNegativeTest {
    @DataProvider
    public static Object[][] negativeDataProvider() {
        return new Object[][] {
            {""},
            {"12345678910"},
            {"1234567"},
            {"      "},
            {"1a3b5c"},
            {"#@%^&*"}
        };
    }

    @Test(dataProvider = "negativeDataProvider", expectedExceptions = {IllegalArgumentException.class})
    public void isTicketHappyNegativeTest(String actualResult) {
        isTicketHappy(actualResult);
    }
}
