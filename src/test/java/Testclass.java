import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Testclass {

    @Test
    public void Test() {
        System.setProperty("webdriver.gecko.driver", "/Users/pbolishetti/geckodriver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.seleniumhq.org/");
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        //WebElement element = driver.findElement(By.name("q"));
           //   element.sendKeys("Selenium webdriver");
       // WebElement element1 = driver.findElement(By.id("submit"));
         //element1.click();

        driver.close();


    }
        /*WebDriver driver = null;
        try {
            driver = new FirefoxDriver();
            String baseUrl = "https://www.google.co.in/";

            driver.get(baseUrl);

        } catch(Exception e) {
            System.out.println(e);
        }
        finally {
            driver.close();
        }*/
    }


