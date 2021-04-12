package sec06.ch07;
/*
 1. 부모타입은 자식 객체 가리킬 수 있다.(참조, 저장 등등)
 2. 자식타입은 부모 객체 가리킬 수 없다.
 3. 변수타입이 알고 있는 메소드만 호출할 수 있다. 호출 됐을 경우 실행되는 기준은 가리키는 객체.
 */
public class PolymorExam3 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus(); // 1.
		Car car3 = new LocalBus(); // 손자도 문제없음
		
//		Bus bus1 = new Car(); // 2. 자식타입은 부모타입 가리킬 수 없다.
//		Bus bus1 = (Bus)new Car(); // 컴파일에러는 안뜨나 런타임 에러가 떠버린다. 부모타입 가리키는건 생각도 말자.
//		bus1.openDoor();
		
		Bus bus1 = (Bus)car2;
		bus1.hoot();
		
		Car carP = bus1;
		carP.hoot();
		
		System.out.println("---------------------------------------");
		Car carP4 = new LocalBus();
		Bus bus2 = (Bus)carP4;
		LocalBus lb = (LocalBus)bus2;
		lb.hoot();
		
		
		
		System.out.println("끝");
	}
}
