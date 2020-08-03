package package_exam03;

public class Container<K,V> {
	private K k;
	private V v;
	
	public void set(K k, V v) {
		// TODO Auto-generated method stub
		this.k=k;
		this.v=v;
	}
	public K getKey() {
		// TODO Auto-generated method stub
		return this.k;
	}
	public V getValue() {
		// TODO Auto-generated method stub
		return this.v;
	}

}