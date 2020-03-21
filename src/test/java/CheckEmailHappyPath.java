import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {


    @Test(dataProvider = "data_provider_happy", dataProviderClass = EmailDataProviders.class)
    public static void test(String data){
        boolean actualResult = Email.isEmailCorrect(data);
        Assert.assertTrue(actualResult);
    }
}
