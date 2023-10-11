package SmokeTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class smokePaths {
	
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
	
	@FindBy(how = How.XPATH, using = "//span[text()='OL Report ']")
	public WebElement olReport;

	@FindBy(how = How.XPATH, using = "//span[text()='OnBoarding Request']")
	public WebElement onboardingRequest;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Submission List']")
	public WebElement submissionList;
		
	@FindBy(how = How.XPATH, using = "//span[text()='CandidateTransition']")
	public WebElement candidateTransition;
	
	@FindBy(how = How.XPATH, using = "//span[text()='TransitionDetails']")
	public WebElement transitionDetails;
	
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
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client Name']")
	public WebElement clientNameOL;
	
	@FindBy(how = How.ID, using = "myBucket_pending")
	public WebElement pendingTab;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client Name']")
	public WebElement clientNameCT;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client Name']")
	public WebElement clientNameTD;
	
	//Dashboard
	@FindBy(how = How.XPATH, using = "//a[@href='#/app/dashboard']")
	public WebElement dashboard;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-body no-padding')]")
	public WebElement onbLifeImg;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'card-body no-padding')]")
	public WebElement totalEmpImg;
	
	//Attendance
	@FindBy(how = How.XPATH, using = "//span[text()='Attendance']")
	public WebElement attendance;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Approve Regularization']")
	public WebElement approveRegularization;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Choose...']")
	public WebElement clientNameAR;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Shift Master']")
	public WebElement shiftMaster;
	
	@FindBy(how = How.XPATH, using = "//div[@class='ng-value-container']/following-sibling::span[1]")
	public WebElement clientNameSM;
	
	@FindBy(how = How.XPATH, using = "//span[text()='View Shifts']")
	public WebElement viewShifts;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Ciel HR']")
	public WebElement clientNameVS;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Monthly Report']")
	public WebElement monthlyReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client Name']")
	public WebElement clientNameMR;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Week Off Mapping']")
	public WebElement weekOffMapping;
	
	@FindBy(how = How.XPATH, using = "////div[@class='ng-select-container ng-has-value']")
	public WebElement clientNameWM;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Punch In/Out Report']")
	public WebElement punchInandOutReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client']")
	public WebElement clientNamePR;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Attendance Base Report']")
	public WebElement attendanceBaseReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='District']")
	public WebElement district;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Attendance Summary Report']")
	public WebElement attendanceSummaryReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='District Name']")
	public WebElement districtName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Gap Report']")
	public WebElement gapReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='District Name']")
	public WebElement districtNameGR;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Salary Credit Report']")
	public WebElement salCreditReport;
	
	@FindBy(how = How.XPATH, using = "//div[text()='District']")
	public WebElement districtSCR;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Team Attendance']")
	public WebElement teamAttendance;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Client Name']")
	public WebElement clientNameTA;
	
	
	
	
	
	
	
	
	
	
	
		

	

	
	
	

}
