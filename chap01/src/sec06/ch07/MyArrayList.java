package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] arr;
	
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
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

}
