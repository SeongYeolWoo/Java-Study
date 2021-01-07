package Chapter5Q2;

public class Order {
	long orderNumber;
	String customerID;
	String orderDate;
	String customerName;
	String productNumber;
	String Address;
	
	public void showOrderInfo() {
		System.out.println("주문 번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + customerID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + customerName);
		System.out.println("주문 상품 번호 : " + productNumber);
		System.out.println("배송 주소 : " + Address);
	}
}
