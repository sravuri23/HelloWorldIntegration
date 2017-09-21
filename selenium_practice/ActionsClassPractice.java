package selenium_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
       
       WebElement element= driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"));
        element.sendKeys("January",Keys.TAB,Keys.ENTER,"23");
        Thread.sleep(3000);
        Actions a = new Actions (driver);
        a.moveToElement(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")));
        a.click(element).build().perform();
        a.sendKeys(Keys.UP).build().perform();
        a.sendKeys(Keys.ENTER);
        a.build().perform();
        Thread.sleep(5000);
      
        
        // a.sendKeys(Keys.TAB);
        
        
        
  //driver.findElement(By.id("birthday-placeholder")).sendKeys("23");
       
       Thread.sleep(5000);
        driver.findElement(By.name("BirthYear")).sendKeys("1999");
       // Actions a1 = new Actions (driver);
        Thread.sleep(3000);
        WebElement element2 = driver.findElement(By.id("Gender"));
        a.click(element2).build().perform();
        a.sendKeys(Keys.UP,Keys.UP,Keys.UP).build().perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.id("RecoveryPhoneNumber")).clear();
        driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("+447932689584");
        Thread.sleep(3000);
        driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("ravurikumar01@gmail.com");
        Thread.sleep(5000);
      
       WebElement element4 =  driver.findElement(By.id(":i"));
       a.click(element4).build().perform();
       a.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN).build().perform();
       Thread.sleep(3000);
       a.sendKeys(Keys.ENTER).build().perform();
       Thread.sleep(5000);
       driver.findElement(By.id("submitbutton")).click();
       Thread.sleep(9000);
       
//       		   
//      WebElement element5 = driver.findElement(By.id("tos-popup-container"));
//      
//       element5.isEnabled();
//      
//         
       Thread.sleep(8000);
//       JavascriptExecutor je = (JavascriptExecutor) driver;
//       WebElement element6 = driver.findElement(By.id("iagreebutton"));
//       je.executeScript("arguments[0].scrollIntoView(true);",element6);	 
//       System.out.println(element6.getText());	   
//       element6.click();	  
        
      // List<WebElement> l = driver.findElements(By.tagName("div"));
       
       //WebElement l = driver.findElement(By.tagName("div"));
       
       
       
        //l.get(37);
       
//      int x = l.size();
//      System.out.println(x);
//     
//      for(int i=0;i<=l.size()-1;i++)
//      {
//     
//      System.out.println(i);
//     
//      String b = l.get(i).getAttribute("role");
//      System.out.println("All the elements inside the div tag are:" +b);
//     
//          
//      }

        
              
        
        
      
       
       
       // a.click(element3).build().perform();
       Robot x = new Robot();
       
       
       
       for(int i = 1; i<=16; i++)
    	   
       {
    	   
    	   x.keyPress(KeyEvent.VK_DOWN);
    	   x.keyRelease(KeyEvent.VK_DOWN);
    	 // a.sendKeys(Keys.DOWN).build().perform();
          //Thread.sleep(2000);
       
       }
    	   
      
        //a.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
       
        
        
        driver.close();
       
        
        
        
        
		
		
		
	}

}
