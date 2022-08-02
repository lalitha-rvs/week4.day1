package week4.day1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement table = driver.findElement(By.tagName("table"));

		List<WebElement> rowCount = table.findElements(By.tagName("tr")); // no.of rows
		System.out.println("Count of no. of rows : " + (rowCount.size() - 1));

		List<WebElement> columnCount = table.findElements(By.tagName("th")); // no.of coloumns
		System.out.println("Count of no. of columns : " + columnCount.size());

		for (int i = 1; i < rowCount.size(); i++) { // get the progress value of learn to interact with elements
			 
			WebElement row = rowCount.get(i);
			List<WebElement> Column = row.findElements(By.tagName("td"));
			for (int j = 0; j <Column.size(); j++) {

				if (Column.get(j).getText().contains("Learn to interact with Elements")) {
					System.out.println("Progress : " + (rowCount.get(i).getText()));
				}
			}
		}
		List<WebElement> progressValueElement = driver.findElements(By.xpath("//table//tr//td[2]"));
		List<Integer> progressValue = new ArrayList<>();
		for (WebElement eachElement : progressValueElement) {
			progressValue.add(Integer.parseInt(eachElement.getText().replace("%", "")));
		}
		int value = progressValue.get(0);
		int minValue = 0;
		for (int i = 0; i < progressValue.size(); i++) {
			if (value > progressValue.get(i)) {
				value = progressValue.get(i);
				minValue = minValue + 2;
			}
		}
		driver.findElement(By.xpath("//table//tr[" + minValue + "]//td[3]")).click();
		boolean enabled = driver.findElement(By.xpath("(//input[@name='vital'])[5]")).isEnabled();
		if (enabled) {
			System.out.println("Vital task for the least completed progress is checked");
		} else {
			System.out.println("Vital task for the least completed progress is not checked");
		}

	}
}