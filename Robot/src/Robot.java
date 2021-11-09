
public class Robot implements IRobot {

	private int x; 
	private int y;
	private int orientation;
	
	public Robot(int x, int y, int orientation) {
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	
	public void avancer() { 
		switch (orientation) {
		case Nord : y=y+1; break;
		case Est : x=x+1; break;
		case Sud : y=y-1; break;
		case Ouest : x=x-1; break;
		}
	}

	public void tournerADroite() {
		switch (orientation) {
		case Nord : orientation=Est ; break;
		case Est : orientation=Sud ; break;
		case Sud : orientation=Ouest; break;
		case Ouest: orientation=Nord ; break;
		}
	}
	
	public static boolean memePosition(Robot r1, Robot r2) {
		if ((r1.x == r2.x) && (r1.y == r2.y))
			return true;
		return false;
	}
	
	public String toString() {
		String tmp = this.x + " " + this.y;
		switch (orientation) {
		case Nord : tmp = tmp + " Nord" ; break;
		case Est : tmp = tmp + " Est" ; break;
		case Sud : tmp = tmp + " Sud" ; break;
		case Ouest: tmp = tmp + " Ouest" ; break;
		}
		return tmp;
	}

	
}
