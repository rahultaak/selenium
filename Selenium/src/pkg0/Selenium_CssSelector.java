package pkg0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_CssSelector {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\testing software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     
	     WebElement firstname = driver.findElement(By.cssSelector("input#u_0_l"));
	     firstname.sendKeys("RAHUL");
	     
	     WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname']"));
	     lastname.sendKeys("TAAK");
	     
	     WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
	     email.sendKeys("rahultaak06@gmail.com");
	     
	     WebElement email2 = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
	     email2.sendKeys("rahultaak06@gmail.com");
	     
	     WebElement pass = driver.findElement(By.cssSelector("input#u_0_x"));
	     pass.sendKeys("rahul@8800");
	     
	     WebElement drop1=driver.findElement(By.cssSelector("select#day"));
	     Select s = new Select(drop1);
	     s.selectByIndex(17);

	     WebElement drop2=driver.findElement(By.cssSelector("select#month"));
	     Select r = new Select(drop2);
	     r.selectByVisibleText("May");
	     
	     WebElement drop3=driver.findElement(By.cssSelector("select#year"));
	     Select t = new Select(drop3);
	     t.selectByValue("1992");
	     
	     WebElement select = driver.findElement(By.cssSelector("input._8esa"));
	     select.click();
	     
	     WebElement submit = driver.findElement(By.cssSelector("button#u_0_15"));
	     submit.click();
	}

}
