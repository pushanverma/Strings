import java.util.*;

public class asciidiffrence {

    public static String diffrence(String s)
    {

        StringBuilder sb =new StringBuilder();
        sb.append(s.charAt(0));
        
        for(int i =1;i<s.length();i++)
        {
            char prev =s.charAt(i-1);
            char curr=s.charAt(i);
            int gap =(int)(curr -prev);
            sb.append(gap);
            sb.append(curr);

        }
        return sb.toString();
    }
    public static void main(String [] args)
    {

        Scanner scn =new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(diffrence(s)); 

    }
}
