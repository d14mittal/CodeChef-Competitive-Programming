/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IdandShip {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        // your code goes here
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t != 0) {
            char ch = sc.next().charAt(0);
            if (ch == 'B' || ch == 'b') {
                System.out.println("BattleShip");
            } else if (ch == 'C' || ch == 'c') {
                System.out.println("Cruiser");
            } else if (ch == 'D' || ch == 'd') {
                System.out.println("Destroyer");
            } else if (ch == 'F' || ch == 'f') {
                System.out.println("Frigate");
            }
            t--;
        }
    }
}
