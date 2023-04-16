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
import UserView.Department;
import UserView.Doctor;

public class DepartmentGUI extends JFrame implements ActionListener{
	//fields
			MainWindow mainwindow;
			Department department;
			
			//JFrame
			private JButton[] currentBtn;
			private JMenuBar menuBar;
			private JMenu Home;
			private JMenuItem returnHome;
			private JMenu Back;
			private JMenuItem BackToDL;
			
			public DepartmentGUI(MainWindow mainwindow, Department department) {
				this.mainwindow = mainwindow;
				this.department = department;
				setSize(700, 600);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
				JLabel mainlabel = new JLabel("<HTML><center>Welcome to the Department of "+this.department.getDepartName()
						+ "<BR>Access the doctors in the department below.<BR>Return to mainpage by clicking the menu bar</center></HTML>");
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
				returnHome = new JMenuItem("Return back to Home");
				BackToDL= new JMenuItem("Return to DepartmentList");
				returnHome.addActionListener(this);
				BackToDL.addActionListener(this);
				Home.add(returnHome);
				Back.add(BackToDL);
				menuBar.add(Home);
				menuBar.add(Back);
				setJMenuBar(menuBar);
				
				//Specs
				JLabel content = new JLabel("<HTML><H1>"+department.getDepartName()+"</H1><BR>Information:<BR>"+department.getDepartDetail()+"</HTML>");
				content.setBounds(20, 80, 650, 700);
				content.setVerticalAlignment(SwingConstants.TOP);
				this.add(content);
				
				//Button
				int x = 20;
				int y = 200;
				currentBtn = new JButton[department.getDepartDoctors().size()];
				for(int i=0; i<department.getDepartDoctors().size();i++) {
					currentBtn[i] = new JButton(department.getDepartDoctors().get(i).getDoctorName());
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
				else if(e.getSource()==BackToDL) {
					
					DepartmentListGUI DepartList = new DepartmentListGUI(mainwindow, mainwindow.getUserWindow().getDepartList());
					this.dispose();
				}
				else if(e.getActionCommand()!=null) {
					this.dispose();
					int index = Integer.parseInt(e.getActionCommand());
					DoctorGUI treat = new DoctorGUI(mainwindow, department.getDepartDoctors().get(index));
				}
			}
}
