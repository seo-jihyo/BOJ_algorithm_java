package jungsuk;

import java.util.EmptyStackException;
import java.util.Stack;

public class EX11_3 {
	public static void main(String[] args) {
//		if (args.length != 1) {
//			System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
//			System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
//			System.exit(0);
//		}
// 		수식을 입력받아서 괄호 검사
		
		Stack st = new Stack();
//		String expression = args[0];
		String expression = "((3+5)*8-2)";  // 그냥 바로 넣어도 됨
		
		
		System.out.println("expression:" + expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch =='(') {
					st.push(ch + "");   // 여는 괄호는 stack에 넣고 
				} else if (ch == ')') {
					st.pop();			// 닫는 괄호는 stack에서 꺼냄
				}
			}
			if (st.isEmpty()) {			// 그래서 stack이 비어있으면 괄호가 일치
				System.out.println("괄호가 일치합니다.");
			}else {						// else면 불일치
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) { // 예외. 예를 들어 식이 ((3+5)*8-2)))) 이럴 경우 pop할 )괄호가 없음
			System.out.println("괄호가 일치하지 않습니다.22");  // 그럴 경우 예외가 발생한다.
			//
		} //try end
	}
}
