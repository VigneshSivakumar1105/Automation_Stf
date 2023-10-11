package Onboarding;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Onboarding_Paths {

	// login
	@FindBy(how = How.NAME, using = "username")
	public WebElement username;

	@FindBy(how = How.NAME, using = "password")
	public WebElement password;

	@FindBy(how = How.ID, using = "submit")
	public WebElement submit;

	// onboardingClientSelection
	@FindBy(how = How.XPATH, using = "//span[text()='OnBoarding']")
	public WebElement onboarding;

	@FindBy(how = How.XPATH, using = "//span[text()='OnBoarding Request']")
	public WebElement onboardingRequest;

	@FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[1]")
	public WebElement clientName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search']")
	public WebElement clientSearch;

	@FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[2]")
	public WebElement clientContractName;

	@FindBy(how = How.XPATH, using = "(//input[@placeholder='Search'])[1]")
	public WebElement clientContractSearch;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search Now']")
	public WebElement onbSearch;

	@FindBy(how = How.XPATH, using = "//span[@class='drop-down__name']")
	public WebElement onboardingRequest2;

	@FindBy(how = How.XPATH, using = "//li[@class='drop-down__item']")
	public WebElement regularOnboarding;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Manual']")
	public WebElement manual;

	// onboarding
	@FindBy(how = How.XPATH, using = "(//p[@class='card-header-title'])[1]")
	public WebElement candidateInformation;

	@FindBy(how = How.NAME, using = "firstName")
	public WebElement firstName;

	@FindBy(how = How.XPATH, using = "//span[@class='ng-arrow-wrapper']")
	public WebElement gender;

	@FindBy(how = How.NAME, using = "email")
	public WebElement email;

	@FindBy(how = How.NAME, using = "mobile")
	public WebElement mobile;

	@FindBy(how = How.NAME, using = "dateOfBirth")
	public WebElement dob;

	@FindBy(how = How.NAME, using = "fatherName")
	public WebElement fatherName;

	@FindBy(how = How.NAME, using = "emergencyContactnumber")
	public WebElement emergencyContactnumber;

	@FindBy(how = How.NAME, using = "emergencyContactPersonName")
	public WebElement emergencyContactPersonName;

	@FindBy(how = How.XPATH, using = "//button[text()=' Validate Candidate ']")
	public WebElement validateCandidate;

}
