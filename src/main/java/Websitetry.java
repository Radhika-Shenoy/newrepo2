import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Websitetry {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\M1074287\\eclipse-workspace\\Trialproject\\target\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.homecentre.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("js-site-search-input")).sendKeys("tea cups");
		driver.findElement(By.id("js-site-search-input")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@id='prodItemImg0']")).click();
		

	}

}
