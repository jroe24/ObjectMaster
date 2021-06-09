
class Samurai extends Human {
	double health = 100;
	
	public void deathBlow(Human h) {
		h.health = h.health - h.health;
		this.health = this.health / 2;
		System.out.println("The ninja used a death blow on it's enemy. Your enemies health is now : " + h.displayHealth() + " Your health is now: " + this.displayHealth());	
	}
	
	public void meditate() {
		this.health = this.health * 1.5;
		System.out.println("The ninja used meditate. Your health is now: " + this.displayHealth());
	}
}
