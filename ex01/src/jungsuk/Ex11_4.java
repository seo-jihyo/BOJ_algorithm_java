package jungsuk;
import java.sql.Savepoint;
import java.util.*;
public class Ex11_4 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; //Queue에 최대 5개까지만 저장되도록 한다.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) { //무한반복문
			System.out.println(">>");
			try {
				// 화면으로부터 라인 단위로 입력받는다
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue;  //입력받은 내용이 없으면 continue
				
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여 줍니다.");
					System.out.println(" q 또는 Q -  프로그램을 종료합니다.");
					System.out.println(" history -  최근에 입려간 명령어를 " + MAX_SIZE + " 개 보여 줍니다.");
					 
				} else if (input.equalsIgnoreCase("history")) {
					save(input); //입력받은 명령어를 저장하고,
					
					//LinkedList의 내용을 보여 준다.
					LinkedList list = (LinkedList)q;
					
					for (int i = 0; i < list.size(); i++) 
						System.out.println((i+1)+"."+list.get(i));
					} else {
						save(input);
						System.out.println(input);
					} // if(input.equalsIgnoreCase("q")){
			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} //while(true)
	} //main

	private static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input)); //if(input !=null && !input.equals(""))
		q.offer(input);
		
		//queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (q.size() > MAX_SIZE) //size()는 Collection 인터페이스에 정의
			q.remove();
		}
} // end of class
