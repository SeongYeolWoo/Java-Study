package Chapter5Q4;

public class BeanCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money ;
		if(money == Menu.beanAmericano) {
			return "��ٹ濡�� �Ƹ޸�ī�븦 �����߽��ϴ�.";
		}
		else if(money == Menu.beanLatte) {
			return "��ٹ濡�� ��� �����߽��ϴ�.";
		}
		else return null;
	}
}
