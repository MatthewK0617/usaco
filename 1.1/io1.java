
/*
ID: patmatt1
LANG: JAVA
TASK: io1
*/
import java.io.*;
import java.util.*;

class io1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("io1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("io1.out")));

        int n = Integer.parseInt(f.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(f.readLine());

            out.println(sum);
            out.close();
        }
        System.out.println(sum);
    }
}