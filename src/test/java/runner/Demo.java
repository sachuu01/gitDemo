package runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Testbase;

public class Demo extends Testbase{

	public Demo() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Test
	public void check_login_Funcationality()
	{
		
		initilizebrowser();
		
		WebElement myaccount=driver.findElement(By.xpath("//*[@class='hidden-phone']"));
		myaccount.click();
		
		
	}
	
	
}
