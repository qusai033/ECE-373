package Software;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;

import javax.swing.*;

import MainFrame.MainWindow;



public class HospitalMainGUI extends JFrame implements ActionListener{
	//fields
	MainWindow mainwindow;
	private JPanel jl;
	//GUI Object
	private JMenuBar menuBar;
	private JMenu personnelLogin;
	private JMenu Home;
	
	//Home
	private JMenuItem returnHome;
	
	//personnelLogin
	private JMenuItem administratorTab;
	private JMenuItem doctorTab;
	
	//button
	JButton infoPage= new JButton("Information");
	JButton departList = new JButton("Department List");
	JButton staffList = new JButton("Staff");
	JButton emergencyList = new JButton("Emergency");
	
	
	public HospitalMainGUI(String GUINAME, MainWindow mainwindow) 
	{
		super(GUINAME);
		
		this.mainwindow = mainwindow;
		
		setSize(700, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		JLabel mainlabel = new JLabel("<HTML><center>Welcome to the Hospital System" +
				"<BR>Click on the buttons below for access to more information <br> Click the menubar to log in as hospital personnels</center></HTML>");
		mainlabel.setBounds(250, 10, 350, 100);
		mainlabel.setLocation((this.getWidth()-mainlabel.getWidth())/2,0);
		mainlabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(mainlabel);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		buildGUI();	
		setVisible(true);
	}
	
	public void buildGUI() 
	{
		menuBar = new JMenuBar();
		personnelLogin = new JMenu("Personnel Login");
		Home = new JMenu("Home");
		
		returnHome = new JMenuItem("Return back to Home");
		
		administratorTab = new JMenuItem("Administrator Login");
		doctorTab = new JMenuItem("Doctor Login");
		
		//addEventListener
		administratorTab.addActionListener(new MenuListener());
		doctorTab.addActionListener(new MenuListener());
		returnHome.addActionListener(new MenuListener());
		
		//add
		Home.add(returnHome);
		personnelLogin.add(administratorTab);
		personnelLogin.add(doctorTab);
		
		menuBar.add(Home);
		menuBar.add(personnelLogin);
		
		setJMenuBar(menuBar);
		
		//Buttons
		infoPage.setBounds(100, 150, 200, 100);
		infoPage.setFocusable(false);
		infoPage.addActionListener(this);
		
		departList.setBounds(400, 150, 200, 100);
		departList.setFocusable(false);
		departList.addActionListener(this);
		
		staffList.setBounds(100, 350, 200, 100);
		staffList.setFocusable(false);
		staffList.addActionListener(this);
		
		emergencyList.setBounds(400, 350, 200, 100);
		emergencyList.setFocusable(false);
		emergencyList.addActionListener(this);
		this.add(infoPage);
		this.add(departList);
		this.add(staffList);
		this.add(emergencyList);
	}
	
	private class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e) //this is the method MenuListener must implement, as it comes from the ActionListener interface.
		{
			JMenuItem source = (JMenuItem)(e.getSource());
			
			if(source.equals(returnHome))
			{
				
			}
			else if (source.equals(administratorTab)) 
			{
				JPasswordField field1 = new JPasswordField();
				Object[] message = {
					    "Enter Authentication Key:", field1,
				};
				int option = JOptionPane.showConfirmDialog(null, message,"Authentication", JOptionPane.OK_CANCEL_OPTION);
				String value1 = field1.getText();
				if (option == JOptionPane.OK_OPTION) {
				    if (value1.equals("")) {
				    	JOptionPane.showMessageDialog(null, "Field is Empty. Please Enter Something.","Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else {
				    	if (mainwindow.authenticateAdmin(value1)==true) {
				    		JOptionPane.showMessageDialog(null,"Logging in as Administrator","Success", JOptionPane.PLAIN_MESSAGE);
				    		AdministratorView adminView = new AdministratorView(mainwindow);
				    	}
				    	else {
				    		JOptionPane.showMessageDialog(null,"Incorrect Authentication Key","Error", JOptionPane.ERROR_MESSAGE);
				    	}
				    }
				}
			}
			else if (source.equals(doctorTab)) 
			{
				JPasswordField field1 = new JPasswordField();
				Object[] message = {
					    "Enter Authentication Key:", field1,
				};
				int option = JOptionPane.showConfirmDialog(null, message,"Authentication", JOptionPane.OK_CANCEL_OPTION);
				String value1 = field1.getText();
				if (option == JOptionPane.OK_OPTION) {
				    if (value1.equals("")) {
				    	JOptionPane.showMessageDialog(null, "Field is Empty. Please Enter Something.","Error", JOptionPane.ERROR_MESSAGE);
				    }
				    else {
				    	if (mainwindow.authenticateDoctor(value1)==true) {
				    		JOptionPane.showMessageDialog(null,"Logging in as Doctor","Success", JOptionPane.PLAIN_MESSAGE);
				    		DoctorViewGUI docView = new DoctorViewGUI(mainwindow);
				    	}
				    	else {
				    		JOptionPane.showMessageDialog(null,"Incorrect Authentication Key","Error", JOptionPane.ERROR_MESSAGE);
				    	}
				    }
				}
			}
		}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==infoPage) {
			//System.out.println("clicked");
			this.dispose();
			InformationGUI infoPage = new InformationGUI(mainwindow);
		}
		else if(e.getSource()==departList) {
			this.dispose();
			DepartmentListGUI departPage = new DepartmentListGUI(mainwindow, mainwindow.getUserWindow().getDepartList());
		}
		else if(e.getSource()==staffList) {
			this.dispose();
			StaffListGUI staffPage = new StaffListGUI(mainwindow, mainwindow.getUserWindow().getStaffList());
		}
		else if(e.getSource()==emergencyList) {
			this.dispose();
			EmergencyGUI emergency = new EmergencyGUI(mainwindow);
		}
	}
}
