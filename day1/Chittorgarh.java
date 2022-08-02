package week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chittorgarh.com");
		// click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		// click on nse bulk deals

		 driver.findElement(By.xpath("//a[text()='NSE Bulk Deals'][1]")).click();
		// Get all security names
 	List<String>securityValue=new ArrayList<String>();
		List<WebElement> securityName = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[4]"));
		for (int i = 0; i < securityName.size(); i++) {
			System.out.println(securityName.get(i).getText());}
		//	String securityValue1=securityName.get(i).getText();
			
			//List<String>securityValue11=new ArrayList<String>();
			
			Set<String>TargetSet=new TreeSet<String>(securityValue);
			if (TargetSet.size()<securityName.size()) 
			   {
			    	System.out.println("yes the list contains duplicate values");
				    
				}
			else {System.out.println("no the list contains no duplicate values");
		    
				
			}
	}
	
		
		
	
			
			
	
			
		

		/*
		 * "Assignment3:\r\n" "Chittorgarh:\r\n"
		 * "// 1. Launch the URL https://www.chittorgarh.com/\r\n" +
		 * "//2. Click on stock market\r\n" + "//3. Click on NSE bulk Deals\r\n" +
		 * "//4. Get all the Security names\r\n" +
		 * "//5. Ensure whether there are duplicate Security names\r\n" + ");
		 */

	}



	
	
