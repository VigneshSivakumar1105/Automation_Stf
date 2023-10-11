package SmokeTesting;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class smokeTest {
	public static WebDriver driver;
	public static WebDriverWait wait;

	@BeforeSuite
	public void launchBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("disable-notifications");
		driver = new ChromeDriver(option);
	}

	@BeforeClass
	public void login() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://stfqc.integrumapps.com/hrsuiteui/#/login");
		path.username.sendKeys("15172");
		path.password.sendKeys("test");
		path.submit.click();
		System.out.println("Login Page working");
	}

	@Test(priority = 3, enabled = true)
	public void olReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.onboarding.click();
		path.olReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameOL));
		boolean t = path.clientNameOL.isDisplayed();
		if (t)
			System.out.println("OL Report page working");
		else
			System.err.println("OL Report page not working");
	}

	@Test(priority = 1, enabled = true)
	public void onboardingRequest() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.onboarding.click();
		path.onboardingRequest.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientName));
		path.clientName.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientSearch));
		path.clientSearch.sendKeys("Nutanix");
		path.clientSearch.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(path.clientContractName));
		path.clientContractName.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientContractSearch));
		path.clientContractSearch.sendKeys("Nutanix");
		path.clientContractSearch.sendKeys(Keys.ENTER);
		path.onbSearch.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.pendingTab));
		boolean t = path.pendingTab.isDisplayed();
		if (t)
			System.out.println("Onboarding page working");
		else
			System.err.println("onboarding page not working");
	}

	@Test(priority = 2, enabled = true)
	public void candidateTransition() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.onboarding.click();
		path.candidateTransition.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameCT));
		boolean t = path.clientNameCT.isDisplayed();
		if (t)
			System.out.println("candidate Transition page working");
		else
			System.err.println("candidate Transition page not working");
	}

	@Test(priority = 4, enabled = true)
	public void transitionDetails() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.onboarding.click();
		path.transitionDetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameTD));
		boolean t = path.clientNameTD.isDisplayed();
		if (t)
			System.out.println("Transition Details page working");
		else
			System.err.println("Transition Details page not working");
	}

	@Test(priority = 5, enabled = true)
	public void dashboard() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.dashboard.click();
		wait.until(ExpectedConditions.visibilityOf(path.totalEmpImg));
		wait.until(ExpectedConditions.visibilityOf(path.onbLifeImg));
		boolean t = path.totalEmpImg.isDisplayed();
		if (t)
			System.out.println("Dashboard page working");
		else
			System.err.println("Dashboard page not working");
	}

	@Test(priority = 6, enabled = true)
	public void approveRegularization() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.approveRegularization.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameAR));
		boolean t = path.clientNameAR.isDisplayed();
		if (t)
			System.out.println("Approve Regularization page working");
		else
			System.err.println("Approve Regularization page not working");
	}

	@Test(priority = 7, enabled = true)
	public void shiftMaster() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.viewShifts.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameVS));
		boolean t = path.clientNameVS.isDisplayed();
		if (t)
			System.out.println("Shifts Master page working");
		else
			System.err.println("Shift Master page not working");
	}

	@Test(priority = 8, enabled = true)
	public void monthlyReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.monthlyReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameMR));
		boolean t = path.clientNameMR.isDisplayed();
		if (t)
			System.out.println("Monthly Report page working");
		else
			System.err.println("Monthly Report page not working");
	}

	@Test(priority = 9, enabled = true)
	public void weekOffMapping() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.weekOffMapping.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameWM));
		boolean t = path.clientNameWM.isDisplayed();
		if (t)
			System.out.println("Week Off Mapping page working");
		else
			System.err.println("Week Off Mapping page not working");
	}

	@Test(priority = 10, enabled = true)
	public void punchInandOutReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.punchInandOutReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNamePR));
		boolean t = path.clientNamePR.isDisplayed();
		if (t)
			System.out.println("Punch In Punch Out Report page working");
		else
			System.err.println("Punch In Punch Out Report page not working");
	}

	@Test(priority = 11, enabled = true)
	public void attendanceBaseReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.attendanceBaseReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.district));
		boolean t = path.district.isDisplayed();
		if (t)
			System.out.println("Attendance Base Report page working");
		else
			System.err.println("Attendance Base Report page not working");
	}

	@Test(priority = 12, enabled = true)
	public void attendanceSummaryReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.attendanceSummaryReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.districtName));
		boolean t = path.districtName.isDisplayed();
		if (t)
			System.out.println("Attendance Summary Report page working");
		else
			System.err.println("Attendance Summary Report page not working");
	}

	@Test(priority = 13, enabled = true)
	public void gapReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.gapReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.districtNameGR));
		boolean t = path.districtNameGR.isDisplayed();
		if (t)
			System.out.println("Gap Report page working");
		else
			System.err.println("Gap Report page not working");
	}

	@Test(priority = 14, enabled = true)
	public void salCreditReport() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.salCreditReport.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.districtSCR));
		boolean t = path.districtSCR.isDisplayed();
		if (t)
			System.out.println("Salary Credit Report page working");
		else
			System.err.println("Salary Credit Report page not working");
	}

	@Test(priority = 15, enabled = true)
	public void teamAttendance() {
		smokePaths path = PageFactory.initElements(driver, smokePaths.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		path.attendance.click();
		path.teamAttendance.click();
		wait.until(ExpectedConditions.elementToBeClickable(path.clientNameTA));
		boolean t = path.clientNameTA.isDisplayed();
		if (t)
			System.out.println("Team Attendance page working");
		else
			System.err.println("Team Attendance page not working");
	}

}
