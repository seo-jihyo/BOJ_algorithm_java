package jungsuk;

import java.util.HashMap;

public class Ex12_2 {
	public static void main(String[] args) {
		HashMap<String, Studnet> map =  new HashMap<>();   //JDK1.7부터 생성자에 타입 지정 생략 가능
		map.put("서지효", new Studnet("서지효",1,1,100,100,100));
		
//		Studnet s = (Student)map.get("서지효"); 전에는 형변환이 필요했지만 지금은 불필요하다
		Studnet s = map.get("서지효");
		
		System.out.println(map);
	}
}

class Studnet{
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Studnet(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}