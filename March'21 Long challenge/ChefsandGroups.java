import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefsandGroups {
    /* package codechef; // don't place package name! */
/* Name of the class has to be "Main" only if the class is public. */
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        sc.nextLine();
		while(t!=0){
		    String s=sc.nextLine();
            char a[]=s.toCharArray();
		    int count=0;
		    if(a[0]=='1'){
		        count++;
		    }
		    for(int i=1;i<a.length;i++){
		        if(a[i]=='1' && a[i]!=a[i-1]){
		            count++;
		        }
		    }
		    System.out.println(count);
		    t--;
		}
		    
	}
}
