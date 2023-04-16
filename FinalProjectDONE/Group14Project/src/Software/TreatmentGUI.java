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
import UserView.Treatment;

public class TreatmentGUI extends JFrame implements ActionListener{
	MainWindow mainwindow;
	Treatment treatmentPage;
	
	//JFrame
	private JMenuBar menuBar;
	private JMenu Home;
	private JMenuItem returnHome;
	private JMenu Back;
	private JMenuItem BackToEm;
	
	public TreatmentGUI(MainWindow mainwindow, Treatment treatment) {
		this.mainwindow = mainwindow;
		this.treatmentPage = treatment;
		setSize(700, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		JLabel mainlabel = new JLabel("<HTML><center>This is the treatment page for "+treatmentPage.getTreatmentName()+"</center></HTML>");
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
		BackToEm= new JMenuItem("Return back to Emergency");
		BackToEm.addActionListener(this);
		returnHome.addActionListener(this);
		Back.add(BackToEm);
		Home.add(returnHome);
		menuBar.add(Home);
		menuBar.add(Back);
		setJMenuBar(menuBar);
		
		//Specs
		JLabel content = new JLabel("<HTML><H1>"+treatmentPage.getTreatmentName()+"</H1><BR>"+treatmentPage.getTreatmentMethod()+"</HTML>");
		content.setBounds(20, 80, 500, 700);
		content.setVerticalAlignment(SwingConstants.TOP);
		this.add(content);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==returnHome) {
			this.dispose();
			HospitalMainGUI main = new HospitalMainGUI("Hospital", mainwindow);
		}
		else if(e.getSource()==BackToEm) {
			EmergencyGUI emergency = new EmergencyGUI(mainwindow);
			this.dispose();
		}
	}
}
