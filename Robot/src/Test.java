
public class Test {

	public static void main(String[] args) {
		Robot victor = new Robot(0,0,Robot.Nord);
		IRobot robert = new Robot(0,0,IRobot.Sud);
		
		System.out.println(robert);
		robert.avancer();
		victor.tournerADroite();
		System.out.println(robert);
		System.out.println(victor);
		
		if (Robot.memePosition(victor, robert))
			System.out.println("Collision !!");
	}

}
