package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		Computer MyNoteBook = new MyNoteBook();
		MyNoteBook.typing();
	}
}