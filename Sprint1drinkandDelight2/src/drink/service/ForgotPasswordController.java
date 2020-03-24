package drink.service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ForgotPasswordController {
	
	public String forgotPassword(String newpass)  {
		// TODO Auto-generated method stub
		String newpassWord;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			newpassWord= newpass;

			boolean	flag=newpassWord.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
			if(flag==false || newpassWord.equals(null))
				{
					 
						 
						throw new RegistrationException();
				} 
			else
			{
				LoginController.passWord=newpassWord;
			}
		} catch (RegistrationException e) {
			// TODO Auto-generated catch block
			
		}
		return 	LoginController.passWord;

		
		
		
		
		
		
		
		
		
		
		//}
		/*//System.out.println("Press 2 to recover password");
		try {
		//int choice=Integer.parseInt(sc.readLine());
	//	if(choice==1)
		//{
			System.out.println("Enter your Password");
			newpassWord= sc.readLine();
			return newpassWord;
		//}
		//else
		//{
			try
		{
		System.out.println("====================================");
		
		System.out.println("Enter your Username if you want to recover Your password:");
	
		String name;
		
			name = sc.readLine();
		
		System.out.println();
		System.out.println();
		
		
		
		if((name.equalsIgnoreCase("user")))
		{
			
			System.out.println(LoginController.passWord);	
			 
		}
		else if(LoginController.user.equals("") ||!( name.equalsIgnoreCase("user")) )
		{
			throw new NoPasswordException();
		
		
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No such user");
		}
		catch (NoPasswordException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return newpassWord;
		
		
		
	}

		}}}*/
		}
}
