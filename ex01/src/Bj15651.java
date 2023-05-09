import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백트래킹 재귀함수 안에서 for 돌면서 숫자 선택 (이때 방문 여부 확인)
 * 재귀함수에서 M개를 선택할 경우 print
 * 시간복잡도 N! > 가능
 */
public class Bj15651 {

	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);
		System.out.println(sb);

	}

	public static void dfs(int N, int M, int depth) {

		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}
