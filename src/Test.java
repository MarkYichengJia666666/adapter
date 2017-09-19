
public class Test {
	public static void main(String[] args){
		EnemyTank tank = new EnemyTank();
		Robot robot = new Robot();
		Adapter adpt = new Adapter(robot);
		System.out.println("robot here");
		robot.reactToHuman("XX");
		robot.smashHand();
		robot.walkForward();
		
		System.out.println("Tank here");
		tank.assignDriver("WEW");
		tank.fireWepoon();
		tank.driveForward();
		
		System.out.println("robot adapter here");
		adpt.assignDriver("AXX");
		adpt.fireWepoon();
		adpt.driveForward();
	}
}
