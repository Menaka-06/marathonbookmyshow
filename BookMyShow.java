package MarathonSeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div[@class='sc-cgHJcJ hPcraY']/following::span[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 noqMC'])[5]")).click();
		//driver.findElement(By.xpath("(//div[@class='sc-2k6tnd-4 fdHSZD'])[1]//following-sibling::a[text()='IMAX 3D']")).click();
		driver.findElement(By.xpath("(//div[@id='page-cta-container'])[1]//span")).click();
		String theatrename = driver.findElement(By.xpath("//a[text()='AMB Cinemas: Gachibowli']")).getText();
	  System.out.println(theatrename);
	  driver.findElement(By.xpath("//a[text()='AMB Cinemas: Gachibowli']")).click();
	  driver.findElement(By.xpath("(//div[contains(text(),'Details')])[1]")).click();
	  String parkingavail = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
	  System.out.println("parkingavail");
	  
	  if(parkingavail.contains("Parking Facility"))
	  {
		  System.out.println("yes parking is available");
	  }
	  else
	  {
		  System.out.println("no,parking not available");
	  }
	  
	  driver.findElement(By.xpath("//div[contains(text(),'10:10 AM')]")).click();
	  driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
	  driver.findElement(By.xpath("//li[@id='pop_1']")).click();
	  driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	  driver.findElement(By.xpath("(//div[text()='Available'])[2]")).click();
	  driver.findElement(By.xpath("(//a[contains(@class,'_available')])[1]/following::a[1]")).click();
	  driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]/span")).click();
	  
	  
	  
	  
	  
	
	}

}
