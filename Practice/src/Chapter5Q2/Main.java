package Chapter5Q2;

public class Main {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNumber = 201803120001L;
		order.customerID = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.customerName = "ȫ���";
		order.productNumber = "PD345-12";
		order.Address = "����� �������� ���ǵ��� 20����";
		
		order.showOrderInfo();
	}

}
