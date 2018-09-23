/*
ID: patmatt1
LANG: JAVA
TASK: io4
*/
import java.io.*;
import java.util.*;

import com.sun.javafx.geom.AreaOp.AddOp;

class io4 {
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("io4.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("io4.out")));

    int n = Integer.parseInt(f.readLine());

    int[] ar = new int[n];

    StringTokenizer st = new StringTokenizer(f.readLine());

    for (int i = 0; i < n; i++) {
        ar[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(ar);
    System.out.println(Arrays.toString(ar));
    
    out.close();
  }
}
