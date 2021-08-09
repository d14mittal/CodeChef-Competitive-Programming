import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
public class ThreeDice{
	public static void main (String[] args) 
	{
		// your code goes here
		try{
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    int x=sc.nextInt();
		        int y=sc.nextInt();
		        int sub=(6-x-y);
				// float probab=sub/6.0;
				if(sub<=0){
				    System.out.println("0");
				}
				else{
				    System.out.println(String.format("%.6f",sub/6.0));
				}
		}
		catch(Exception e){
		    return;
		}
		
	}
}
