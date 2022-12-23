package edu.kh.poly.model.vo;

public class Tesla extends Car { //전기차
	// Car를 상속받을 수 있도록 => extends Car (부모클래스)
	
	private int batteryCapacity;  //배터리 용량
	
	public Tesla() { // ctrl + space + enter (기본생성자 단축키)
		super(); //Car 클래스 (바로 윗 부모 클래스)
	}
	
	//매개변수 생성자: alt + shift + s -> o -> 드롭박스 -> 매개변수 안에 채워져있는것 선택
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	// getter/setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override  //Car.toSring() 오버라이딩
	public String toString() {
		// super 참조변수
		return super.toString() + "/" + batteryCapacity;
	}
}
