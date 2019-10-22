package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utility.Constant;

public class Testbase {
	
   public static FileInputStream fis          = null;
	
   public static File fil                     = null;
   
   public static Properties prop              = null;

	public static WebDriver driver;
	
	public static String browername;
	
	
	
	
	
	public Testbase() throws IOException {
		
		
     fis= new FileInputStream(Constant.filepath_config)	;
	 prop= new Properties();
	 prop.load(fis);
	 
	 
	
     
	
		
	}
	
	public static void initilizebrowser()
	{
	   
		
		 browername=prop.getProperty("browsername") ;
		 
		 if(browername.equals("chrome"))
		 {
			 
			 System.setProperty(prop.getProperty("chromedrivername"), prop.getProperty("chromedriverpath"));
			 
			 driver=new ChromeDriver();
			 
			 
			 
		 }else if(browername.equals("gicko"))
		 {

				System.setProperty(prop.getProperty("gickodrivername"),prop.getProperty("gickodriverpath"));
				
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				
		        capabilities.setCapability("marionette", true);
		         
		         driver = new FirefoxDriver(capabilities);
		 }
	
		 driver.get(prop.getProperty("homeurl"));
		 
			
		
	}
	
	

}
