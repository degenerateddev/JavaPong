import javax.swing.*;

public class GUI {

	public GUI() {
		
		Var.Fenster = new JFrame();
		Var.Fenster.setSize(Var.screenwidth, Var.screenhight);
		Var.Fenster.setTitle("Pong");
		Var.Fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.Fenster.setLayout(null);
		Var.Fenster.setResizable(false);
		Var.Fenster.setVisible(true);
		Var.Fenster.setLocationRelativeTo(null);
		Var.Fenster.addKeyListener(new KeyHandler());
		Var.Fenster.requestFocus();
		
		Draw LabelDraw = new Draw();
		LabelDraw.setBounds(0, 0, Var.screenwidth, Var.screenhight);
		LabelDraw.setVisible(true);
		Var.Fenster.add(LabelDraw);
		
		
	}

}
