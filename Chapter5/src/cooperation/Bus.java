package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //����
 		passengerCount++;
		this.money += money;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "���̰�, ������ " + money +"�� �Դϴ�.");
	}
}
