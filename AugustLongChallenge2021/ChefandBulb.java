/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefandBulb
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) 
	{
		// your code goes here
		FastReader sc=new FastReader();
		int t=sc.nextInt();
		
		while(t!=0){
		    int n=sc.nextInt();
		    int p=sc.nextInt();
		    int k=sc.nextInt();
		    int count=0;

		    // int i=0;
		    // while(i<n){
		    //     int j=i;
		    //     while(j<n){
		    //         if(j==p){
		    //             count++;
		    //             break;
		    //         }
		    //         else{
		    //             count++;
		    //         }
            //         j=j+k;
		    //     }
		    //     if(j==p){
		    //         break;
		    //     }
            //     else{
            //         i++;
            //     }

            if(p==k){
                count=2;
            }
            else if(p<k){
                count=p*2+1;
            }
            else{
                count=(p-k+1)*2;
            }
            System.out.println(count);
		    t--;

		}
		    
	}
		
}

