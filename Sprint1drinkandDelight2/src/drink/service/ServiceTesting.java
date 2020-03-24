package drink.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTesting {
	LoginController l=new LoginController();

	
	
	
	
	
	
	@Test
	public void testFalsePassword() {
		assertEquals(false,l.validatePassWord("Unnati"));
	}
	@Test
	public void testTruePassword() {
		assertEquals(true,l.validatePassWord("Unnati27@"));
	}
	@Test
	public void testTrueUsername() {
		assertEquals(true,l.validateUser("USER"));
	}
	@Test
	public void testFalseUsername() {
		assertEquals(false,l.validateUser("USER1"));
	}

}
