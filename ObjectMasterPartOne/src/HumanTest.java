
public class HumanTest {

	public static void main(String[] args) {
//		Human human1 = new Human();
//		Human human2 = new Human();
//		human2.displayHealth();
//		human1.attackHuman(human2);
//		human2.displayHealth();
		Samurai samurai1 = new Samurai();
		Wizard wizard1 = new Wizard();
		Ninja ninja1 = new Ninja();
		samurai1.deathBlow(wizard1);
		samurai1.meditate();
		ninja1.steal(wizard1);
		ninja1.runAway();
		wizard1.heal(wizard1);
		wizard1.fireball(ninja1);
			
		

	}

}
