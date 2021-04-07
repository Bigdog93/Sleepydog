package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human hum = new Human();
		Human hum1 = new Human();
		
		hum.setAge(12);
		hum.setName("홍길동");
		hum1.setAge(20);
		hum1.setName("신사임당");
		
		System.out.printf("My name is %s, and I'm %d years old\n", hum.getName(), hum.getAge());
		System.out.printf("My name is %s, and I'm %d years old\n", hum1.getName(), hum1.getAge());
		
		hum.whoAmI();
		hum1.whoAmI();
		
	}
}

class Human {
	private int age;
	private String name;
	
	Human() {
		this("미상");
	}
	Human(String name) {
		this(name, 10);
	}
	Human(int age) {
		this("미상", age);
	}
	Human(String name, int age) { // 얘로 다 모으면 퍼포먼스는 손해를 보지만 관리가 쉽다.
		this.name = name;
		this.age = age;
	}
	
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
	void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", this.name, this.age);
	}
	

	
	
}