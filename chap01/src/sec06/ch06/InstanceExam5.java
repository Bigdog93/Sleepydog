package sec06.ch06;

public class InstanceExam5 {
	public static void main(String[] args) {
		Car[] carArr = new Car[5]; // 레퍼런스 타입 배열을 선언만 하면 각 칸은 다 null값이다.
		Car mycar = createCar();
		
		carArr[2] = new Car();
		
		carArr[2].name = "값";
		
		System.out.println(carArr[2].name);
		
		carArr[2].name = "소나타";
		System.out.println(carArr[2].name);
	}
	
	static Car createCar() {
		return new Car();
	}
}
