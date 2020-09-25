package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openedge{

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\romse\\Desktop\\Softwares\\MicrosoftWebDriver.exe");
		
			WebDriver driver = new EdgeDriver();
			driver.navigate().to("http://www.samsung.com");
			driver.manage().window().maximize();
			
			
			
	}

}
