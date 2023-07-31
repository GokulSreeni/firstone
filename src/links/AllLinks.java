package links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks 
{
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		java.util.List<WebElement>links=driver.findElements(By.tagName("a"));
		int lc=links.size();
		System.out.print("Total number of links:"+lc);
		driver.quit();
	}
}
