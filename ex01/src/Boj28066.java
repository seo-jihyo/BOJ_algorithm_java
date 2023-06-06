import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj28066 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //잘라서 저장
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		LinkedList<Integer> queue = new LinkedList<>(); 
	
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); 
		
		for(int i = 1; i < N+1; i++){
			queue.add(i);
		}
		while(!queue.isEmpty()){ 
			queue.add(queue.poll());
			for(int i = 0; i < K - 1; i++) { 
				if(queue.size() == 1) break;
				queue.remove();
			}
			if(queue.size() < K){
				System.out.println(queue.peek());
				break;
			}
			if(queue.size()==1){ 
				System.out.println(queue.poll());
				break;
			}
		} //while end
	}// main end
}