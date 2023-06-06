import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		LinkedList<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
		
			switch (st) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				queue.add(x);
				
				break;

			default:
				break;
			}
			
		}
		
		
	}
}
