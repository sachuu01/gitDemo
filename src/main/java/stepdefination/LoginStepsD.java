package stepdefination;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import base.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepsPages.Login_po;
import utility.Selutils;

public class LoginStepsD extends Testbase{
	
	Login_po loginpo;
	
	
	public LoginStepsD() throws IOException {
		super();
	   
	}
	

	@Given("^browser should lounch$")
	public void browser_should_lounch() throws Exception {
	  
	}

	@When("^user is on loginpage$")
	public void user_is_on_loginpage() throws Exception {
	    
	}

	@When("^click on loginlink$")
	public void click_on_loginlink() throws Exception {
		initilizebrowser();
	    loginpo=new Login_po();
		loginpo.clickonMyaccountLink();
		loginpo.clickonSignInLink();
		
	    
	}

	@Then("^loginwindow should display$")
	public void loginwindow_should_display() throws Exception {

	    String exp="Sign in";
	 
		String PageTitle=loginpo.getsigninpageTitle();
		System.out.println("pageTitle: " +PageTitle);
		Assert.assertEquals(PageTitle, exp);
		
	}

	@When("^user enter valid username and password \"([^\"]*)\"  \"([^\"]*)\"$")
	public void user_enter_valid_username_and_password(String username, String password) 
	{
		loginpo.settUsername(username);
		loginpo.setpassword(password);
		
		
	    
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Exception {
		
	 loginpo.ClickonLoginButton();
	
	}
	

	
	
	@After
	public void teardown() {
		
		driver.close();
	}

}
