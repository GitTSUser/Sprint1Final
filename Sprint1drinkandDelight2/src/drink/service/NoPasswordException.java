package drink.service;

public class NoPasswordException extends Exception {
	NoPasswordException()
	{
	System.out.println("You have not yet logged in");
	}

}
