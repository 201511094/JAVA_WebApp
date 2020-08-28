package com.s03.object;

class Tv {
	//속성(멤버변수)
	boolean power;	//전원상태(on/off)
	int channel;	//채널
	
	//동작(멤버메소드)
	public void isPower() {		//TV를 켜거나 끄는 기능을 하는 메소드
		power = !power;
	}
	public void channelUp() {	//TV의 채널을 높이는 기능을 하는 메소드
		++channel;
	}
	public void channelDown() {	//TV의 채널을 낮추는 기능을 하는 메소드
		--channel;
	}
}

//실행 클래스
public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.power + ", " + t.channel);
		System.out.println("----------");
		
		t.isPower();	//false -> true
		System.out.println("Tv 실행 여부: " + t.power);
		System.out.println("현재 채널: "+ t.channel);
		System.out.println("----------");
		
		t.channel = 7;	//채널 변경
		System.out.println("첫번째 변경된 채널: " + t.channel);
		System.out.println("----------");
		
		t.channelDown();
		System.out.println("두번째 변경된 채널: " + t.channel);
		System.out.println("----------");
		
		//Tv끄기
		t.isPower();	//true -> false
		System.out.println("Tv 실행 여부: " + t.power);
	}
}