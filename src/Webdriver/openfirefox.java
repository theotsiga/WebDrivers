package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openfirefox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //// no firefox installed 
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\romse\\Desktop\\Softwares\\geckodriver.exe");
	}

}

