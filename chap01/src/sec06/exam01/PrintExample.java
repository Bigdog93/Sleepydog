package sec06.exam01;

public class PrintExample {

	public static void main(String[] args) {
//		콘솔에 찍을 수 있는 세가지 방법
		System.out.println("하하");
		System.out.println("호호");
		System.out.println("sysout에 ctrl + space 하면 자동완성꿀잼");
		System.out.println();
		System.out.print("하하");
		System.out.print("호호");
		System.out.print("후후");
		System.out.println(); // 개행 (엔터키) System.out.print("하하\n");
		System.out.print("하하\n");
		System.out.print("호호\n");
		System.out.print("후후\n");
		
		char bloodType = 'O';
		int age = 10;
		float weight = 30.4f;
		String name = "홍길동";
		
		System.out.println("제 이름은 "+name+"이며, 나이는 "+age+"살이고, 혈액형은 "+bloodType+"형 이고, 몸무게는 "+weight+"kg입니다.");
		
		System.out.printf("제 이름은 %s이며, 나이는 %03d살이고, 혈액형은 %c형 이고, 몸무게는 %1.2fkg 입니다.\n", 
				name, age, bloodType, weight);
//		d 앞에 숫자는 몇칸을 차지할지
//		%s는 만능
		
		char ch = 'c';
		System.out.printf("%d : %c", (int)ch, ch);
		
	}

}
