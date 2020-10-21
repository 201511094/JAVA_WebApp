package kr.spring.ch15;

public class Executor {
	//프로퍼티
	private Worker worker;

	//객체를 주입받는 메소드
	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Worker getWorker() {
		return worker;
	}

}