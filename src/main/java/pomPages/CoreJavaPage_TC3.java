package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage_TC3 
{
	//Declaration
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement corejavabtn;
	
	
	//initialization i.e. constructor
	public CoreJavaPage_TC3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public void corejavabutton() 
	{
		corejavabtn.click();
	}	
}
