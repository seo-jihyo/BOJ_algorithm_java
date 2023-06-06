import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj28061 {
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         int N = Integer.parseInt(br.readLine());
         
         int maxLemons = 0;
         int bag = 0;

         StringTokenizer st = new StringTokenizer(br.readLine());
       
         for (int i = 0; i < N; i++) {
             int treeLemons = Integer.parseInt(st.nextToken());
             
             if (i == 0) {
                 maxLemons = Math.min(maxLemons, treeLemons);
             } else {
                 maxLemons = Math.max(maxLemons, treeLemons);
             }

             if (i != N - 1) {
                 bag = Math.max(bag, treeLemons - 1);
             }
         }

         System.out.println(maxLemons);
     }
 }