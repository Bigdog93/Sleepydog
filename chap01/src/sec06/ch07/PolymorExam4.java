package sec06.ch07;
/*
 intstanceof 는 상속관계일때 사용하는기능
 
 Car - Bus - LocalBus
 	- Truck
 */
public class PolymorExam4 {
	public static void main(String[] args) {
		
//		 Bus bus = new Truck();
		
		Car car1 = new Bus();
		
		System.out.println(car1 instanceof Car);
		System.out.println(car1 instanceof LocalBus); // Car 타입 변수 LocalBus타입으로 형변환 되니?
		System.out.println(car1 instanceof Bus);	// Car 타입 변수는 Bus클래스의 인스턴스라고 할 수 있니?
		System.out.println(car1 instanceof Truck);	// car1이 가리키는 객체는 Truck클래스의 인스턴스라고 할 수 있니?
		System.out.println(car1 instanceof Object);	// car1이 가리키는 객체는 Object클래스의 인스턴스라고 할 수 있니? 이게 맞다
		
//		LocalBus lb1 = (LocalBus)car1;
//		Bus bus = (Bus)car1; // Bus타입으로 가리킬 수 있는것 -> Bus, LocalBus
////		Truck truck = (Truck)car1; // 런타임 에러 // 트럭타입으로 받을 수 있는것 -> Truck
//		Object obj = car1; // Object 타입으로는 다 받을 수 있음
		
		
		Car car2 = new Bus();
//		LocalBus lb2 = (LocalBus)car2; // 런타입 에러
		
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus); //
		
	}
}
