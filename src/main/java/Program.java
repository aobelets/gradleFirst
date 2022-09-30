import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.byName;

public class Program {

    public static void main(String[] args) {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;

        Selenide.open("https://www.i.ua");
        Selenide.$(byName("login")).setValue("andreyobelec").pressEnter();
        Selenide.$(byName("pass")).setValue("d7m2y1982").pressEnter();

        String[] array = new String[40];

        for (int i = 20; i < 40; i++) {
            String sel =  "#mesgList > form > div:nth-child(" + i + ") > a > span.frm";
            array[i]=Selenide.$(sel).getText();
            System.out.println(array[i]);
        }
        System.out.println(array);
        Selenide.closeWindow();
    }
}