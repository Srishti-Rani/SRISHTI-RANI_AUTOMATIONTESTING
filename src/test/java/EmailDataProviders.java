import org.testng.annotations.DataProvider;

public class EmailDataProviders {
    @DataProvider(name = "data_provider_happy")
    public static Object[][] checkValidEmail() {
        return new Object[][]{
                {"abcd@abc.abc"},
                {"abcd@ABC.abc"},
                {"abcd@123.abc"},
                {"abcd@Aa4B.abc"},
                {"ABCD@abc.abc"},
                {"1234@abc.abc"},
                {"____@abc.abc"},
                {"!!!!@abc.abc"},
                {"aBb1c2_A!4@abc.abc"},
                {"ANCD@012.abc"},
                {"1234@012.abc"},
                {"____@012.abc"},
                {"!!!!@012.abc"},
                {"ABCD@ABC.abc"},
                {"1234@ABC.abc"},
                {"____@ABC.abc"},
                {"!!!!@ABC.abc"},
                {"aB0@aA0.abc"},
                {"asdfgsASDFGH123456_!@aA0.abc"},
                {"asdfg123456ASDCQW_!@As2.abc"},
                {"abcd@A0.abc"},
                {"abcd@aA0b.abc"},
                {"abcs@aD0nA.abc"},
                {"asdf@asd.az"},
                {"asdf@asd.azcx"},
                {"asdf@asc.qwert"}};
    }

    @DataProvider(name = "data_provider_unhappy")
    public static Object[][] checkWrongEmail(){
        return new Object[][] {
                {"aa@12df.ert"},
                {"qweerty1233455!!_INKM@e3D.qwe"},
                {"fjo3nf@q.der"},
                {"rubnt@qS1jeo.awe"},
                {"wwqsa@wer.q"},
                {"wrtyy@qwe.qwerty"},
                {")ertg@wer.qwe"},
                {"qweryt@!erd.qwe"},
                {"qwert@qwer.123"},
                {"qwert@qwer.ASC"},
                {"qwert@qwer.!erw"}
        };
    }


}
