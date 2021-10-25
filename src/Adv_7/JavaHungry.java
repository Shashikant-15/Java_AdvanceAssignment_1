package Adv_7;


/**********************************************************************************************
 *

public class JavaHungry {
    public static void main(String args[])
    {
        try
        {
            int arr[]= {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception : " + e);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
        }
    }
}
 *********************************************************************************************/
 /****___________________________________output:________________________________________________
  Exception 'java.lang.ArrayIndexOutOfBoundsException' has been already  caught
  ____________________________________________________________________________________________*/


//       ++++++++++++++++++++++++++++++++Explanation +++++++++++++++++++++++++++++++++++++++++++++++:
//        It shows Exception because we already declare the Super class of Exception in the first catch block(Exception e)
//        i.e a Parent Class of ArrayIndexOutOfBoundsException.

//        We can handle this exception : if we declare ArrayIndexOutOfBoundsException in first catch block.
//        We have to define the Exception class at the last catch block.