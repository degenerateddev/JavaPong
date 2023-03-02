import java.util.Timer;
import java.util.TimerTask;

public class Kollision {

Timer kollision;

	public Kollision() {
		
		kollision = new Timer();
		kollision.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				
				if (Var.BallY + 50 >= Var.screenhight) {
					Var.BallDirY = -1;
				}
				
				if (Var.BallY <= 0) {
					Var.BallDirY = 1;
				}
				
				if (Var.BallX + 20 >= Var.screenwidth) {
					
					Var.BallX = Var.screenwidth /2 -10;
					Var.BallY = Var.screenhight /2 -10;
					
					Var.BallDirX = -1;
					Var.playerPoints += 1;
				}
				
				if (Var.BallX <= 0) {
					
					Var.BallX = Var.screenwidth /2 -10;
					Var.BallY = Var.screenhight /2 -10;
					
					Var.BallDirX = 1;
					Var.gegnerPoints += 1;
				}
				
				if (Var.BallX < Var.x + 25 && Var.BallX > Var.x && Var.BallY -20 < Var.y + 150 && Var.BallY > Var.y) {
					Var.BallDirX = 1; 
				}
				
				if (Var.BallX < Var.GegnerX + 25 && Var.BallX > Var.GegnerX && Var.BallY -20 < Var.GegnerY + 150 && Var.BallY > Var.GegnerY) {
					Var.BallDirX = -1; 
				}
				
				
			}
				
			
	}, 0, 4);

	}

}

