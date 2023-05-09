import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Bj1764_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		ArrayList<String> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
		set.add(br.readLine());
		
		}
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
		
		}
	System.out.println(sb);
	}
}
