package DataProvider;

import org.testng.annotations.DataProvider;

public class MailProvider {
    @DataProvider(name = "mail-provider")
    public Object [][] setData1() {

        return new Object[][]{
                {"aits-50011@aits.com", "50011"},
                {"aits-50012@aits.com", "50012"},
                {"aits-50013@aits.com", "50013"}




        };
    }
}
