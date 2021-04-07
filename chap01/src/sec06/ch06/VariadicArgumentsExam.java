package sec06.ch06;
// 가변인자
public class VariadicArgumentsExam {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		
		System.out.println(cal.sum(1,2,3,4,5,65,6,324,52,34,256,23,434,0));
		System.out.println(cal.sum(new int[] {1, 2, 3, 4}));
		
	}
}

class Calc2 {
//	int sum(int[] vals) 랑 오버로딩 안됨.. 가변인자가 단순 배열로도 받아줌
	int sum(int...vals) { // (String a, int b, char c, int...arr) 이런식으로 가변인자랑 일반매개변수랑 섞어 쓸 수 있다.
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}