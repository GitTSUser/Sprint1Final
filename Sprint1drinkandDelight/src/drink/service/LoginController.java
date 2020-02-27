package drink.service;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;







public class LoginController{
	
	

	public static String passWord,user;
	

	public  String login(String name,String pass)  {
		
		
		
		

			passWord=pass;
			user=name;
			String str1="";
			try {
		
			if(name.equalsIgnoreCase("USER") && pass.equalsIgnoreCase(passWord))
			{
				
				
				boolean	flag=pass.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
				if(flag==false || pass.equals(null))
					{
						 
							 
							throw new RegistrationException();
					} 
				else
				{
					System.out.println("Please enter the desired action you wish to perform:");
					str1= "Successfully Login";
				}
				
		
			}
			else
			{
				System.out.println("INVALID CREDENTIAL");
		
			System.out.println("=====================================================");
		}}
			catch(RegistrationException e)
		{
			System.out.println(e);
		}
			return str1;


	
	

}
}
