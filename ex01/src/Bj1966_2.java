import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Bj1966_2 {
	static int t;
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			LinkedList<int[]> q = new LinkedList<>();
			
			for (int j = 0; st.hasMoreTokens(); j++) {
				q.add(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			int cnt = 0;
				while (!q.isEmpty()) {
					int[] temp = q.poll();
					boolean chk = true;
					
					// 우선순위가 큰 값이 있으면 넘기기
					for (int j = 0; j < q.size(); j++) {
						if (temp[1] < q.get(j)[i]) {
							q.add(temp);
							
							for (int k = 0; k < j; k++) {
								q.add(q.poll());
								
								chk = false;
								break;
							}
						}
						//만약 front가 가장 큰 값이 아니라면 다시 반복
						if (chk == false) 
							continue;
						
						//만약 제일 큰 값이라면 count +
						cnt++;
						// 만약 값이 원하는 값이라면 멈추고 저장
						if(temp[0] == m)
							break;
					}
					sb.append(cnt).append("\n");
				}
				System.out.println(sb);
			
		}
	}
}
