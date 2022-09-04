import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
//import org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
//import org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;


public class Program {

    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;

        Selenide.open("https://www.i.ua");
        Selenide.Wait().until(invisibilityOfElementLocated(By.id("magic-id")));
        Selenide.$(byName("login")).setValue("andreyobelec").pressEnter();
        Selenide.$(byName("pass")).setValue("qwerty").pressEnter();

        Selenide.$(byLinkText("Помощь")).click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        //webdriver().shouldHave(url("https://help.i.ua/section/11/"));

        //assertEquals("https://help.i.ua/section/11/", currentUrl);
        if (currentUrl == "https://help.i.ua/section/11/"){
            System.out.println("ok");
        } else{
            System.out.println("wrong");
        }
        System.out.println(currentUrl);





        //Selenide.$(byTitle("Вхід на пошту")).click();

        // System.out.println("=======Running @After for JUnit 4=======");
        //Selenide.open("https://www.google.com", "i.ua","andreyobelec", "qwerty");


        //FirefoxDriverManager.getInstance().setup();
        //System.setProperty("webdriver.gecko.driver", "/home/andrew/snap/firefox/common/tmp/geckodriver");
        //FirefoxDriver driver = new FirefoxDriver();
        //driver.get("https://www.google.com");
    }
}
