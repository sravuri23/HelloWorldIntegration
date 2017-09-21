package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailActionRobotClass {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://accounts.google.com/SignUp");
        Thread.sleep(2000);
        driver.findElement(By.id("FirstName")).sendKeys("rameshtendul");
        driver.findElement(By.id("LastName")).sendKeys("kumar");
        driver.findElement(By.id("GmailAddress")).sendKeys("rameshtendul1");
        driver.findElement(By.id("Passwd")).sendKeys("London2323");
        driver.findElement(By.id("PasswdAgain")).sendKeys("London2323");
        Thread.sleep(3000);
        
        WebElement element = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")); 
        Thread.sleep(1000);
        Actions a = new Actions (driver);
        a.moveToElement(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"))); 
        a.click(element).build().perform();
        a.sendKeys(Keys.UP).build().perform();
		a.sendKeys(Keys.ENTER);
		a.build().perform();
        Thread.sleep(5000);
        
        driver.findElement(By.id("birthday-placeholder")).sendKeys("23");
        Thread.sleep(1000);
        driver.findElement(By.name("BirthYear")).sendKeys("1999");
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.id("Gender"));
        a.click(element1).build().perform();
        a.sendKeys(Keys.UP).build().perform();
        Thread.sleep(1000);
        a.sendKeys(Keys.ENTER);
        a.build().perform();
        Thread.sleep(3000);
        driver.findElement(By.id("RecoveryPhoneNumber")).clear();
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("+447932689584");
        Thread.sleep(3000);
        driver.close();
		
		
		
		
		
	}

}
