package drink.service;

import drink.Ui.User;

public class LoginController{
	
	
     boolean b=false;
	public static String passWord,user;
	//Username validation
	public boolean validateUser(String user)
	{
		if(user.equals("USER"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//password validation
	public  boolean validatePassWord(String pass)
	{
	try {

	

	if(pass.equalsIgnoreCase(passWord))
	{
		
		
		boolean	flag=pass.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})");
		if(flag==false || pass.equals(null))
			{
				 
					 
					throw new RegistrationException();
			} 
		else
		{
			User u=new User();
			u.loginInput();
			 b=true;
		}
		

	}
	else
	{
		
		b=false;
		throw new RegistrationException();

	
}}
	catch(RegistrationException e)
{
	System.out.println("=====================================================");
	System.out.println(e);
}
	return b;

	



	}
	

	public  boolean login(String name,String pass)  {
		
		
		
		

			passWord=pass;
			boolean b = false;
			user=name;
			boolean p= validatePassWord(passWord);
			boolean u=validateUser(user);
			if(p && u)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
			}
}
