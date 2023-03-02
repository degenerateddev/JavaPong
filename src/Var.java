import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Var {

	static JFrame Fenster;
	
	static int screenwidth = 800;
	
	static int screenhight = 600;
	
	static int x = 20;
	
	static int y = 185;
	
	static int GegnerX = 755;
	
	static int GegnerY = 185;
	
	static int playerPoints = 0;
	
	static int gegnerPoints = 0;
	
	static boolean moveup = false, movedown = false;
	
	static Font pixelschrift;
	
	static int BallX = 200; 
	
	static int BallY = 100;
	
	static int BallDirX = 1;
	
	static int BallDirY = -1;
	
	
	
	
	
	public Var() {
		
		try {
			pixelschrift = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125F);
			
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
		
		} catch (FontFormatException | IOException e) {
			
			e.printStackTrace();
		}
	}

}
