package drink.Ui;

import static org.junit.Assert.*;

import org.junit.Test;

import drink.service.LoginController;

public class Testing {
 LoginController l=new LoginController();
	@Test
	public void testLogin() {
		assertEquals("Successfully Login",l.login("user", "Unnati27@"));
	}
	
	

}
