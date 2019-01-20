package PackageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0&otracker1=AS_Query_TrendingAutoSuggest_1_0&as-pos=1&as-type=TRENDING");
WebElement radio1= driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div._1HmYoV.hCUpcT > div:nth-child(1) > div._1HmYoV._35HD7C.col-12-12 > div:nth-child(1) > div > section:nth-child(5) > div._3mk-PQ > div > div:nth-child(3) > div > div > label > div._1p7h2j"));

radio1.click();
	
	}
}