import java.util.*;
public class passingmark{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int amin=sc.nextInt();
		    int bmin=sc.nextInt();
		    int cmin=sc.nextInt();
		    int tmin=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
            int sum=a+b+c;
		    if(a>=amin && b>=bmin && c>=cmin && sum>=tmin){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    t--;
		}
    }
}