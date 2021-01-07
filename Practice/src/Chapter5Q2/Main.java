package Chapter5Q2;

public class Main {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNumber = 201803120001L;
		order.customerID = "abc123";
		order.orderDate = "2018년 3월 12일";
		order.customerName = "홍길순";
		order.productNumber = "PD345-12";
		order.Address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
	}

}
