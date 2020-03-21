import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {

    @Test(dataProvider = "data_provider_unhappy", dataProviderClass = EmailDataProviders.class)
    public static void test(String data){

       boolean actualResult = Email.isEmailCorrect(data);
       Assert.assertFalse(actualResult);
    }
}
