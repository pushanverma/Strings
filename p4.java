import java.util.*;

public class p4
{
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,3000);
        System.out.println(list);
        System.out.println(list.size());
        
        
    }
}