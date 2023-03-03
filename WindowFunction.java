package Week4Day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowFunction {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//span[text()='Open']")).click();
	
	Set<String> wh = driver.getWindowHandles();
	List<String>w1=new ArrayList<String>(wh);
	driver.switchTo().window(w1.get(1));
	driver.close();
	driver.switchTo().window(w1.get(0));
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	Set<String> wh1 = driver.getWindowHandles();
	List<String>w2=new ArrayList<String>(wh1);
	driver.switchTo().window(w2.get(2));
	driver.close();
	driver.switchTo().window(w2.get(1));
	driver.close();
	driver.switchTo().window(w2.get(0));
	driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
	
	Set<String> wh2 = driver.getWindowHandles();
	List<String>w3=new ArrayList<String>(wh2);
	driver.switchTo().window(w3.get(3));
	driver.close();
	driver.switchTo().window(w3.get(2));
	driver.close();
	driver.switchTo().window(w3.get(1));
	driver.close();
	driver.switchTo().window(w3.get(0));
	driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
	
	Set<String> wh4 = driver.getWindowHandles();
	List<String>w4=new ArrayList<String>(wh4);
	System.out.println(w4.size());
	driver.quit();


}
}