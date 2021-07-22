package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationConcepts {

	public static void main(String[] args) 
	{
				System.setProperty("webdriver.chrome.driver","/Users/parimaladevi/Downloads/chromedriver");
				WebDriver driver = new ChromeDriver();
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
				driver.navigate().to("https://wwww.personalcreations.com");
				String A_PC_Title= driver.getTitle();
				String E_PC_Title = "Personalized Gifts | Find & Send Custom Gifts at Personal Creations";
				if(A_PC_Title.equalsIgnoreCase(E_PC_Title))
				{
					System.out.println("PASS");
					System.out.println("Actual Title:" + A_PC_Title);
					System.out.println("Expected Title:" + E_PC_Title);
				}
				else
				{
					System.out.println("FAIL");
					System.out.println("Actual Title:" + A_PC_Title);
					System.out.println("Expected Title:" + E_PC_Title);
				}
				driver.navigate().back();
				driver.getTitle();
				driver.quit();
				driver.close();
				System.out.println(driver.getTitle());
			}	
		
	}


