/*
ID: patmatt1
LANG: JAVA
TASK: marathon1
*/
import java.io.*;
import java.util.*;



class marathon1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("marathon1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("marathon1.out")));

        int n = Integer.parseInt(f.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int totaldistance = 0;
        for (int i = 1; i < n; i++) {
            totaldistance += Math.abs(x[i] - x[i-1]) + Math.abs(y[i]-y[i-1]);
        }
        int lskip = 0;
        int noskipdistance = 0;
        int skipdistance = 0;


    for (int i = 1; i < n-1; i++) {
        noskipdistance += Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]) + Math.abs(x[i] - x[i-1]) + Math.abs(y[i] = y[i-1]);
        skipdistance += Math.abs(x[i+1] - x[i-1]) + Math.abs(y[i+1] - y[i-1]);
        lskip = Math.max(lskip, noskipdistance - skipdistance);
        }
        System.out.println(lskip);
        out.println(totaldistance - lskip);
        out.close();
    }
}