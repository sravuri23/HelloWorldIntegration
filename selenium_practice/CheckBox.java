package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://store.audi.co.uk/customer/account/create/");
		//System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List <WebElement> l = driver.findElements(By.tagName("span"));
		int x = l.size();
		System.out.println(x);
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(i);
			String b = l.get(i).getText();
			System.out.println(b);
		}
		
		
		Thread.sleep(1000);
		
		l.get(102).click();
		l.get(104).click();
		l.get(106).click();
		l.get(108).click();
		System.out.println("Successfully clicked");
		
		Thread.sleep(1000);
		
		driver.close();
		
		

	}

}
