package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage_TC3;
import pomPages.FramePage_TC3;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchtextfield(pdata.getPropertyfile("coursename"));
		s.searchbutton();
		
		CoreJavaPage_TC3 cj = new CoreJavaPage_TC3(driver);
		cj.corejavabutton();
		
		FramePage_TC3 fp = new FramePage_TC3(driver);
		fp.acceptcookies();
		driverutilies.switchtoframe(driver);
		fp.playbutton();
		Thread.sleep(8000);
		fp.pausebutton();
		driverutilies.switchback(driver);
		fp.addtowishlistbutton();
	}

}
