package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage_TC1;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	    driverutilies.switchtabs(driver);
	    driverutilies.mouseHover(driver, sd.getCoursebtn());
	    sd.seleniumtrainingtab();
	    
	    AddtocartPage_TC1 a= new AddtocartPage_TC1(driver);
	    driverutilies.doubleclick(driver, a.getAddbtn());
	    a.addtocartbtn();
	    driverutilies.alertpopup(driver);
	}

}
	
