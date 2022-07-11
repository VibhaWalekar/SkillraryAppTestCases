package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage_TC2;

public class Testcase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	    driverutilies.switchtabs(driver);
	    driverutilies.dropDown(sd.getDropdowntab(), pdata.getPropertyfile("coursedropdown"));
	    
	    TestingPage_TC2 t = new TestingPage_TC2(driver);  
	    driverutilies.draganddrop(driver, t.getSelcourse(), t.getCarttab());
	    Point loc = t.getFacebookicon().getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    driverutilies.scrollbar(driver, x, y);
	    t.getFacebookicon();	
	}
}
