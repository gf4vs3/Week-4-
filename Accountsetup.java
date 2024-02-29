import java.util.*;
public class Accountsetup
{
	public static void main(String[] args) 
	{
        String password = ("Javarocks");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name: ");

		
		String first = input.nextLine();
		System.out.println("Hello " + first);

		System.out.print("Enter your last name: ");
		String last = input.nextLine();
		System.out.println("Your name is " + first  + last);
       
        System.out.println("Your password is " + password);


		input.close();
	}
}