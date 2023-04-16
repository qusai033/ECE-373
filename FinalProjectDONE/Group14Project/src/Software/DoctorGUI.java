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
import UserView.Doctor;
import UserView.Information;

public class DoctorGUI extends JFrame implements ActionListener{
	//fields
		MainWindow mainwindow;
		Doctor doctor;
		
		//JFrame
		JButton Schedule = new JButton("Go to Schedule");
		private JMenuBar menuBar;
		private JMenu Home;
		private JMenuItem returnHome;
		private JMenu Back;
		private JMenuItem BackToDL;
		private JMenuItem BackToSL;
		
		public DoctorGUI(MainWindow mainwindow, Doctor doctor) {
			this.mainwindow = mainwindow;
			this.doctor = doctor;
			setSize(700, 600);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
			JLabel mainlabel = new JLabel("<HTML><center>Welcome to Doctor "+this.doctor.getDoctorName()+"'s Page"
					+ "<BR>Access his schedule below.<BR>Return to mainpage by clicking the menu bar</center></HTML>");
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
			Back = new JMenu("Back");
			BackToSL = new JMenuItem("Return back to Staff List");
			returnHome = new JMenuItem("Return back to Home");
			returnHome.addActionListener(this);
			BackToSL.addActionListener(this);
			Back.add(BackToSL);
			Home.add(returnHome);
			menuBar.add(Home);
			menuBar.add(Back);
			setJMenuBar(menuBar);
			
			//Specs
			JLabel content = new JLabel("<HTML><H1>Information</H1><BR>Name:<BR> "+doctor.getDoctorName()+"<BR><BR>Information:<BR>"+doctor.getDoctorInfo()+"</HTML>");
			content.setBounds(20, 80, 500, 700);
			content.setVerticalAlignment(SwingConstants.TOP);
			this.add(content);
			
			//Button
			Schedule.setBounds(250, 450, 200, 50);
			Schedule.setFocusable(false);
			Schedule.addActionListener(this);
			this.add(Schedule);
		}
		
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==returnHome) {
				this.dispose();
				HospitalMainGUI main = new HospitalMainGUI("Hospital", mainwindow);
			}
			else if(e.getSource()==Schedule) {
				ScheduleGUI time = new ScheduleGUI(mainwindow, doctor.getDoctorSchedule());
			}
			else if(e.getSource()==BackToSL) {
				StaffListGUI staffPage = new StaffListGUI(mainwindow, mainwindow.getUserWindow().getStaffList());
				this.dispose();
			}
		}
}
