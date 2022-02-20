package textBoxTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckTextBoxes {
    WebDriver webDriver;
    @Test
    public  void checkSubmitText(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
webDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
webDriver.get("https://demoqa.com/text-box");
System.out.println("was opened");
webDriver.findElement(By.xpath(".//input[@id='userName'] ")).clear();
        webDriver.findElement(By.xpath(".//input[@id='userName'] ")).sendKeys("Test userName");
        System.out.println("userName was entered Test");

        webDriver.findElement(By.xpath(".//input[@id='userEmail']")).clear();
        webDriver.findElement(By.xpath(".//input[@id='userEmail']")).sendKeys("test@ukr.net");
        System.out.println("Email was entered");

        webDriver.findElement(By.xpath(".//textarea[@id='currentAddress']")).clear();
        webDriver.findElement(By.xpath(".//textarea[@id='currentAddress']")).sendKeys("test currentAddress");
        System.out.println("currentAddress was entered");

        webDriver.findElement(By.xpath(".//textarea[@id='permanentAddress']")).clear();
        webDriver.findElement(By.xpath(".//textarea[@id='permanentAddress']")).sendKeys("test permanentAddress");
        System.out.println("permanentAddress was entered");

        webDriver.findElement(By.xpath(".//button[@id='submit']")).click();
        System.out.println("Button submit was clicked");

        Assert.assertTrue("Text Test userName is not displayed"
                , isTextTestUserNameIsDisplayed());

         webDriver.quit();
        System.out.println("was closed");
    }
private boolean isTextTestUserNameIsDisplayed(){
        try{
            return webDriver.findElement(By.xpath(".//p[@id='name' and text()='Test userName']")).isDisplayed();
        }catch (Exception e){
            return false;
        }
}
}
