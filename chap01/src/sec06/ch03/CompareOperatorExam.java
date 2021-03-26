package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 < num2);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("--------------------");
		
		char ch1 = 'A'; // 65
		char ch2 = 'a'; // 97
		boolean result5 = ch1 < ch2;
		System.out.println("result5 = " + result5);
		
		System.out.println("3.2 == 3.2f : " + (3.2 == 3.2f));
		System.out.println("(float)3.2d == 3.2f : " + ((float)3.2d == 3.2f));
		System.out.println(Double.compare(3.21,  3.21f));
		
		// <, >, <=, >=, ==, != : 원시형 숫자타입(include char)만 사용가능
		
		String str1 = new String("A");
		String str2 = "A";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
	}
}
