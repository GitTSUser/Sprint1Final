package drink.service;

import java.util.Scanner;

public class RegistrationException extends Exception {

	public RegistrationException() {
		System.out.println("INVALID PassWord Pattern");
		System.out.println("Please ensure to have atleast one capital alphabet, atleast one small alphabet,one digit and atleast one specialCharacter");

LoginController l=new LoginController();
System.out.println("============================================");
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter name : ");
String name = sc1.nextLine();
System.out.println("Enter password : ");
String pass = sc1.nextLine();

l.login(name,pass);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		System.out.println("To try again press 1 or press 2 to recover password");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
				switch(n)
		{
				case 2:
					ForgotPasswordController f=new ForgotPasswordController();
					f.forgotPassword();
					break;
				case 1:
					LoginController l=new LoginController();
					System.out.println("============================================");
					Scanner sc1 = new Scanner(System.in);
					System.out.println("Enter name : ");
					String name1 = sc1.nextLine();
					System.out.println("Enter password : ");
					String pass1 = sc1.nextLine();
					l.login(name1,pass1);
					break;
				case 3:
					System.out.println("Invalid Creadential");
					break;
				*/

}
}
