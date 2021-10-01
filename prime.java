import java.util.*;

public class prime {

    public static Boolean isPrime(int n )
    {
        boolean  flag =true;
        for(int i =2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }
        return flag;
    }

    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
         boolean ans=isPrime(n); 
         System.out.println();
         if(ans ==true)
         {
             System.out.println("is a prime no.");
         } 
         else 
         {
             System.out.println("not a prime no.");
         }
    }
}
