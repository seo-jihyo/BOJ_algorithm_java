package jungsuk;

import java.util.*;


public class Ex11_2 {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList();  //Queue 인터페이스의 구현체인 LinkedList
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while (!st.empty()) {  			 // Stack이 비었는지 확인하면서, 비어있지 않으면
			System.out.print(st.pop());  //스택에서 pop으로 요소 하나를 꺼내서 출력
			
		}
		
		System.out.println("\n= Queue =");
		while (!q.isEmpty()) {           // Queue가 비었는지 확인, 비어있지 않으면
			System.out.print(q.poll());  // 큐에서 poll로 요소 하나를 꺼내서 출력
		}
	}
}
