
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.*;

public class GUI {
	
	

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(1500, 1000);
		frame.setTitle("My Frame");
		frame.setBackground(Color.cyan);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jpanel = new JPanel();
		jpanel.setVisible(true);
		jpanel.setSize(200, 200);
		jpanel.setBackground(Color.cyan);
		frame.add(jpanel);

		JLabel jlable = new JLabel("Name");
		jpanel.add(jlable);
		TextArea text = new TextArea(10, 40);
		text.setSize(100, 100);
		jpanel.add(text);

		JMenuBar bar = new JMenuBar();

		JMenu File = new JMenu("File");
		JMenuItem New = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem Save = new JMenuItem("Save");

		JMenu edit = new JMenu("Edit");
		//n3mel action n3mel joption clicked.
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		JMenuItem Delete = new JMenuItem("Delete");
		JMenuItem Select = new JMenuItem("Select All");

		JMenu Help = new JMenu("Help");
		//Clicable
		JMenuItem About = new JMenuItem("About");
		bar.add(File);
		bar.add(edit);
		bar.add(Help);
		frame.setJMenuBar(bar);

		File.add(New);
		File.add(open);
		File.add(Save);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(Delete);
		edit.add(Select);
		Help.add(About);
		About.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "About clickable");
				
			}
		});
		

	}

}
