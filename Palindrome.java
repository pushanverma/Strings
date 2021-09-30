import java.util.*;

// this is isPalindrome using String 
public class Palindrome {

    public static boolean isPaindrome(String s)
    {
        int i =0;
        int j =s.length()-1;
        while(i<=j)
        {
            char ch1 =s.charAt(i);
            char ch2=s.charAt(j);
                if(ch1==ch2)
                {
                    i++;
                    j--;
                }
                else 
                {
                    return false;
                }
        }
        return true;

    }

    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        String s = scn.next();
        boolean b= isPaindrome(s);
        System.out.println(b);

    }
}
