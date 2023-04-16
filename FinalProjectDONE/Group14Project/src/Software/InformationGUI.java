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
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import AdminView.Admin;
import MainFrame.MainWindow;
import UserView.Information;

public class InformationGUI extends JFrame implements ActionListener{
	//fields
	MainWindow mainwindow;
	Information infoPage;
	
	//JFrame
	JButton DepartmentList = new JButton("Go to Department List");
	private JMenuBar menuBar;
	private JMenu Home;
	private JMenuItem returnHome;
	
	public InformationGUI(MainWindow mainwindow) {
		this.mainwindow = mainwindow;
		this.infoPage = this.mainwindow.getUserWindow().getInfoPage();
		setSize(700, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		JLabel mainlabel = new JLabel("<HTML><center>Welcome to the Information Page"
				+ "<BR>Access Department List from the button below.<BR>Return to mainpage by clicking the menu bar</center></HTML>");
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
		String departLoop ="";
		for(int i=0; i<infoPage.getDepartment().getDepartments().size();i++) {
			departLoop += infoPage.getDepartment().getDepartments().get(i).getDepartName()+"<BR>";
		}
		JLabel content = new JLabel("<HTML><H1>Information</H1><BR>"+infoPage.getInformation()+"<BR><BR><BR>Here are the list of departments:<BR>"+departLoop+"</HTML>");
		content.setBounds(20, 80, 650, 700);
		content.setVerticalAlignment(SwingConstants.TOP);
		this.add(content);
		
		//Button
		DepartmentList.setBounds(250, 450, 200, 50);
		DepartmentList.setFocusable(false);
		DepartmentList.addActionListener(this);
		this.add(DepartmentList);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==returnHome) {
			this.dispose();
			HospitalMainGUI main = new HospitalMainGUI("Hospital", mainwindow);
		}
		else if(e.getSource()==DepartmentList) {
			this.dispose();
			DepartmentListGUI departLPage = new DepartmentListGUI(mainwindow, mainwindow.getUserWindow().getDepartList());
		}
	}
}
