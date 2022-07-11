package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage_TC3 {
	//Declaration
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlistbtn;
	
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement cookies;
	
	//initialization i.e. constructor
	public FramePage_TC3(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void playbutton(){
		playbtn.click();
	}
	public void pausebutton(){
		pausebtn.click();
	}
	public void addtowishlistbutton() {
		addtowishlistbtn.click();
	}
	public void acceptcookies() {
		cookies.click();
	}
}
