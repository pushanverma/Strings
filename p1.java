import java.util.*;


// this is all about operations of Strings 
public class p1
{
    public static void main(String [] args)
    {
        // charAt , next, nextLine ,a.length()

        Scanner scn =new Scanner(System.in);
        String s ="hello";
        // String s1 =scn.next();
        // String s2 =scn.nextLine();
        // System.out.println(s);
        // System.out.println(s1);
        // System.out.println(s2);
        
        String a="pushanverma";
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        for(int i =0;i<a.length();i++)
        {
            char ch =a.charAt(i);
            System.out.println(ch);

        }
        // Substrings

        System.out.println("//////////////////////");
        System.out.println(a.substring(1, 10));
        System.out.println(a.substring(0) );
        System.out.println(a.substring(1));

        // adding two strings
        String s1="hello";
        s1+="o";
        s1+=" ";
        s1+="oooooooo";
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);


        // Split
        String s2="abc def ghi jkl";
        
        String []parts= s2.split(" ");
        for(int i=0;i<parts.length;i++)
        {
            System.out.println(parts[i]);
        }



    }
}