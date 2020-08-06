package sec06;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼낸 동전: "+coin.getValue()+"원");
		}
	}
	//동전케이스 스택 예제
}