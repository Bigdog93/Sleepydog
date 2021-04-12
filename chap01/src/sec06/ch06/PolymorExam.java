package sec06.ch06;
/*
메소드 기준으로
	1. 부모타입의 변수는 자식객체 가리킬 수 있다. | 부모타입 -> 자식타입 O
	2. 자식타입의 변수는 부모객체 가리킬 수 없다. | 자식타입 -> 부모타입 X
	3. 타입이 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다.
 */
public class PolymorExam {
	public static void main(String[] args) {
		Animal ani_1 = new KoShort(); // 1.	부모타입은 자식타입'객체'를 참조할 수 O
//		Cat cat1 = new Animal(); // 2. 자식타입은 부모타입'객체'를 참조할 수 X
		// 자식타입이 부모타입 객체를 참조하려하면 없는 정보가 있기 때문에 참조할 수 없다.
//		Cat cat = ani_1; // ani_1 이 Animal 객체를 가리키고 있을까봐 에러 터뜨림
		Cat cat = (Cat)ani_1; // 이렇게 형변환을 시켜줘야 컴파일러가 안심한다. | 애초에 ani_1은 자식타입객체를 참조하고 있기 때문에 타입 변환 가능하다.
//		Cat cat1 = (Cat)new Animal(); // 부모타입 '객체'를 자식타입으로 형변환 할 수는 없다.
		Animal ani_2 = cat; // 객체는 아직까지 하나뿐. 하나의 객체를 가리키는 참조변수가 3개. (Animal타입 2개, Cat타입 1개)
		
		ani_1.howling(); // 객체는 Cat()이지만 참조변수의 타입이 Animal이기 때문에 Animal에 있는 메소드만 쓸 수 있다.
		// 기준은 객체이기 때문에 Cat()에 오버라이딩 된 howling()이 실행된다.
		cat.howling(); // 다시한번, '기준은 객체'이기 때문에 객체가 Cat() 하나뿐인 지금 결과는 같다.
//		ani_1.lick(); // 안된다.
		cat.lick(); // 된다.
		
		System.out.println("끝");
	}
}
