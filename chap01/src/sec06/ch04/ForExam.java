package sec06.ch04;

public class ForExam {
	public static void main(String[] args) {
		// 초기화, 어디까지 반복할지(true인 한 계속해서 반복), 증감식
		for(int i = 0; i < 100000; i++) {
			System.out.println("i : " + (i % 10));
		}
		/* for( A ; B ; D ) {
			C
		 }
		 A -> B -> C -> D
		  -> B -> C -> D ... D -> B(false면 끝)
		*/
		int o = 0;
		for(;;) { 
			o++;
			if(o % 1254810951 == 0) System.out.println(o);
		} // 무한루프
	}
}
