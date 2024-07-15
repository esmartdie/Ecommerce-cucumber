package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;


    @Given("User navigate to the Ecommerce application")
    public void userNavigateToTheEcommerceApplication() {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
        WebDriver.Options manage = driver.manage();
        manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        manage.window().maximize();
        System.out.println(driver.getTitle());
    }
    @Given("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
    }
    @Given("User enter the username as qa_user@qa.es")
    public void userEnterTheUsernameAs() {
        driver.findElement(By.id("username")).sendKeys("qa_user@qa.es");
    }
    @Given("User enter the password as 123")
    public void userEnterThePasswordAs() {
        driver.findElement(By.id("password")).sendKeys("123");
    }
    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
    }
    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        driver.findElement(By.xpath("//a[@id=\"navbarDropdownMenuLink\"]")).getText().equals("USER");
        driver.quit();
    }
}
