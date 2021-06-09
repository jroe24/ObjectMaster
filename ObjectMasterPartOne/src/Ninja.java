
class Ninja extends Human {
	
	public void steal(Human h) {
		h.health = h.health - this.stealth;
		this.health = this.health + this.stealth;
		System.out.println("The ninja used it's steal attack. Your enemies health is now: " + h.displayHealth() + "Your health is now : " + this.displayHealth());
	}
	
	public void runAway() {
		this.health = this.health - 10;
		System.out.println("The ninja has decided to run away. Your health is now: " + this.displayHealth());
	}

}
