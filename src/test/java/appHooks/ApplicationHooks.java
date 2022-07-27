package appHooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumberAutomation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	
	private Base base;
	private WebDriver driver;

	
	@Before(order=0)
	public void launchbrowser() throws IOException
	{
		base=new Base();
	driver=	base.getDriver();
		
		
	}
	
	
	
	@After(order=1)
	
		public void teardown(Scenario sc)
	{
		if(sc.isFailed())
		{
			String screenshotname=sc.getName().replaceAll(" ", "_");
			byte [] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcepath, "image/png", screenshotname);
			
			
		}
		
		
	}
	
	@After(order=0)
	public void quitbrowser() throws IOException
	{
		
		driver.quit();
		
	}
	
	
	
}
