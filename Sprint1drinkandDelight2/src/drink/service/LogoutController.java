package drink.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LogoutController {
	public void logout(String passWord) throws IOException  {
		try
		{// TODO Auto-generated method stub
		
			
			
			
			
			
		if((LoginController.passWord).equalsIgnoreCase(passWord))
		{
		System.out.println("YOU HAVE BEEN SUCCESSFULLY LOGGEDOUT");
		System.exit(0);
		}
		else
		{
			
				throw new NoPasswordException();
			
		}
		
	}
		 catch (NoPasswordException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
}}
