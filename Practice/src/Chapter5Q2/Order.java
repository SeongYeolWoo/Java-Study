package Chapter5Q2;

public class Order {
	long orderNumber;
	String customerID;
	String orderDate;
	String customerName;
	String productNumber;
	String Address;
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ : " + orderNumber);
		System.out.println("�ֹ��� ���̵� : " + customerID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + productNumber);
		System.out.println("��� �ּ� : " + Address);
	}
}
