package Chapter5Q4;

public class StarCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.starAmericano) {
			return "���ٹ濡�� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money == Menu.starLatte) {
			return "���ٹ濡�� �󶼸� �����߽��ϴ�.";
		}
		else return null;
	}
}
