package sec06.ch07;

public abstract class Animal { // 추상메소드가 있는 클래스를 '추상클래스'라 한다.
	// 추상 클래스는 '인스턴스'를 만들 수 없다.
	// 추상 메소드가 없어도 객체화 하기 싫으면 추상클래스로 만들 수 있다.
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void breath() {
		System.out.println("숨쉰다.");
	}

	abstract void howling(); // 선언부만 있고 구현부가 없는 메소드를 '추상메소드'라 한다.
}

class Cat extends Animal { // 추상클래스를 상속받을 경우 추상메소드를 무조건 오버라이딩 해줘야 한다.

	@Override
	void howling() {
		System.out.println("야옹~ 야옹~");
	}
	
}

class Dog extends Animal {

	@Override
	void howling() {
		System.out.println("멍멍");
	}
	
}

class Hamster extends Animal {

	@Override
	void howling() {
		System.out.println("찍 ! 찍 !");
	}
	
	void runRail() {
		System.out.println("쳇바퀴를 구른다.");
	}
	
}