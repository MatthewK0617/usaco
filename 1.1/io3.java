/*
ID: patmatt1
LANG: JAVA
TASK: io3
*/
import java.io.*;
import java.util.*;

class io3 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("io3.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("io3.out")));

        StringTokenizer st = new StringTokenizer(f.readLine());

        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int sum = 0;

        for (int j = 0; j < c; j++) {
            st = new StringTokenizer(f.readLine());
            for (int i = 0; i < r; i++) {
                int num = Integer.parseInt(st.nextToken());
                sum += num;
            }
        }
        

        System.out.println(sum);
        out.println(sum);
        out.close();
        }

    }