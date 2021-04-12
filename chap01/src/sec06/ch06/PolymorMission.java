package sec06.ch06;


public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Animal hamster = new Hamster(); // Animal 타입 변수라면
//		hamster.runRail(); // 햄스터 클래스만의 메소드 실행 불가.
		// 앞뒤가 다르면 무조건 상속관계. 앞의 타입이 부모.
		Hamster realHam = (Hamster) hamster; // 형변환 해주면
		realHam.runRail(); // 개꿀		
		((Hamster) hamster).runRail(); // 이렇게도 되는고만!!?ㅣ>!?!?!
		
		System.out.println(hamster instanceof Hamster); // 부모타입 변수로 어떤 자식타입을 가르키는지 알 수 있음
		// 즉, 이게 true면 형변환 가능
//		System.out.println(pig instanceof Hamster); Pig와 Hamster는 관계없기때문에 에러
		
		cry(cat);
		cry(pig);
		cry(hamster);
	}
	
	static void cry(Animal ani) { // 최대한 조상 타입을 받는게 유연하게 만들 수 있다.
		if(ani instanceof Hamster) {
			((Hamster) ani).runRail();
		}else ani.howling();
	}
	/*	다형성 개념이 없다면.... 자식클래스 개수만큼 오버라이딩 해줘야행..ㄷㄷ
	static void cry(Cat cat) {
		cat.howling();
	}
	static void cry(Pig pig) {
		pig.howling();
	}
	static void cry(Hamster hamster) {
		hamster.howling();
	}
	*/
}


class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍 ! 찍 !");
	}
	
	void runRail() {
		System.out.println("쳇바퀴를 굴린댜 찍 !");
	}
}