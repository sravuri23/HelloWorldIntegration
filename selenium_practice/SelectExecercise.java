package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExecercise {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://store.audi.co.uk/customer/account/create/");
		
		    driver.manage().window().maximize();
		    
		    Select S = new Select(driver.findElement(By.name("prefix")));
		    //S.selectByVisibleText("Lord");
		      //S.selectByValue("Dr");  
		    //  S.selectByIndex(2);
		    
		       int x=S.getOptions().size();
               
		        System.out.println("All the options are: "+x);
		    
//		     List <WebElement> l = driver.findElements(By.tagName("option"));
//		     int a = l.size();
//		     System.out.println(a);

            Thread.sleep(1000);
//		    
//		      Select CheckBox = new Select(driver.findElement(By.id("markperm_email-select")));
//		      CheckBox.selectByVisibleText("Email");
//		      
//		      
		      
		    
		    
			Thread.sleep(2000);
			
			driver.close();
	}

}
