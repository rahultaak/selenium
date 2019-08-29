package pkg0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\testing software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.id("u_0_l"));
		first.sendKeys("RAHUL");
		
	   WebElement last = driver.findElement(By.id("u_0_n"));
	   last.sendKeys("TAAK");
	   
	   WebElement mobile = driver.findElement(By.name("reg_email__"));
	   mobile.sendKeys("8800787678");
	   
	   WebElement pass = driver.findElement(By.name("reg_passwd__"));
	   pass.sendKeys("rahul@8800");
	   
	   WebElement gender = driver.findElement(By.id("u_0_9"));
	   gender.click();
	   
	   WebElement submit = driver.findElement(By.id("u_0_15"));
	   submit.click();
		
	}

}
