
    /*
ID: patmatt1
LANG: JAVA
TASK: gift2
*/
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.io.PrintWriter;

class gift2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift2.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift2.out")));

        int n = Integer.parseInt(f.readLine());
        ArrayList <String> people = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String person = f.readLine();
            people.add(person);

        }

        HashMap <String, Integer> giving = new HashMap <String, Integer>();

        HashMap <String, Integer> receiving = new HashMap <String, Integer>();

        for (String person : people) {
            receiving.put(person, 0);
        }

        for (int i = 0; i < n; i++) {
            String givername = f.readLine();
            StringTokenizer st = new StringTokenizer(f.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int recipients = Integer.parseInt(st.nextToken());

            int givingamount = 0;
            if (recipients > 0) {
                givingamount = amount/recipients;
                receiving.put (givername, amount%recipients);
            }
            giving.put (givername, amount);
    
            
            for (int j = 0; j < recipients; j++) {
                String recipientsname = f.readLine();
                receiving.put (recipientsname, receiving.get(recipientsname) + givingamount);
        }

        }
        for (String person : people) {
            out.println(person + (receiving.get(person) - giving.get(person)));
        }
        out.close();
    }
}  