package test;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class test {
    public static void main(String[] args) throws InterruptedException {
        test t = new test();
//        t.assertionsTest();
//        t.verification();
        t.waitingmethod();

    }


    public void waitingmethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //implecit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        //explecit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.geeksforgeeks.org/");
        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

        JavascriptExecutor jsr = (JavascriptExecutor) driver;

       // driver.wait(5);
        WebElement index = driver.findElement(By.xpath("//input[@placeholder='Username or email']"));
//        WebElement index1 = wait.until(ExpectedConditions.elementToBeClickable(index));

        jsr.executeScript("arguments  [0].setAttribute('value','naresh')", index);
    }


    public void verification() {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--headless");
        WebDriver driver = new ChromeDriver(op);
        driver.get("https://www.geeksforgeeks.org/");
        driver.manage().window().maximize();
        String acttitle = driver.getTitle();
        if (driver.findElement(By.xpath("//img[@alt='geeksforgeeks']")).isDisplayed()) {
            System.out.println("The element is present ");
        } else {
            System.out.println("THe element is not present ");
        }

    }


    public void assertionsTest() {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--headless");
        WebDriver driver = new ChromeDriver(op);
        driver.get("https://www.geeksforgeeks.org/");

        String acttitle = driver.getTitle();

        System.out.println(acttitle);

        String exptitl = "GeeksforGees | A computer science portal for geeks";

//        Assertion as = new Assertion();
        Assertion as = new SoftAssert();
        as.assertEquals(acttitle, exptitl);
        System.out.println("Hard assertion passed ");


// try {
//     as.assertEquals(acttitle,exptitl);
//     System.out.println("Hard assertion passed ");
// }
//catch (AssertionError error){
//    System.out.println("Hard assertion faild ");
//}
    }

}

