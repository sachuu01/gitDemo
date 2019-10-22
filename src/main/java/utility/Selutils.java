package utility;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Testbase;

public class Selutils extends Testbase{

	public Selutils() throws IOException {
		super();
		
	}

	 public static void checkAlertisPresent()
	  {
		  
		  WebDriverWait wait= new WebDriverWait(driver, 40);
		  
		  if( wait.until(ExpectedConditions.alertIsPresent()) != null)
		  {
			 
			  System.out.println("Alert is present");
		      Alert alert=driver.switchTo().alert();   
		      String alerttext=alert.getText();
		      
		      
		      alert.dismiss();
		  }
			  else
			  {
				  System.out.println("Alert is not present");
		
			  }
		 
			  
	
	
	
	
		  }
	
	 public static void JsExecutorClickElement(WebElement element)
	 {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 
		 js.executeScript("arguments[0].click();", element);
	 }
	
	
	
	
	
	
	
	
	
}
