package com.urgeTruck.testCase;

import org.testng.annotations.Test;
import com.urgeTruck.pageObject.loginPage;

public class TC_LoginTest_UT_001 extends BaseClass
{
    @Test
    public void LoginTest() throws InterruptedException
    {
        driver.get(BaseURL);
        logger.info("URL opened");
        Thread.sleep(5000);

        loginPage lp = new loginPage(driver);

        lp.setUsername(username);
        logger.info("Entered Username");
        Thread.sleep(5000);

        lp.setUserPassword(password);
        logger.info("Entered Password");
        Thread.sleep(5000);

        lp.clickSubmit();
        logger.info("Login Successfully");
        Thread.sleep(5000);

        // You can add explicit waits here to wait for the next page or element to load.
        // Example:
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId"));
    }
}
