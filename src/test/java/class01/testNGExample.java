package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {
    //test1
    public static WebDriver driver;
//precondition - open browser, implicit wait
    @BeforeMethod
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    //post condition -->close the browser
    @AfterMethod
    public void closeBrowser() throws InterruptedException {
Thread.sleep(5000);//not recommended
        driver.quit();
    }

    @Test
    public void loginFunctionality(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
    }
    //testcase 2

    @Test
    public void passwordTextBoxVerification(){
        //find the webelement password textbox
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(pasword.isDisplayed());
    }


}
