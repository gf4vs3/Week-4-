import java.util.Scanner; 
public class Digits 

{
   public static void main(String[] args) 
   {
      int number;
      int hundred;
      int ten;
      int one;  

      Scanner input = new Scanner(System.in); 

      System.out.println("Enter a 3 digit number:");
      number = input.nextInt(); 

      
      hundred = 2;
      ten = '5';
      one = 8;

      
      System.out.println(hundred);
      System.out.println(ten);
      System.out.println(one);
   }
} 