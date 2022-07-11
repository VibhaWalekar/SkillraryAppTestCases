package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestingPage_TC2 {
  //Declaration
	@FindBy(xpath = "(//a[text()='Selenium Training'])[2]")
	private WebElement selcourse;
	
	@FindBy (id="mycart")
	private WebElement carttab;
	
	@FindBy (xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookicon;
	
	//initialization i.e. constructor
	public TestingPage_TC2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSelcourse() {
		return selcourse;
	}

	public WebElement getCarttab() {
		return carttab;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}
}
