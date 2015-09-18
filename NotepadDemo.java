package sidraNotepad;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextArea;
import java.applet.Applet;

public class NotepadDemo extends Applet{
	Frame f;
	
	public void init(){
		f = new NotepadFrame("Sidra's Notepad Demo");
		
		int width = Integer.parseInt(getParameter("Width"));
		int height = Integer.parseInt(getParameter("Height"));
		
		getSize(new Dimension(width, height));
		f.setSize(width + 200, height + 200);
		
		f.setVisible(true);
	}
	
	public void start(){
		f.setVisible(true);
	}
	
	public void stop(){
		f.setVisible(false);
	}
}
