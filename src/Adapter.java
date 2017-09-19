
public class Adapter implements EnemyAttacker {
	
	Robot robot;
	
	Adapter(Robot robot){
		this.robot = robot;
	}
	
	@Override
	public void fireWepoon() {
		// TODO Auto-generated method stub
		robot.smashHand();
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		robot.walkForward();
	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		robot.reactToHuman(name);
	}

}
