package sec06.exam01;

// 원시타입 vs 참조타입(Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args) {
//		총 8개 (이거 빼고는 다 참조타입)
//		 정수형 4개	byte
//			 byte	1
//			 short	2
//			 int	4
//			 long	8
//		 실수형 2개
//			 float	4
//			 double	8
//		 문자형 1개
//		 	 char
//		 불리안형 1개
//		 	 boolean
//		 
//		 원시타입은 리터럴 값을 저장한다.
//		
//		 크기 순 : byte < short < int < long < float < double
//		큰쪽으로 갈때는 자동 형변환이 되지만, 작은쪽으로는 자동형변환이 안된다. 
		byte var1 = 127;
		short var2 = 2_355; // 숫자형 값에서 _는 무시. 쉼표대신 가독성 상승
		var1 = (byte)var2; //범위를 넘어가면 overflow, underflow가 발생, 한바퀴 돌아간다.
		System.out.println("var1 : " + var1);
		// String 과 +로 만나면 어떤 타입이던(원시던 참조던) String 타입으로 바뀐다.
		
		for(int i = 0; i < 257; i++) {
			byte b = (byte)i;
			System.out.println(b);
		}
		
	}
}
