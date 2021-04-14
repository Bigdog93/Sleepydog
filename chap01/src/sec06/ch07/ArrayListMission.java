package sec06.ch07;

public class ArrayListMission {
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		list.printAll();
		System.out.println(list);
		
		list.add(2, 25);
		list.printAll();
		
		int val = list.remove(3);
		list.printAll();
		System.out.println("삭제된 숫자 : " + val);
		
		val = list.remove();
		list.printAll();
		System.out.println("삭제된 숫자 : " + val);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		
		
	}
}