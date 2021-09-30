import java.util.*;

public class alternateString 
{
    public static String  alternate(String str)
    {
        String a="";
        for(int i =0;i<=str.length();i++)
        {
            if(i%2==0)
            {
                a+=str.charAt(i);
            }
        }
        return a;

    }
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        String s= scn.nextLine();
        System.out.println(alternate(s));
    }
}