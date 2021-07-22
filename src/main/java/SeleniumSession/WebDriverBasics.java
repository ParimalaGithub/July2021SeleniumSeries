package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","/Users/parimaladevi/Downloads/chromedriver");
		WebDriver driver = new SafariDriver();
		//WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.simplytoimpress.com");
		String ATitle= driver.getTitle();
		String ETitle = "Birth Announcements, Invitations, Holiday Cards | Simply to Impress";
		if(ATitle.equalsIgnoreCase(ETitle))
		{
			System.out.println("PASS");
			System.out.println("Actual Title:" + ATitle);
			System.out.println("Expected Title:" + ETitle);
		}
		else
		{
			System.out.println("FAIL");
			System.out.println("Actual Title:" + ATitle);
			System.out.println("Expected Title:" + ETitle);
		}
		driver.quit();
		driver.close();
		System.out.println(driver.getTitle());
	}

}
