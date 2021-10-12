import java.util.*;


class pattern
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        String  sum =0;
        // your code here
        for(int i=0;i<str.length();i++)
        
        {
            sum+=str.charAt(i);
        }
        
        return sum;0
    }
    public static void main(String [] args){
        Scanner scn =new Scanner(System.in);
        String s=scn.next();
       System.out.println(findSum(s)); 
    }
}