import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
	
Timer move;

	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				Var.BallX += Var.BallDirX;
				Var.BallY += Var.BallDirY;
				
			}
			
			
		}, 0, 4);
	}

}
