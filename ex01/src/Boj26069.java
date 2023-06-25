import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> dance = new HashSet<>();
        dance.add("ChongChong");

        for (int i = 1; i <= n; i++) {
            String[] input = br.readLine().trim().split(" ");
            String a = input[0];
            String b = input[1];

            if (dance.contains(a)) {
                dance.add(b);
            }
            else if (dance.contains(b)) {
                dance.add(a);
            }
        }

        System.out.println(dance.size());
    }
}
