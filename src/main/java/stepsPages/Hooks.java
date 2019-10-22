package stepsPages;

import java.io.IOException;

import base.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Testbase {

	public Hooks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Before
	public void setup()
	{
		initilizebrowser();
	}
	
	@After
	public void teadown()
	{
		driver.close();
	}
	
	
	

}
