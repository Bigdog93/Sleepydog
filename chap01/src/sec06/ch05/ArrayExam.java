package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		// 배열 : 같은 타입의 변수를 여러개 사용하기 편하기 위해 쓰는 것
		
		int[] intArr = new int[10];
		
		intArr[0] = 11;
		intArr[1] = 12;
		intArr[2] = 13;
		intArr[3] = intArr[1] + 4;
		// 배열 각 요소의 초기값을 설정 안했을 경우 : 초기값은 숫자형- 0, 불리안형- false , 참조형- null
		// 변수를 크게 2가지로 하면(원시형 Primitive Type, 참조형 Reference Type)
		
		int len = 1000;
		String[] strArr = new String[len];
		
		System.out.println(intArr);
		System.out.println(strArr);
		
		int[] intArr2 = {1, 2, 3};
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("intArr2[%d] = %d\n", i,intArr2[i]);
		}
		
		
	}
}
