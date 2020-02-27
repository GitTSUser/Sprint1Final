package drink.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForgotPasswordController {
	
	public boolean forgotPassword() throws IOException {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("====================================");
		System.out.println("Enter your Username:");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String name=sc.readLine();
		System.out.println();
		System.out.println();
		
		
		
		if(LoginController.passWord.equals(null))
		{
			
				throw new NoPasswordException();
			 
		}
		else
		{
		System.out.println(LoginController.passWord);
		
		}}catch (NoPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return true;
		
		
		
	}

}
