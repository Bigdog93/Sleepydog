package sec06.ch06;

import java.util.Arrays;

// primitive 타입과 reference 타입의 큰 차이점

public class InstanceExam3 {
	public static void main(String[] args) {
		int mainNum = 10; // 지역변수
		
		Box box = new Box(); // 참조변수의 크기 = 8byte (32bit 운영체제에서는 4byte)
		Box box2 = new Box();
		box.num = 10; // 멤버변수(인스턴스변수)
		
		changeNum(mainNum);
		changeBoxNum(box);
		
		System.out.println("mainNum : " + mainNum);
		System.out.println("box.num : " + box.num);
		
		int[] arr = {1, 2, 3};
		
		changeArr(arr);
		System.out.println(Arrays.toString(arr));
		
		String str = new String("하하");
		changeArrstr(str);
		System.out.println(str);
		
		String str2 = str;
		str = "야야";
		System.out.println(str2);
		
	}
	
	private static void changeNum(int num) { // 얘랑, mainNum은 전혀 다른 애. 걍 숫자(리터럴값)이 넘어온거임
		num = 20; // 얘 바꿔봤자 mainNum에 영향 X
	}
	private static void changeBoxNum(Box box) { // 얘도 위에 Box box랑 다른애긴 한데, 주소값이 넘어온거기 때문에 같은 곳을 가르킴
		box.num = 20; // 그래서 얘를 바꾸면, 위에 box에도 영향이 가는것.
	}
	private static void changeArr(int[] arr) {
		arr[0] = 20;
	}
	private static void changeArrstr(String str) {
		str = "이놈자식";
	}
}

class Box {
	static int num0;
	int num;
}