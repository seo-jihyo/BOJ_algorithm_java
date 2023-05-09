package jungsuk;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {return "Fruit";}
}
class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy                 { public String toString() {return "Toy";}}
 
interface Eatable{}

class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy>   toyBox   = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}  // main의 끝
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();   // Item을 저장할 list
	void add(T item)  { list.add(item); }     // 박스에 item을 추가
	T get(int i)      { return list.get(i); } // 박스에서 item을 꺼낼 때
	int size() { return list.size(); }
	public String toString() { return list.toString();}
}