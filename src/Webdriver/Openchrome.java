package Webdriver;

//either use the get method or the navigate to method

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome 
{

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\romse\\Desktop\\Softwares\\chromedriver.exe");
	
 WebDriver driver = new  ChromeDriver();
 driver.get("https://www.bbc.co.uk");
 
 
 driver.navigate().to("https://www.zara.co.uk");
 
}

}

