package drink.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogoutController {
	public void logout() throws IOException  {
		// TODO Auto-generated method stub
		System.out.println("======================================");
		System.out.println("Enter passWord");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String passWord=sc.readLine();
		System.out.println();
		System.out.println();
		
		if((LoginController.passWord).equalsIgnoreCase(passWord))
		{
		System.out.println("YOU HAVE BEEN SUCCESSFULLY LOGGEDOUT");
		System.exit(0);
		}
		else
		{
			System.out.println("You are not logged in");
		}
		
	}
}
