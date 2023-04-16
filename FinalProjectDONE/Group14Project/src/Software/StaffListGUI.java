package Software;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import MainFrame.MainWindow;
import UserView.Emergency;
import UserView.StaffList;

public class StaffListGUI extends JFrame implements ActionListener{
	//fields
			MainWindow mainwindow;
			StaffList stafflist;
			
			//JFrame
			private JMenuBar menuBar;
			private JMenu Home;
			private JMenuItem returnHome;
			private JButton[] currentBtn;
			
			public StaffListGUI(MainWindow mainwindow, StaffList stafflist) {
				this.mainwindow = mainwindow;
				this.stafflist = stafflist;
				setSize(700, 600);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
				JLabel mainlabel = new JLabel("<HTML><center>Welcome to the Staff Page"
						+ "<BR>Here are all the doctors below.<BR>Return to mainpage by clicking the menu bar</center></HTML>");
				mainlabel.setBounds(250, 10, 350, 100);
				mainlabel.setLocation((this.getWidth()-mainlabel.getWidth())/2,0);
				mainlabel.setHorizontalAlignment(SwingConstants.CENTER);
				this.add(mainlabel);
				setLayout(null);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				buildGUI();	
				
				setVisible(true);
			}
			
			public void buildGUI() {
				//Menu Bar		
				menuBar = new JMenuBar();
				Home = new JMenu("Home");
				returnHome = new JMenuItem("Return back to Home");
				returnHome.addActionListener(this);
				Home.add(returnHome);
				menuBar.add(Home);
				setJMenuBar(menuBar);
				
				//Specs
				JLabel content = new JLabel("<HTML><H1>Doctors:</H1></HTML>");
				content.setBounds(20, 80, 500, 700);
				content.setVerticalAlignment(SwingConstants.TOP);
				this.add(content);
				
				//Button
				int x = 20;
				int y = 150;
				currentBtn = new JButton[stafflist.getDoctorList().size()];
				for(int i=0; i<stafflist.getDoctorList().size();i++) {
					currentBtn[i] = new JButton(stafflist.getDoctorList().get(i).getDoctorName());
					currentBtn[i].setBounds(x, y, 150, 50);
					currentBtn[i].setFocusable(false);
					currentBtn[i].setActionCommand(""+i);
					currentBtn[i].addActionListener(this);
					this.add(currentBtn[i]);
					x += 170;
					if(x+150>700) {
						x = 20;
						y += 100;
					}
				}
			}
			
			
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==returnHome) {
					this.dispose();
					HospitalMainGUI main = new HospitalMainGUI("Hospital", mainwindow);
				}
				else if (e.getActionCommand()!=null) {
					this.dispose();
					int index = Integer.parseInt(e.getActionCommand());
					DoctorGUI treat = new DoctorGUI(mainwindow, stafflist.getDoctorList().get(index));
				}
			}
}
