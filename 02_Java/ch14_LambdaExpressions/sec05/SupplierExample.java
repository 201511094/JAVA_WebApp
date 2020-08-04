package sec05;

import java.util.function.*;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntSupplier intSupplier=()-> {
			int num=(int)(Math.random()*6)+1;
			return num;
		};
		
		int num=intSupplier.getAsInt();	//객체에서 값 얻기
		System.out.println("눈의 수:" +num);
		
	}
}