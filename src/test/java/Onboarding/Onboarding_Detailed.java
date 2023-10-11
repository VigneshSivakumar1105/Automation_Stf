package Onboarding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Onboarding_Detailed {
	public static WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("disable-notifications");
		driver = new ChromeDriver(option);
	}

	@Test
	public void login() {
		Onboarding_Paths path = PageFactory.initElements(driver, Onboarding_Paths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://stfqc.integrumapps.com/hrsuiteui/#/login");
		System.out.println("Login Page working");
		path.username.sendKeys("ITC001");
		path.password.sendKeys("test");
		path.submit.click();
	}

	@Test
	public void onboardingClientSelection() throws InterruptedException {
		Onboarding_Paths path = PageFactory.initElements(driver, Onboarding_Paths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		path.onboarding.click();
		path.onboardingRequest.click();
		Thread.sleep(2000);
		path.clientName.click();
		Thread.sleep(2000);
		path.clientSearch.sendKeys("ITC");
		Thread.sleep(2000);
		path.clientSearch.sendKeys(Keys.ENTER);	
		System.out.println("hello");
		path.clientContractName.click();
		Thread.sleep(2000);
		path.clientContractSearch.sendKeys("ITC");
		Thread.sleep(2000);
		path.clientContractSearch.sendKeys(Keys.ENTER);
		path.onbSearch.click();
		Thread.sleep(2000);
		path.onboardingRequest2.click();
		path.regularOnboarding.click();
		path.manual.click();
		path.candidateInformation.click();
		Thread.sleep(3000);
		path.candidateInformation.click();
		path.firstName.sendKeys("hello");
		path.gender.sendKeys("male");
		path.gender.sendKeys(Keys.ENTER);
		path.email.sendKeys("hello.23423@gmail.com");
		path.mobile.sendKeys("4544545464");
		path.dob.sendKeys("21-10-1993");
		path.fatherName.sendKeys("fhj");
		path.emergencyContactnumber.sendKeys("1654354354");
		path.emergencyContactPersonName.sendKeys("dfhskjf");
		path.validateCandidate.click();

	}
}
