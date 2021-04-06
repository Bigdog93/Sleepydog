package sec06.exam01;

import java.util.Stack;

public class VariableExample {
	public static void main(String[] args) {
//		/* 멀티라인 */
//		// 싱글라인
//		int a; // 변수선언
//		a = 10; // 변수 초기화 (10 : 초기값)
//
//		int value = 10; // 선언과 동시에 초기화, = : 오른쪽 값을 복사해서 왼쪽으로.
//		int result = value + 10;
//		System.out.println(result); // 자바에서 console에 값 찍을 때 쓰는 명령

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 0, 2, 4, 0, 2 },
				{ 0, 5, 1, 0, 1 } };
		int[] moves = { 4, 4, 3, 5, 1, 2, 1, 4 };

		Solution VE = new Solution();

		System.out.println(VE.solution(board, moves));

	}
}


class Solution {
    public int solution(int[][] board, int[] moves) {
        int last = 0;
        int cnt = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    stk.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    if(last == stk.peek()) {
                        stk.pop();
                        stk.pop();
                        cnt += 2;
                        last = stk.peek();
                    }else last = stk.peek();
                    break;
                }
            }
        }
        int answer = cnt;
        return answer;
    }
}