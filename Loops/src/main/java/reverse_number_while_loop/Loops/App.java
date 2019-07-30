package reverse_number_while_loop.Loops;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class ReverseNumberWhile
{
   public static void main(String args[])
   {
      int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
    
      Scanner in = new Scanner(System.in);
     
      num = in.nextInt();
      
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}