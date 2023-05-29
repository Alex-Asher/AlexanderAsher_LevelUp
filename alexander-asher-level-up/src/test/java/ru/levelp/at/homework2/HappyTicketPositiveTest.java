package ru.levelp.at.homework2;

import static org.testng.Assert.assertEquals;
import static ru.levelp.at.homework2.HappyTicket.isTicketHappy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HappyTicketPositiveTest {

    @DataProvider
    public static Object[][] positiveDataProvider() {
        return new Object[][] {
            {"333333", true},
            {"123456", false},
            {"000000", true},
            {"853295", true},
            {"010252", false},
            {"678142", false}
        };
    }

    @Test(dataProvider = "positiveDataProvider")
    public void isTicketHappyPositiveTest(String actualResult, boolean expectedResult) {
        assertEquals(isTicketHappy(actualResult), expectedResult);
    }
}
