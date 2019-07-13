package mattsFirstSeleniumJavaTest;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class launchBrowser {

	public static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/matth/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Object for the page
		googlePOMElements page = new googlePOMElements(driver);
		//testCommentForJenkins
		
		//Sign-Up Negative Test Case
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		page.txtSearch.sendKeys("help");
		//driver.findElement(By.name("q")).sendKeys("help");
		page.btnSearch.click();
		//driver.findElement(By.name("btnK")).click();
		page.btnFind.click();
		//driver.findElement(By.id("gb_70")).click();
		page.txtSignIn.sendKeys("test");
		//driver.findElement(By.name("identifier")).sendKeys("sfsakljlksjdf");
		page.btnNext.click();
		//driver.findElement(By.id("identifierNext")).click();
		
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Google"))
			System.out.println("Title matches");
		else
			System.out.println(title);

	}


	}


