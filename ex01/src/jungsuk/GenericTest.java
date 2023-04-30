package jungsuk;

import java.util.ArrayList;

class Tv1 {}
class Audio {}

public class GenericTest {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList<Tv1> list = new ArrayList<>();  //Tv타입 객체만 저장 가능
		list.add(new Tv1());
		
//		Tv t = (Tv)list.get(0);  리스트의 첫번째 요소를 꺼낸다.
		Tv1 t = list.get(0);   // 리스트의 첫번째 요소를 꺼낸다.
		
	}
}
