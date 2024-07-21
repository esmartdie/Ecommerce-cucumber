package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends BaseSteps{

    @Given("User navigate to the Ecommerce application")
    public void userNavigateToTheEcommerceApplication() {
        initializeDriver();
        driver.get("http://localhost:8080/");
        System.out.println(driver.getTitle());
    }
    @Given("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
    }
    @Given("User enter the username as {string}")
    public void userEnterTheUsernameAs(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }
    @Given("User enter the password as {string}")
    public void userEnterThePasswordAs(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("//button[@class=\"btn btn-dark\"]")).click();
    }
    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        driver.findElement(By.xpath("//a[@id=\"navbarDropdownMenuLink\"]")).getText().equals("USER");
        quitDriver();
    }


    @When("Login should be fail")
    public void loginShouldBeFail() {
        String text = driver.findElement(By.id("username")).getText();
        Assert.assertEquals(text, "");
        quitDriver();
    }
}
