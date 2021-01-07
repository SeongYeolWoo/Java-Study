package Chapter5Q4;

public class CafeTest {
	public static void main(String[] args) {
		StarCafe sCafe = new StarCafe();
		BeanCafe bCafe = new BeanCafe();
		
		Person kim = new Person ("Kim", 10000);
		Person lee = new Person ("Lee", 10000);
		
		kim.StarCoffee(sCafe, 4000);
		lee.BeanCoffee(bCafe, 4500);
	}
}
