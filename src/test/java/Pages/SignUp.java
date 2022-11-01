package Pages;

import Setup.SetUpPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class SignUp extends SetUpPage {

    @FindBy(css = ".signup--button > a:nth-child(1)")
    WebElement btn_SignUP;

    @FindBy(css = "#enter-name")
    WebElement txt_enterName;

    @FindBy(css = "#enter-email1")
    WebElement txt_mail;

    @FindBy(css ="#enter-email2")
    WebElement txt_ConfirmMail;

    @FindBy(css = "#enter-phone1")
    WebElement txt_PhoneNumber;

    @FindBy(css = "#enter-phone")
    WebElement txt_ConfirmPhoneNumber;

    @FindBy(css ="input.vs__search:nth-child(2)")
    WebElement dropDown_country;

    @FindBy(css = "#vs2__combobox > div:nth-child(1) > input:nth-child(2)")
    WebElement dropDown_gender;

    @FindBy(css ="#date_of_birth")
    WebElement calenderBirthDate;

    @FindBy(css = "#exampleInputPassword1")
    WebElement txt_SignUpPass;

    @FindBy(css = "#exampleInputPassword2")
    WebElement txt_confirmSignUpPass;

    @FindBy(css = "#termsCheck")
    WebElement checkBoxPP;

    @FindBy(css = ".signup--button > button:nth-child(1)")
    WebElement btn_ACsignUP;

    //LandingPage
    @FindBy(xpath = "//*[@id=\"money--raised--comp\"]/div/div[2]/div/div[2]/div/div/div[3]/a")
    WebElement btn_EnterMyIdea;

    //image & viedeo upload
    @FindBy(xpath = "//div[@id='upload--idea--page']/div[2]/div/input")
    WebElement btn_VideoUpload;
    @FindBy(xpath = "//button[contains(text(),'Upload Now')]")
    WebElement btn_UploadNow;

    @FindBy(css = ".upload--button > input:nth-child(2)")
    WebElement btn_coverImage;

    //card info
    @FindBy(css = "#card-holder-name")
    WebElement txt_cradHolderName;

    @FindBy(css = "#enter-card")
    WebElement txt_cardNumber;

    @FindBy(css ="#expirationCardInfo")
    WebElement txt_cardExpire;

    @FindBy(css = "#cvcLength")
    WebElement txt_cardCVC;

   //Submit idea
    @FindBy(css = ".signup--button > button:nth-child(1)")
    WebElement btn_UploadSubmit;

    @FindBy(css = ".col > a:nth-child(1)")
    WebElement btn_BackTohome;

    //profile Button
    @FindBy(css = ".profile")
    WebElement btn_profile;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    WebElement btn_logout;




    public SignUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createAC(String mail, String pNumber) throws InterruptedException {
        WebDriverWait waitForSignUpBtn = new WebDriverWait(driver,Duration.ofSeconds(20));
        waitForSignUpBtn.until(ExpectedConditions.visibilityOf(btn_SignUP));

        btn_SignUP.click();

        //Sign Up form Fill up
        txt_enterName.sendKeys("Hasnat");
        txt_mail.sendKeys(mail);
        txt_ConfirmMail.sendKeys(mail);

        txt_PhoneNumber.click();
        Thread.sleep(2000);
        txt_PhoneNumber.sendKeys(Keys.ARROW_RIGHT+pNumber);

        txt_ConfirmPhoneNumber.click();
        Thread.sleep(2000);
        txt_ConfirmPhoneNumber.sendKeys(Keys.ARROW_RIGHT+pNumber);


        dropDown_country.sendKeys("BANGLADESH");
        dropDown_country.sendKeys(Keys.ENTER);

        dropDown_gender.sendKeys("Male");
        dropDown_gender.sendKeys(Keys.ENTER);


        calenderBirthDate.sendKeys("0902"+(Keys.ARROW_RIGHT)+"2022");

        txt_SignUpPass.sendKeys("12345678");
        txt_confirmSignUpPass.sendKeys("12345678");

        checkBoxPP.click();

        //Sign up Button tapping after filling the form
        btn_ACsignUP.click();

        //HomePage



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"money--raised--comp\"]/div/div[2]/div/div[2]/div/div/div[3]/a")));
        Thread.sleep(1500);

        btn_EnterMyIdea.click();
        Thread.sleep(1500);




        //Idea Upload
        btn_VideoUpload.sendKeys("E:\\CrowdTankGradlle\\video.mp4");
        btn_UploadNow.click();
        Thread.sleep(1500);

        JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
        js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
        Thread.sleep(3000);

        btn_coverImage.sendKeys("E:/img.jpeg");


        //card details

        txt_cradHolderName.sendKeys("Hasnat");
        Thread.sleep(1000);
        txt_cardNumber.sendKeys("4242424242424242");
        txt_cardExpire.sendKeys("10/23");
        Thread.sleep(1000);
        txt_cardCVC.sendKeys("321");
        Thread.sleep(1500);


        btn_UploadSubmit.click();

        Thread.sleep(2000);




        btn_BackTohome.click();
        Thread.sleep(1000);
        System.out.println("Back Button Pressed");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".profile")));


        btn_profile.click();
        Thread.sleep(1500);
        System.out.println("Enter into the Profile page");


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" .logout")));

        JavascriptExecutor js2 = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
        js2.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
        Thread.sleep(3000);

        System.out.println("Profile Page");


        btn_logout.click();

        System.out.println("log out button Pressed");









    }



}
