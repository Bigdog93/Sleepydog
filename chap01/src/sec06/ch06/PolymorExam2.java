package sec06.ch06;

public class PolymorExam2 {
/*
 1. 부모타입은 자식객체 주소값을 참조할 수 있다. (가리킬 수 있다.)
 2. 자식타입은 부모객체 주소값을 참조할 수 없다.
 */
	public static void main(String[] args) {
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
//		Pig pig = new Hamster(); // 형제는 남이다.
//		Pig pig = new Animal(); // 자식이 부모를 가리킬 수 없다.
		
		
		System.out.println("끝");
	}
}
