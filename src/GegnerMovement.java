import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {	

	Timer move;
	
	public GegnerMovement() {
		
		move = new Timer();
		
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if(Var.BallX >= Var.screenwidth /2 -10) {
					
				if (Var.BallY == Var.GegnerY) {
						
				} else if (Var.BallY > Var.GegnerY + 75) {
						
					if (Var.GegnerY <= Var.screenhight -200) {
						Var.GegnerY += 2;
					}
						
				
				
				} else if (Var.GegnerY < Var.GegnerY +75) {
						
					if (Var.GegnerY >= 20) {
					Var.GegnerY -= 2;
					}
				
				}
			
			
			}
	
			}
	
	}, 0, 13);
		
	}
}


