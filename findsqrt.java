import java.util.*;
public class findsqrt {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int sq=(int)Math.sqrt(n);
            System.out.println(sq);
            
            t--;
        }
    }
}
