
public class HumanTest {

	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		human2.displayHealth();
		human1.attackHuman(human2);
		human2.displayHealth();

	}

}
