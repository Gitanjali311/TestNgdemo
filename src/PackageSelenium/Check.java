package PackageSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com//");

	}

}
