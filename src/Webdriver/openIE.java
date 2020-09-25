package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class openIE {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver" , "C:\\Users\\romse\\Desktop\\Softwares\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.navigate().to("https://www.zara.co.uk");
	}

}
