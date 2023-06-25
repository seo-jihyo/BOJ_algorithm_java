import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Ysum = 0, Msum = 0;
		
		for (int i = 0; i < N; i++) {
			int time = Integer.parseInt(st.nextToken());
			int Y, M;
			
			//영식 요금제
			Y = time/30 + 1;
			Ysum += Y * 10;
			
			//민식 요금제
			M = time / 60 + 1;
			Msum += M * 15;
		}
		
		if (Ysum == Msum) {
			System.out.println("Y M " + Ysum);
		} else if (Ysum > Msum) {
			System.out.println("M " + Msum);
		} else {
			System.out.println("Y " + Ysum);
		}
	}
}
