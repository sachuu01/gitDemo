package stepsPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.profiler.ProfilerLogEntry;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Testbase;
import utility.Selutils;

public class Login_po extends Testbase {
	
	
	public Login_po() throws IOException 
	{
		super();
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@id=\"sw_dropdown_4\"]")
	private WebElement myaccount;
	
	
	@FindBy(xpath="//a[contains(@data-ca-target-id,'login_block4')]")
	private WebElement signIn;
	
	@FindBy(xpath="//*[@id='login_popup4']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='psw_popup4']")
	private WebElement password;
	
	@FindBy(xpath="//*[@type=\"submit\" and @name='dispatch[auth.login]']")
	private WebElement loginbtn;
	
	
	@FindBy(xpath="//*[@id=\"ui-id-1\"]")
	private WebElement signInpageTille;
	
	@FindBy(xpath="//div[contains(@id,'dropdown_3')]//li[contains(text(),'sa')]")
	private WebElement userProfileName;
	

	
	
	
	
	
	public void clickonMyaccountLink()
	{
		WebDriverWait wait= new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(myaccount)).click();
	  //	myaccount.click();
	}
	
	
	public void clickonSignInLink()
	{
		signIn.click();
	}
	
	public String getsigninpageTitle()
	{
		String pagetitle=signInpageTille.getText();
		return pagetitle;
	}
	
	
	public String settUsername(String uname)
	{
		username.clear();
	    username.sendKeys(uname);
		return uname;
	}
	
	public String setpassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
		return pass;
		
		
	}
	
	public void ClickonLoginButton()
	{
		Selutils.JsExecutorClickElement(loginbtn);
	}
	
	public String getProfileNmae() {
		
		String Profilename=userProfileName.getText();
		return Profilename;
		
		
	}
	
	

}
