package javademo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://login.salesforce.com");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Anudeep");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Andeeeppdd");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
        
        
        
        

	}

}
