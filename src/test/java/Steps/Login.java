package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    WebDriver driver;
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page()
    {
        System.out.println("====i am inside login page factory===");
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demosite.executeautomation.com/Login.html");
    }


    @And("User enters username and password")
    public void userEntersUsernameAndPassword()
    {
        driver.findElement(By.name("UserName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button()
    {
        driver.findElement(By.xpath("//input[@name='Login']")).click();

    }

    @Then("I should see userperform page")
    public void i_should_see_userperform_page() {
        System.out.println("Home Page");
        driver.quit();
    }



}
