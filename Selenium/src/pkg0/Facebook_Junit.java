package pkg0;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Junit {
	
	ChromeDriver dri;
	@Before
	public void  launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\testing software\\chromedriver.exe");
		dri = new ChromeDriver();
		dri.get("https://www.facebook.com");
		dri.manage().window().maximize();
		
	}
	
	@Test
	public void signup() throws InterruptedException
	{
		WebElement firstname = dri.findElement(By.cssSelector("input#u_0_l"));
	     firstname.sendKeys("RAHUL");
	     
	     WebElement lastname = dri.findElement(By.cssSelector("input[name='lastname']"));
	     lastname.sendKeys("TAAK");
	     
	     WebElement email = dri.findElement(By.cssSelector("input[name='reg_email__']"));
	     email.sendKeys("rahultaak06@gmail.com");
	     
	     WebElement email2 = dri.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
	     email2.sendKeys("rahultaak06@gmail.com");
	     
	     WebElement pass = dri.findElement(By.cssSelector("input#u_0_x"));
	     pass.sendKeys("rahul@8800");
	     
	     WebElement drop1=dri.findElement(By.cssSelector("select#day"));
	     Select s = new Select(drop1);
	     s.selectByIndex(17);

	     WebElement drop2=dri.findElement(By.cssSelector("select#month"));
	     Select r = new Select(drop2);
	     r.selectByVisibleText("May");
	     
	     WebElement drop3=dri.findElement(By.cssSelector("select#year"));
	     Select t = new Select(drop3);
	     t.selectByValue("1992");
	     
	     WebElement select = dri.findElement(By.cssSelector("input#u_0_6"));
	     select.click();
	     
	     WebElement submit = dri.findElement(By.cssSelector("button#u_0_15"));
	     submit.click();
	     Thread.sleep(10000);
	}
	
	@After
	public void browserclose()
	{
		
	dri.close();
	}
	
	

}
