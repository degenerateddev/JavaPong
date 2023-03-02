import java.awt.*;

import javax.swing.JLabel;

public class Draw extends JLabel {
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.BLACK);
		
		g.fillRect(0, 0, Var.screenwidth, Var.screenhight);
		
		g.setColor(Color.WHITE);
		
		for(int i = 0; i <= 30; i++) {
			g.fillRect(Var.screenwidth/2 - 5, i * 20, 10, 10);
		
		
	}
		g.fillRect(Var.x, Var.y, 25, 150);
		g.fillRect(Var.GegnerX, Var.GegnerY, 25, 150);
		
		g.setFont(Var.pixelschrift);
		
		g.drawString("" + Var.playerPoints, Var.screenwidth/2 - 80, 75);
		g.drawString("" + Var.gegnerPoints, Var.screenwidth/2 + 50, 75);
		
		g.fillRect(Var.BallX, Var.BallY, 20, 20);
		
		repaint();
	

	}

}
