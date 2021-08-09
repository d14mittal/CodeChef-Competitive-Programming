// import java.math.*;
import java.util.*;
public class RacingHorses {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int i,j;
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int mindiff=Math.abs(a[0]-a[1]);
            for(i=0;i<n-1;i++){
                for(j=i+1;j<n;j++)
                {
                    if(Math.abs(a[i]-a[j])<mindiff)
                    {
                        mindiff=Math.abs(a[i]-a[j]);
                    }
                }
           }
           System.out.println(mindiff);
           t--;
        }
    }
    
}
