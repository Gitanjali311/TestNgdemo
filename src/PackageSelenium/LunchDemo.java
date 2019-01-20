package PackageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com");
 System.out.println("facebook launched");
 driver.manage().window().maximize();
 System.out.println("your screen is maximize");
 driver.findElement(By.name("email")).sendKeys("gitanjali311@gmail.com");
 System.out.println("your id is inserted");
 driver.findElement(By.id("pass")).sendKeys("geet123");
 System.out.println("your password is inserted");
 driver.findElement(By.id ("loginbutton")).click();
}

}
