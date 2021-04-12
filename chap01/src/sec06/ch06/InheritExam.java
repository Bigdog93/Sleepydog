package sec06.ch06;

public class InheritExam {
	public static void main(String[] args) {
//		Cat kitty = new Cat();
		
		
		KoShort kitty = new KoShort();
		kitty.howling();
		kitty.lick();
		
		Cat kit = new Cat();
		kit.howling();
		
		
		
	}
}
/*
 KoShort 객체를 생성하게 되면 --
 	KoShort 생성자가 Stack에 올라간다.
 	KoShort 생성자가 Cat 생성자를 호출(super()), KoShort 생성자 위에 Cat 생성자가 올라간다.
 	Cat 생성자가 다시 Animal 생성자를 호출, Cat 생성자 위에 올라간다.(Object까지 간다.)
 	맨 위에 생성자부터 할일을 끝내고 '}'를 만나 끝이나면 스택에서 'pop' 되어 나간다.
 	실행순서는 Object() -> Animal() -> Cat() -> KoShort() 이다. (즉, 상위 모든 클래스는 같이 객체화 된다.)
 */

/*
 오버로딩(Overloading)과 오버라이딩(Overriding)
 오버로딩 - 같은 클래스 내에서 다른 매개변수를 받는 같은 이름의 메소드
 오버라이딩 - 상속받은 메소드를 재정의 해주는 것
 */

class Animal /* extends Object */ { // Object 클래스는 모든 클래스의 최상위 클래스 // 메모리에 올라갈땐 Object 먼저. 다음 Animal -> Cat 등 하위로 내려간다.
	String name;
	int age; // 변수선언, 생성자 언언, 메소드 선언.
	Animal() { // class가 default면 변수나 메소드가 public 붙어도 의미가 없다. 
		super(); // Object 클래스 생성자
		System.out.println("Animel 생성자");
	}
	Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void howling() {
		System.out.println("운다");
	}
}

class Cat extends Animal {
	Cat() {
//		super(); // 생략하면 자식 클래스에서는 부모클래스의 기본 생성자 까지 자동으로 만들어 준다. // super()는 생성자 구현부의 가장 위(가장 먼저)에 있어야한다.(생략하면 컴파일러가 알아서 젤 위에 만들어 줌)
		System.out.println("Cat 생성자");
	}// super 는 내 바로 위의 부모의~ 라는 뜻
	Cat(String name, int age) {
		super(name, age);
	}
	@Override // 얘 적고 밑에 다른 메소드 적으면 오류 표시해준다. @~ 는 어노테이션 이라 부른다.
	void howling() {
		System.out.println("야옹");
	}
	void lick() {
		System.out.printf("%s가 핥다.\n", name);
	}
}

class KoShort extends Cat {
	KoShort() {
		System.out.println("KoShort 생성자");
	}
	
	KoShort(String name, int age) {
		super(name, age);
	}

	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}