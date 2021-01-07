package Chapter5Q4;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public void StarCoffee(StarCafe scoffee, int money) {
		String message = scoffee.brewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님은 "+ money + "원으로 " + message);
		}
	}
	public void BeanCoffee(BeanCafe bcoffee, int money) {
		String message = bcoffee.brewing(money);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "님은 "+ money + "원으로 " + message);
		}
	}
}
