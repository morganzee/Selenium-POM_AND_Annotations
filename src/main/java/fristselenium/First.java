package fristselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class First {
    WebDriver driver;
    WebDriverWait wait;
    ElementMapper em;

    //start sessions
    public void startSession() {
        System.setProperty("webdriver.chrome.driver",em.chromePath);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(em.homePage);
        driver.manage().window().maximize();
    }

    //quit sessions
    public void terminateSession(){
        driver.quit();
    }
    public void adminLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.adminUser);
        driver.findElement(By.cssSelector(em.passwordField )).sendKeys(em.password);
        driver.findElement(By.cssSelector(em.LoginButton)).click();
        //what this does is extract the code from the element and save in the variable
        String welcomeText = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        //import testng assert
        Assert.assertEquals(welcomeText, "Welcome back, Admin! \uD83D\uDC4B");

    }
    public void managerLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.managerUser);
        driver.findElement(By.cssSelector(em.passwordField )).sendKeys(em.password);
        driver.findElement(By.cssSelector(em.LoginButton)).click();
        //what this does is extract the code from the element and save in the variable
        String welcomeText = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        //import testng assert
        Assert.assertEquals(welcomeText, "Welcome back, Max! \uD83D\uDC4B");
    }
    public void teacherLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.teacherUser);
        driver.findElement(By.cssSelector(em.passwordField )).sendKeys(em.password);
        driver.findElement(By.cssSelector(em.LoginButton)).click();
        //what this does is extract the code from the element and save in the variable
        String welcomeText = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        //import testng assert
        Assert.assertEquals(welcomeText, "Welcome back, Terri! \uD83D\uDC4B");
    }
    public void studentLogin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(em.usernameField)));
        driver.findElement(By.cssSelector(em.usernameField)).sendKeys(em.studentUser);
        driver.findElement(By.cssSelector(em.passwordField )).sendKeys(em.password);
        driver.findElement(By.cssSelector(em.LoginButton)).click();
        //what this does is extract the code from the element and save in the variable
        String welcomeText = driver.findElement(By.cssSelector(em.welcomeHeader)).getText();
        //import testng assert
        Assert.assertEquals(welcomeText, "Welcome back, Sam! \uD83D\uDC4B");
    }
//    public static void main(String[] args){
//        First first = new First();
//        first.adminLogin();
//        first.managerLogin();
//        first.teacherLogin();
//        first.studentLogin();
//    }
}
