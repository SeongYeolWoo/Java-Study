package Chapter5Q4;

public class StarCafe {
	int money;
	
	public String brewing(int money) {
		this.money += money;
		if(money == Menu.starAmericano) {
			return "별다방에서 아메리카노를 구입했습니다";
		}
		else if(money == Menu.starLatte) {
			return "별다방에서 라떼를 구입했습니다.";
		}
		else return null;
	}
}
