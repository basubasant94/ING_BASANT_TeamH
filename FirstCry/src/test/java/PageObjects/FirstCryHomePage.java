package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class FirstCryHomePage {
	
   WaitHelper helper;
	
	public WebDriver ldriver;
	
    public FirstCryHomePage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		helper = new WaitHelper(ldriver);
		
      }
	
	@FindBy(xpath="//div[@class='menu-container']/ul/li[1]")   
    @CacheLookup
    WebElement AllCategories;
	
	@FindBy(xpath="//a[@class='M13_75' and text()='BOY FASHION']")   
    @CacheLookup
    WebElement BoyFashion;
	
  
    public void HoverAllCategories() {
	AllCategories.click();
	 	
}
}
