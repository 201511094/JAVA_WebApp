package sec06;

public class Car {
	private String model;
	public String owner;
	
	public Car() {}
	
	public Car(String model) {
		this.model = model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	private void setOwner(String owner) {
		this.owner = owner;
	}
	
}