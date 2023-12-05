import java.util.*;
public class Big {
    public static void main(String[] args)
    {
        int a,b,big;
        System.out.println("Enter the for A abd B :\r\n");
        Scanner s =new Scanner(System.in);
        a = Integer.parseInt(s.nextLine()); 
        b = Integer.parseInt(s.nextLine());
        if(a>b)
        big = a;
        else
        big = b;
        System.out.println("The biggest number is :"+ big);
        if(big == a)
        System.out.println("A is biggest");
        else
        System.out.println("B is biggest");

        s.close();
    }
    
       
    
    
}
