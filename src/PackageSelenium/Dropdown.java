package PackageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 driver.get("https://www.facebook.com");
 Select drpcountry = new Select(driver.findElement(By.name("birthday_day")));
drpcountry.selectByVisibleText("15");
Select dropcountry = new Select(driver.findElement(By.name("birthday_month")));
dropcountry.selectByIndex(11);
Select drcountry = new Select(driver.findElement(By.name("birthday_year")));
drcountry.selectByVisibleText("1984");

	}

}
