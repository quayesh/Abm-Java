package interviewPrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/abmquayesh/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.get("http:www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.get("http://yahoo.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("acv@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Log In")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'globalContainer\']/div[3]/div/div/div")).getText());
		driver.close();
		driver.quit();
		


	}


}
