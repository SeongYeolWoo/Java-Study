package Chapter5Q4;

public class BeanCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money ;
		if(money == Menu.beanAmericano) {
			return "콩다방에서 아메리카노를 구입했습니다.";
		}
		else if(money == Menu.beanLatte) {
			return "콩다방에서 라뗴를 구입했습니다.";
		}
		else return null;
	}
}
