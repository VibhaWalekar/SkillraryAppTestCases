package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage_TC1{
	//Declaration
	@FindBy(id = "add")
	private WebElement addbtn;
		
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addcart;
	
	//initialization i.e. constructor
	public AddtocartPage_TC1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocartbtn()
	{
		addcart.click();
	}
	

}
