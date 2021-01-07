package testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.RSALandingpage;
import resources.Base;

public class LandingPageTest extends Base {

	public WebDriver driver;
	RSALandingpage rl;
		
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void landingPage()
	{
		rl=new RSALandingpage(driver);
		rl.radio1().click();
		Select s=new Select(rl.dropdown());
		s.selectByVisibleText("Option2");
		rl.option1().click();
		rl.sugbox().sendKeys("Uni");
		List<WebElement> options=driver.findElements(By.cssSelector(".ui-menu-item"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
			{
				option.click();
				break;
			}
		}
		rl.openWindow().click();
		rl.openTab().click();
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		String childId2=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childId2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		rl.alertName().sendKeys("Merwyn");
		rl.alert().click();
		driver.switchTo().alert().accept();
		rl.alertName().sendKeys("Rohan");
		rl.confirm().click();
		driver.switchTo().alert().dismiss();
		rl.elementDisplayed().sendKeys("R1");
		rl.hide().click();
		System.out.println(rl.elementDisplayed().isDisplayed());
		//Assert.assertTrue(rl.elementDisplayed().isDisplayed());
		rl.show().click();
		//System.out.println(rl.elementDisplayed().isDisplayed());
		Assert.assertTrue(rl.elementDisplayed().isDisplayed());
		/*Actions a=new Actions(driver);
		WebElement move=rl.mouseHover();
		a.moveToElement(driver.findElement(By.cssSelector("[href*='top']"))).click().build().perform();*/
		System.out.println(driver.findElements(By.cssSelector("#courses-iframe")).size());
		//driver.switchTo().frame(0);
		//rl.viewAllCourses().click();
		//rl.practiceProject().click();
		//rl.course1().click();
		//rl.rupee().click();
		//driver.findElement(By.cssSelector(".btn.btn-primary.view-all-courses-btn")).click();
	
		
	}

	@Test
	public void landingPage2() throws InterruptedException
	{
		
		rl=new RSALandingpage(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values=rl.amounts();
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		int total=Integer.parseInt(rl.totalAmount().getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
	}
	
	@Test
	public void landingPage3()
	{
		rl=new RSALandingpage(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,650)");
		List<WebElement> values=rl.price();
		int sum=0;
		for(WebElement value:values)
		{
			sum=sum+Integer.parseInt(value.getText());
		}
		System.out.println(sum);
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}*/
}
