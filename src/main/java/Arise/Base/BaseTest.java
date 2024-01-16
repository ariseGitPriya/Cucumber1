package Arise.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static void launchBrawser()
    {
        ChromeOptions chrome = new ChromeOptions();
        chrome.setBrowserVersion("stable");
        WebDriver driver = new ChromeDriver(chrome);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
}
