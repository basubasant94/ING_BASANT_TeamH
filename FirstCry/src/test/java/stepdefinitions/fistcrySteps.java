package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.FirstBaseClass;
import PageObjects.FirstCryHomePage;
import PageObjects.FirstCryHomePage;
import io.cucumber.java.en.*;

public class fistcrySteps extends FirstBaseClass {


	public WebDriver driver;
	public FirstCryHomePage hp;
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		

		String currentDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",currentDir + "//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    
		hp = new FirstCryHomePage(driver);
	   
	}

	@When("^user opens the URL {string}$")
	public void user_opens_the_URL(String url) {
	 
		driver.get(url);
	}

	@Then("^title of the home page is firstcry$")
	public void title_of_the_home_page_is_firstcry() {
	   
	}

	@And("^Hover Over on All Categories$")
	public void hover_Over_on_All_Categories() {
	    
	}

	@And("^select Boy fashion$")
	public void boy_fashion() {
	    
	}


}
