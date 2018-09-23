/*
ID: patmatt1
LANG: JAVA
TASK: io2
*/
import java.io.*;
import java.util.*;

class io2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("io2.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("io2.out")));

        int n = Integer.parseInt(f.readLine());

        StringTokenizer st = new StringTokenizer(f.readLine());
        
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());

        }
        out.println(sum);
        System.out.println(sum);
        out.close();
        }

    }