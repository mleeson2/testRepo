package mattsFirstSeleniumJavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePOMElements {
	
	//Constructor that will initialize objects in the page
	public googlePOMElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnK")
	public WebElement btnSearch;
	
	@FindBy(id="gb_70")
	public WebElement btnFind;
	
	@FindBy(name="identifier")
	public WebElement txtSignIn;
	
	@FindBy(id="identifierNext")
	public WebElement btnNext;
	
}
