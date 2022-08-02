package week4.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
         driver.get(" https://html.com/tags/table/");
        // get the row elements in the table 
         List<WebElement>rowelements=driver.findElements(By.xpath("(//table)[1]//tr"));
         int rowcount=rowelements.size();
         System.out.println(" row count  is: "+rowcount);
         
         System.out.println(rowelements.get(0).getText());
         System.out.println(".............................");
         System.out.println(rowelements.get(1).getText());
         
         
         
         
         
}}






/*2.http://www.leafground.com/pages/sorttable.html
//1. Launch the URL https://html.com/tags/table/
//2. You have to print the respective values based on given Library
(hint: if the library was absolute usage, then print all its value)*/
