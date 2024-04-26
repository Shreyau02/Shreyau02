import java.lang.*;
class NumberRangeException
  {
    String message;
    NumberRangeException(String msg)//it's a constant 
    {
      this.message=msg;
    }
      return message;
  }
}
public class ExceptionDemo
{
  public static void main (String args[])
  {
    int number=25;
    try
      {
        throw newNumberRangeException("Number not within specified range:");
      }
    System.out.println("The number in range is:"+number);
  }
  catch(NumberRangeException nre)
  {
  System.out.println(nre.getmessage());
  }
}
