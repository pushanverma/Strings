
import java.util.*;
import java.io.*;


// This is reverse of String using String Buffer , it is easy .

public class reverseString {
    
public   static String revStr(String S) 
{
    StringBuffer s1=new StringBuffer(S);
     s1.reverse();
    return s1.toString();    // code here
    }
    
    public static void main(String[] args)
{
    Scanner scn =new Scanner(System.in);
    String s =scn.nextLine();
      System.out.println(revStr(s)); 
}
}

