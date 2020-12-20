public class InvalidCheck extends Exception
{

   public InvalidCheck(String input)
   {
       super(input);
       System.out.println(input+" does not meet input requirements");
   }

}