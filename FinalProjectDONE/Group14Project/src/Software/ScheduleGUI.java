package Software;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import MainFrame.MainWindow;
import UserView.Schedule;
import UserView.Treatment;

public class ScheduleGUI{
//	MainWindow mainwindow;
//	Schedule schedule;
//	
//	//JFrame
//	private JMenuBar menuBar;
//	private JMenu Home;
//	private JMenuItem returnHome;
//	
//	public ScheduleGUI(MainWindow mainwindow, Schedule schedule, String name) {
//		this.mainwindow = mainwindow;
//		this.schedule = schedule;
//		setSize(700, 600);
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
//		JLabel mainlabel = new JLabel("<HTML><center>This is the schedule for "+name+"</center></HTML>");
//		mainlabel.setBounds(250, 10, 350, 100);
//		mainlabel.setLocation((this.getWidth()-mainlabel.getWidth())/2,0);
//		mainlabel.setHorizontalAlignment(SwingConstants.CENTER);
//		this.add(mainlabel);
//		setLayout(null);
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		
//		buildGUI();	
//		
//		setVisible(true);
//	}
//	
//	public void buildGUI() {
//		//Menu Bar		
//		menuBar = new JMenuBar();
//		Home = new JMenu("Home");
//		returnHome = new JMenuItem("Return back to Home");
//		returnHome.addActionListener(this);
//		Home.add(returnHome);
//		menuBar.add(Home);
//		setJMenuBar(menuBar);
//		
//		//Specs
//		String timeLoop ="";
//		for(int i=0; i<schedule.getTime().size();i++) {
//			timeLoop += schedule.getTime().get(i)+"<BR>";
//		}
//		JLabel content = new JLabel("<HTML><H1>Schedule</H1><BR>Here is the schedule:<BR>"+timeLoop+"</HTML>");
//		content.setBounds(20, 80, 500, 700);
//		content.setVerticalAlignment(SwingConstants.TOP);
//		this.add(content);
//	}
//	
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==returnHome) {
//			this.dispose();
//			HospitalMainGUI main = new HospitalMainGUI("Hospital", mainwindow);
//		}
//	}
	JFrame f;
	MainWindow mw;
	Schedule time;
    ScheduleGUI(MainWindow mw, Schedule time){   
    	this.time = time;
    	this.mw = mw;
    	f=new JFrame();       
	    String column[]={"Time","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	    DefaultTableModel tableModel = new DefaultTableModel(column, 0);
	    JTable jt = new JTable(tableModel);
	    for(int i=0; i<25; i++) {
	    	ArrayList<String> newData = new ArrayList<String>();
	    	for(int j=0; j<8; j++) {
	    		newData.add(time.getTime().get(j).get(i));
	    	}
	    	String tframe = newData.get(0);
	    	String wod1 = newData.get(1);
	    	String wod2 = newData.get(2);
	    	String wod3 = newData.get(3);
	    	String wod4 = newData.get(4);
	    	String wod5 = newData.get(5);
	    	String wod6 = newData.get(6);
	    	String wod7 = newData.get(7);
	    	Object[] data = {tframe, wod1, wod2, wod3, wod4, wod5, wod6, wod7};
	    	tableModel.addRow(data);
	    }
	        
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    f.add(sp);          
	    f.setSize(700,600);    
	    f.setVisible(true);
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
