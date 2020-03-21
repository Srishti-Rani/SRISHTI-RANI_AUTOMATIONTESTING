package selenium_page_object_model_practice.FirstTask;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUpFormTest extends FunctionalTest {
    @Test
    public void signUp(){
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isInitialized());

        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

        ReceiptPage receiptPage = signUpPage.submit();
        Assert.assertTrue(receiptPage.isInitialized());

        Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
    }
}
