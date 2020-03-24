package drink.Ui;

import static org.junit.Assert.*;

import org.junit.Test;


import drink.service.ForgotPasswordController;
import drink.service.LoginController;

public class UserTesting {
	
 LoginController l=new LoginController();
 ForgotPasswordController f=new ForgotPasswordController();
	@Test
	public void testtrueLogin() {
		assertEquals(true,l.login("user", "Unnati27@"));
	}
	@Test
	public void testfalseLogin() {
		assertEquals(false,l.login("user", "Unnati27@"));
	}
	@Test
	public void testtrueForgotpassWord()
	{
		assertEquals("Unnati27@@",f.forgotPassword("unnati27@@"));
	}
	@Test
	public void testfalseForgotpassWord()
	{
		assertEquals("Unnati27",f.forgotPassword("unnati27@@"));
	}
	
	{
	l=null;
	f=null;
	}
}



