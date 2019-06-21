package javademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
                      WebDriver driver=new ChromeDriver();
                      
                driver.get("https://www.google.com");
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                //System.out.println(driver.getPageSource());
                
       driver.get("https://www.facebook.com"); 
       driver.navigate().back();
       driver.navigate().forward();
       driver.close();
      
       
                      


	}

}
