package gr.aueb.dmst.mazegame;

import javax.swing.JFrame;

public class Instructions {

	public void display_Instructions() {
		JFrame wndw = new JFrame();
		wndw.setResizable(false);

		Instructions_Panel inp = new Instructions_Panel();
		wndw.add(inp);

		wndw.pack();

		wndw.setLocationRelativeTo(null);
		wndw.setVisible(true);
	}
}
