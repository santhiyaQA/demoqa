package infoTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inform {

	public static void main(String[] args) {
		
		WebDriver driver;
		String Chropath = "C:\\Users\\r.santhiya\\Downloads\\chromedriver_win32\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chropath);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
