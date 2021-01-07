package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RSALandingpage {

	public WebDriver driver;
	
	public RSALandingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By radio1=By.xpath("//*[@value='radio1']");
	By dropdown=By.cssSelector("#dropdown-class-example");
	By option1=By.cssSelector("#checkBoxOption1");
	By sugbox=By.cssSelector("#autocomplete");
	By openWindow=By.cssSelector("#openwindow");
	By openTab=By.id("opentab");
	By alertName=By.cssSelector("#name");
	By alert=By.cssSelector("#alertbtn");
	By confirm=By.cssSelector("#confirmbtn");
	By elementDisplayed=By.cssSelector("#displayed-text");
	By hide=By.id("hide-textbox");
	By show=By.id("show-textbox");
	By mouseHover=By.id("mousehover");
	By iFrame=By.cssSelector("#courses-iframe");
	By rupee=By.cssSelector(".onoffswitch4-switch");
	By course1=By.xpath("//h2/a");
	By practiceProject=By.xpath("//*[text()='Practice Projects']");
	By viewAllCourses=By.xpath("//*[text()='VIEW ALL COURSES']");
	By amounts=By.cssSelector(".tableFixHead td:nth-child(4)");
	By totalAmount=By.cssSelector(".totalAmount");
	By price=By.cssSelector(".table-display td:nth-child(3)");
		
	public WebElement radio1()
	{
		return driver.findElement(radio1);
	}
	public WebElement dropdown()
	{
		return driver.findElement(dropdown);
	}
	public WebElement option1()
	{
		return driver.findElement(option1);
	}
	public WebElement sugbox()
	{
		return driver.findElement(sugbox);
	}
	public WebElement openWindow()
	{
		return driver.findElement(openWindow);
	}
	public WebElement openTab()
	{
		return driver.findElement(openTab);
	}
	public WebElement alertName()
	{
		return driver.findElement(alertName);
	}
	public WebElement alert()
	{
		return driver.findElement(alert);
	}
	public WebElement confirm()
	{
		return driver.findElement(confirm);
	}
	public WebElement elementDisplayed()
	{
		return driver.findElement(elementDisplayed);
	}
	public WebElement hide()
	{
		return driver.findElement(hide);
	}
	public WebElement show()
	{
		return driver.findElement(show);
	}
	public WebElement mouseHover()
	{
		return driver.findElement(mouseHover);
	}
	public WebElement iFrame()
	{
		return driver.findElement(iFrame);
	}
	public WebElement rupee()
	{
		return driver.findElement(rupee);
	}
	public WebElement course1()
	{
		return driver.findElement(course1);
	}
	public WebElement practiceProject()
	{
		return driver.findElement(practiceProject);
	}
	public WebElement viewAllCourses()
	{
		return driver.findElement(viewAllCourses);
	}
	public List<WebElement> amounts()
	{
		return driver.findElements(amounts);
	}
	public WebElement totalAmount()
	{
		return driver.findElement(totalAmount);
	}
	public List<WebElement> price()
	{
		return driver.findElements(price);
	}
}
