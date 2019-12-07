package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsOfActios {
	public static ChromeDriver driver;
	@Given("Launch Chrome Browser")
	public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter the UserName as DemoSalesManager")
	public void enterTheUserNameAsDemoSalesManager(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@Given("Enter the Password as crmsfa")
	public void enterThePasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("Click on LoginButton")
	public void clickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("Verify Login is Successful")
	public void verifyLoginIsSuccessful() {
		System.out.println("Login is Successful");
	}

	@When("Click on LeadsTab")
	public void clickOnLeadsTab() {

	}

	@When("Click on CreateLead")
	public void clickOnCreateLead() {

	}

	@Given("Enter CompanyName as THQ")
	public void enterCompanyNameAsTHQ() {

	}

	@Given("Enter FirstName as Stone")
	public void enterFirstNameAsStone() {

	}

	@Given("Enter LastName as Gold")
	public void enterLastNameAsGold() {

	}

	@Given("Enter PhoneNumber")
	public void enterPhoneNumber() {

	}

	@When("Click on SubmitCreateLead")
	public void clickOnSubmitCreateLead() {

	}
}
