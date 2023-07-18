package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBook implements ActionListener {
    JButton buttonAdd = new JButton("Add Guest");
	JButton buttonView = new JButton("View Guests");
	JFrame frame = new JFrame("GuestBook");
	JPanel panel = new JPanel();
	ArrayList<String> names = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
		guestbook.run();
		
		
		
	}
 public void run() {
	 buttonAdd.addActionListener(this);
	 buttonView.addActionListener(this);
	 frame.add(panel);
	 panel.add(buttonAdd);
	 panel.add(buttonView);
	 frame.setVisible(true);
	 names.add("Bob Banders");
	 names.add("Sandy Summers");
	 names.add("Greg Ganders");
	 names.add("Donny Doners");
	 frame.pack();
 }
	
 
 @Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	 if (arg0.getSource() == buttonAdd) {
		String name = JOptionPane.showInputDialog(null, "Enter a name");
		names.add(name);
	}
	 if (arg0.getSource() == buttonView) {
		
		 String string = "";
				 for (int i = 0; i < names.size(); i++) {
						String s = names.get(i);
						System.out.println(s);
						JOptionPane.showMessageDialog(null, s);
					}
				 
		 
	//	 JOptionPane.showMessageDialog(null, "Bob Banders, Sandy Summers, Greg Ganders,Donny Doners" );
		 
		}
}
}
