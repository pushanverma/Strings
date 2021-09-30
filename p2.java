import java.util.*;


public class p2 {
    
    public static void main(String []args)
    {
        Scanner scn =new Scanner(System.in);
        StringBuilder sb =new StringBuilder("hello");

        System.out.println(sb.charAt(2));

        sb.setCharAt(0, 'd');
        System.out.println(sb);

        sb.insert(1, "i");
        System.out.println(sb);

        
        sb.deleteCharAt(2);
        System.out.println(sb);
        // sb.delete(2, 5);
        // System.out.println(sb);

            sb.append(" yo yo honey singh");
        System.out.println(sb);

       System.out.println(sb.length()); 



    }
}
