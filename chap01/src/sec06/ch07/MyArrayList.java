package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] arr; // 전역변수는 알아서 초기화 된다. 참조변수의 경우 null 로 초기화
	
	MyArrayList() {
		arr = new int[0];
	}
	@Override
	public void add(int value) {
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length ; i++) {
			newArr[i] = arr[i];
		}
		newArr[arr.length] = value;
		arr = newArr;
	}
	
	@Override
	public void add(int index, int value) {
// --------------쌍 for문--------------------------------
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		newArr[index] = value;
		for(int i = index ; i < arr.length; i++ ) {
			newArr[i + 1] = arr[i];
		}
		arr = newArr;
// --------------for문 하나로------------------------------
//		int[] newArr = new int[arr.length + 1];
//		for(int i = 0; i < arr.length; i++) {
//			if(i < index) newArr[i] = arr[i];
//			else newArr[i+1] = arr[i];
//		}
//		newArr[index] = value;
//		arr = newArr;
// ---------------삼항연산자 응용---------------------------
//		int[] newArr = new int[arr.length + 1];
//		for(int i = 0; i < arr.length; i++) {
//			int tIdx = i < index ? i : i + 1;
//			newArr[tIdx] = arr[i];
//		}
//		newArr[index] = value;
//		arr = newArr;
	}
	@Override
	public int remove(int index) {
//--------------쌍 for문------------------------------
//		int[] newArr = new int[arr.length - 1];
//		int temp = arr[index];
//		for(int i = 0; i < index; i++) {
//			newArr[i] = arr[i];
//		}
//		for(int i = index; i < newArr.length; i++) {
//			newArr[i] = arr[i + 1];
//		}
//		arr = newArr;
//		return temp;
//---------------삼항 연산자------------------------------
		int[] newArr = new int[arr.length - 1];
		int temp = arr[index];
		for(int i = 0; i < newArr.length; i++) {
			int tIdx = i < index ? i : i + 1;
			newArr[i] = arr[tIdx];
		}
		arr = newArr;
		return temp;
	}
	@Override
	public int remove() {
		return remove(arr.length - 1);
	}
	

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}
	
	@Override
	public void printAll() {
		System.out.println("[" + toString() + "]");
	}
	
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < arr.length - 1; i++) {
			str += arr[i] + ", ";
		}
		str += arr[arr.length - 1];
		return str;
	}

}
