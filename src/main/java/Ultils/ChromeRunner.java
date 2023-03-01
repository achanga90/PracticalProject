package Ultils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

    @BeforeMethod
    public static void Runner(){

        Configuration.browser = "chrome";

        // Open the browser and navigate to the page
        open("https://officemart.ge/");

        // Get the underlying WebDriver instance from Selenide
        WebDriver driver = WebDriverRunner.getWebDriver();

        // Maximize the window to full screen
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void close (){
        Selenide.closeWebDriver();
    }
}
