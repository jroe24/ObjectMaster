
class Wizard extends Human {
	int health = 50;
	int intelligence = 8;
	
	public void heal(Human h) {
		h.health = h.health + this.intelligence;
		System.out.println("The wizard is now healing an aly! Your ally's health is now: " + h.health);
	}
	public void fireball(Human h) {
		this.intelligence = this.intelligence * 3;
		h.health = h.health - this.intelligence;
		System.out.println("The wizard used it's fireball attack. Your enemies health is now: " + h.displayHealth());
		}
}


