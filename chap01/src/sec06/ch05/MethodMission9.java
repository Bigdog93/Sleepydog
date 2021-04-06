package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45};
		
		System.out.println(Arrays.toString(arr));
		
		String result = toString(arr);
		
		System.out.println(result);
	}
	
	private static String toString(int[] arr) {
//		int leng = arr.length - 1;
//		String ans = "[";
//		for(int i = 0; i < leng ; i++) {
//			ans += arr[i] + ", ";
//		}
//		ans += arr[leng] + "]";
//		return ans;
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			if(i != 0) {
				str += ", ";
			}
			str += arr[i];
		}
		return String.format("[%s]", str);
	}
}
