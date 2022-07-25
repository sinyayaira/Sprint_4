package org.example;

import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AccountTest {
    private final String checkedName;
    private final boolean expected;

    public AccountTest(String checkedName, boolean expected) {
        this.checkedName = checkedName;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Name Lastname", true},
                {null, false},
                {"Na", false},
                {"Name Lastnamemoremore", false},
                {" Name Lastname", false},
                {"Name Lastname ", false},
                {"Name  Lastname", false},
                {"NameLastname", false},
        };
    }

    @Test
    @DisplayName("Check name to emboss")
    public void shouldCheckNameToEmboss() {
        Account account = new Account(this.checkedName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
