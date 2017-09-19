
public class EnemyTank implements EnemyAttacker {

	@Override
	public void fireWepoon() {
		// TODO Auto-generated method stub
		int attackDamage = 3;
		System.out.println("Tank does" + attackDamage+"Damages");
	}

	@Override
	public void driveForward() {
		int driver = 4;
		System.out.println("Tank does" + driver+"strides");

	}

	@Override
	public void assignDriver(String name) {
		// TODO Auto-generated method stub
		System.out.println("the driver name is" + name);
	}

}
