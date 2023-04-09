package jungsuk;
class Tv{
	boolean power; 	//전원 상태 (on/off)
	int channel;	// 채널
	
	void power()		 { power = !power; }
	void channelUp() 	 { ++channel; }
	void channelDown()	 { --channel; }
}
// 부모 멤버 총 5개


class SmartTv extends Tv {   			//SmartTv는 Tv에 캡션 (자막)을 보여주는 기능을
	boolean caption;				 	//캡션 상태 (on/off)
	void displayCaption(String text) {
			if (caption) {				//캡션 상태가 on(true)일 때만 text를 보여준다.
				System.out.println(text);
			}
	}
}
// 자식 멤버 총 2개 --> 멤버는 총 7개이다.


public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;			// 조상 클래스로부터 상속받은 멤버	
		stv.channelUp();			// 조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;		//캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World");
	}
}
