package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage           
{
	//Declaration.......for test case 1
	@FindBy(id = "course")
	private WebElement coursebtn;
	
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//Declaration.......for test case 2
	@FindBy(name = "addresstype")
	private WebElement dropdowntab;
		
	//initialization i.e. constructor
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization.......for test case 1
	public WebElement getCoursebtn() 
	{
		return coursebtn;
	}
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}
	//utilization.......for test case 2
	public WebElement getDropdowntab() {
		return dropdowntab;
	}
	
	

}
