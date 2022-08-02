package week4.day1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import io.github.bonigarcia.wdm.WebDriverManager;
	// To drag and drop 'Item 7' as first element
	public class SortTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/sortable.html");
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(item7, item1).perform();
		String text = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]")).getText();
		if(text.equals("Item 7")){
			System.out.println(text+" is dragged and dropped correctly");
		}
		else {
			System.out.println(text+" is not dragged and dropped correctly");
		}
		
	}
	}


