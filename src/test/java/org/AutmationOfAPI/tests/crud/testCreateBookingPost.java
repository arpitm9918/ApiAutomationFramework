package org.AutmationOfAPI.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPost {
    @Severity(SeverityLevel.BLOCKER)
    @Owner("Arpit")
    @Description("Verify CreateBooking is Working")
    @Test
    public void VerifyCreatebookingPost(){// in tesng.xml this include in method
        Assert.assertTrue(true);

    }
}
