/*
ID: patmatt1
LANG: JAVA
TASK: marathon
*/
import java.io.*;
import java.util.*;



class marathon {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("marathon.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("marathon.out")));

        int n = Integer.parseInt(f.readLine());
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int totalDistance = 0;
        for (int i = 1; i < n; i++) {
        totalDistance += Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
        }

        System.out.println("totaldistance " + totalDistance);

         int lSkip = 0;

         int noSkipDistance = 0;
         int skipDistance = 0;
         for(int i = 1; i < n-1; i++) {
             noSkipDistance = Math.abs(x[i+1] - x[i]) + Math.abs(x[i] - x[i-1]) + Math.abs(y[i+1] - y[i]) + Math.abs(y[i] - y[i-1]);
             skipDistance = Math.abs(x[i+1] - x[i-1]) + Math.abs(y[i+1] - y[i-1]);
             lSkip = Math.max(lSkip, noSkipDistance - skipDistance);
     }
        System.out.println("noskipdistance " + noSkipDistance);
        System.out.println("skipdistance " + skipDistance);
        System.out.println("skipped " + lSkip);
    out.println(totalDistance - lSkip);
    out.close();
     }
 }