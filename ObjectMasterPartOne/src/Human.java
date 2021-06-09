
public class Human {
	int strength = 3;
	int intelligence = 3;
	int stealth = 3;
	int health = 100;
	
	public int displayHealth() {
//		System.out.println("Your health is now " + this.health);
		return health;
	}
	
	public void attackHuman(Human h) {
		h.health = h.health - this.strength;
		System.out.println("You attacked! " + " Your enemies health is now " + h.displayHealth());
	}
}
