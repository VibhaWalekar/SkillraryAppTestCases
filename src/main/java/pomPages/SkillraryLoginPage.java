package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	//Declaration.......for test case 1 & 2
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//Declaration.......for test case 3
	@FindBy(name ="q")
	private WebElement searchtf;
	
	@FindBy(xpath= "//input[@type='submit']")
	private WebElement searchbtn;

	//initialization i.e. constructor
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization.......for test case 1 & 2
	public void gearsbutton(){
		gearsbtn.click();
	}
	public void skillrarydemoapplication(){
		skillrarydemoapp.click();
	}
	//utilization.......for test case 3
	public void searchtextfield(String name){
		searchtf.sendKeys(name);
	}
	public void searchbutton(){
		searchbtn.click();
	}
}
