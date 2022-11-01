package TestRunner;

import DataProvider.MailProvider;
import Pages.SignUp;
import Setup.SetUpPage;
import org.testng.annotations.Test;

public class SignUpTestRunner extends SetUpPage {

    @Test(dataProvider = "mail-provider",dataProviderClass = MailProvider.class)
    public void SignUpForm(String mail, String pNumber) throws InterruptedException {
        SignUp signUp = new SignUp(driver);
        driver.get("https://crowdtank.audacityit.work");
        signUp.createAC(mail,pNumber);
    }


}
