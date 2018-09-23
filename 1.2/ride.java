/*
ID: patmatt1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

import javafx.animation.StrokeTransition;

class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

        String n = f.readLine();
        String n1 = f.readLine();

        int product = 1;
        int product1 = 1;

        for (int i = 0; i < n.length(); i++) {
            char elem = n.charAt(i);
            //System.out.println(elem - 'A' + 1);

            product *= elem - 'A' + 1;
        }
      //  System.out.println("UFO: " + product);


        for (int i = 0; i < n1.length(); i++) {
            char elem1 = n1.charAt(i);
            //System.out.println(elem1 - 'A' + 1);

            product1 *= elem1 - 'A' + 1;
        }
          //  System.out.println("GROUP: " + product1);

            int p = product%47;
            int p1 = product1%47;
          //  System.out.println("P MOD: " + p);
          //  System.out.println("P1 MOD: " + p1);
        if (p == p1) {

            out.println("GO");
          //  System.out.println("GO");
        }
        else {
          out.println("STAY");
          // System.out.println("STAY");
        }
        out.close();

    }
}