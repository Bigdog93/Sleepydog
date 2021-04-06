package sec06.ch06; // 이 클래스의 소속
/*
 패키지명 규칙
 	실무에선 보통 . 두개정도 들어간다.
 	웹에서 도메인 이름.com 일 경우,
 	패키지 : com.도메인이름.프로젝트명.model....클래스명
 	패키지명에선 소문자만 가능
 	
 프로토타입 - 자바스크립트, ?
 클래스타입 - 그외 모든 언어
 */
public class InstanceExam { // 이 클래스의 이름 = 자바파일 이름. 풀네임 : sec06.ch06.InstanceExam
	public static void main(String[] args) {
		Dog dog = new Dog();
		/*
		 new - 객체화 시켜주는 애. 동적 객체화
		 	메모리를 할당, Dog() 객체(Dog의 정보들)를 저장, 그 주소값을 왼쪽으로 전달.
		 	메모리에 올림으로서 실체화. 메모리에 안올리면 아무것도 없는 문서일 뿐.
		 */
		new Dog(); // 이렇케만 해도 객체화는 된거임. 근데 1회성. 만들자마자 소멸함.
		
		Integer num = new Integer(10);
		
//		Dog dddd = num;  // Dog 타입 객체는 Dog 객체만 들어갈(참조할) 수 있다. 신뢰성.
		
		dog.name = "뽀삐";
		
		Dog dog2 = new Dog();
		
		dog2.name = "돌쇠";
		
		dog.bark();
		dog2.bark();
		
		
		
	}
}

/* 
 멤버 필드 - 값을 저장할 수 있는 것(명사 담당)
 멤버 메소드 - 값을 수정할 수 있는 것(동사 담당)
 */
class Dog {
	String name;
	String jong;
	int age;
	
	Dog() {
		System.out.println("강아지 소환");
	}
	
	void bark() {
		String name = this.name;
		System.out.printf("%s가 멍멍\n", name);
	}
}