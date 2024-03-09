package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Base.Base;
import com.Utilities.ConfigReader;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	private Base base;
	private WebDriver driver;
	private ConfigReader configreader;
	Properties prop;
	
	@Before(order =1)
	public void getProperty() throws IOException { 
		configreader = new ConfigReader(); 
		prop = configreader.init_prop();
	}
	
	@Before (order=2)
	public void openBrowser() { 
		String browser = prop.getProperty("browser"); 
		base = new Base();
		base.init_driver(browser);
	}
	
	@After(order =0)
	public void teardown() {
		Base.getDriver().quit();
	}
	
	@After(order=1)
	public void screenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte [] sourcePath = ((TakesScreenshot)Base.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png",screenshotName );
			
		}
	}

}
