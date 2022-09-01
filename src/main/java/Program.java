import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;


public class Program {

    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        //Selenide.open("https://www.google.com", "i.ua","andreyobelec", "qwerty");
        Selenide.open("https://www.i.ua");
        Selenide.Wait().until(invisibilityOfElementLocated(By.id("magic-id")));
        Selenide.$(byName("login")).setValue("andreyobelec").pressEnter();
        Selenide.$(byName("pass")).setValue("qwerty").pressEnter();

        //Selenide.$(byTitle("Вхід на пошту")).click();





        //FirefoxDriverManager.getInstance().setup();
        //System.setProperty("webdriver.gecko.driver", "/home/andrew/snap/firefox/common/tmp/geckodriver");
        //FirefoxDriver driver = new FirefoxDriver();
        //driver.get("https://www.google.com");
    }
}
