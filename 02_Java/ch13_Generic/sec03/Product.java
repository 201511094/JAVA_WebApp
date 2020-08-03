package sec03;

public class Product<T,M> {	//두 개 이상의 멀티 타입 파라미터
	private T kind;
	private M model;
	
	public T getKind() {return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(T kind) {this.kind=kind;}
	public void setModel(M model) {this.model=model;}
	
}