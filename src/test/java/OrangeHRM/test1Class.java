package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class test1Class {
	
	WebDriver driver;
	HomePage Hpom;
	
	@BeforeMethod
	public void LaunchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\eclipse_Jdrive\\Chrome\\Chrome119\\chromedriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("Headless");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://amityonline.com/");
		Thread.sleep(1000);
		Hpom=new HomePage(driver);

	}
	
	@Test (priority = 1)
	public void AmityLogo() {
		Hpom.HomePageAmityLogo();

	}


	@Test(priority = 2)
	public void ProgramButton(){
		Hpom.ProgramHeaderbutton();

	}

	@Test(priority = 3)
	public void CareerServices() throws InterruptedException{
		Hpom.CareerServicesHeaderButton();

	}


	@Test(priority = 4)
	public void AdvantagesButton(){
		Hpom.AdvantagesHeaderButton();

	}

	@Test(priority = 5)
	public void SearchButton(){
		Hpom.SearchHeaderButton();

	}
	
	@AfterMethod

	public void CloseBrowser() {
		driver.quit();
	}

}
	