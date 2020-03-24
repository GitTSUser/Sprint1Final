package drink.Ui;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import drink.service.ForgotPasswordController;
import drink.service.InvalidChoiceException;
import drink.service.LoginController;
import drink.service.LogoutController;
import drink.service.RegistrationException;



public class User 
{

		
		

		public static void main(String args[]) throws RegistrationException, InvalidChoiceException
		{
			
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			User e=new User();
			boolean a=true;
		do
		{
			
			System.out.println("WELCOME TO DRINK & DELIGHT:");
			System.out.println();
			System.out.println();	
			System.out.println("===============================");
			System.out.println("           ========");
		
				
			System.out.println("Please enter your choice:");
			System.out.println();
			System.out.println("1:login");
			System.out.println("2:Forgot Password");
			System.out.println("3:logout");
			int n;
			try {
				n = Integer.parseInt(sc.readLine());
			
			
			
			switch(n)
			{
			
				
			
			case 1:
				LoginController l=new LoginController();
				System.out.println("============================================");
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter name : ");
				String name = sc1.nextLine();
				System.out.println("Enter password : ");
				String pass = sc1.nextLine();
				
				a=l.login(name,pass);
				break;
			case 2:
				System.out.println("You can change your  password Now");
				System.out.println("Enter your Password");
			    String passnew=sc.readLine();
				ForgotPasswordController f=new ForgotPasswordController();
				a=true;
				f.forgotPassword(passnew);
				break;
			
			case 3:
				System.out.println("======================================");
				System.out.println("Enter passWord");
				//BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
				String passWord=sc.readLine();
				System.out.println();
				System.out.println();
				
				LogoutController log=new LogoutController();
				a=false;
				log.logout(passWord);
				break;
			default:
				a=false;
				throw new InvalidChoiceException("Please Enter any valid choice ");
				
			
			
			
			}
		}
		 catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		}while(a);
		
		
		
}



		public void loginInput()
		{
			System.out.println("Successfully Login");
			System.out.println("Please enter the desired action you wish to perform:");
			System.out.println("1-add");
			System.out.println("2-display");
		}
}