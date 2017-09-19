
public class Robot {
	public void smashHand(){
		int attackDamage = 6;
		System.out.println("Robot attack is" + attackDamage);
	}
	public void walkForward(){
		int strides = 6;
		System.out.println("Robot moves " + strides);
	}
	public void reactToHuman(String name){
		System.out.println("robot tramps on" + name);
	}
}
