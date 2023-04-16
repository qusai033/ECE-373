package Software;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import AdminView.Admin;
import AdminView.DoctorView;
import MainFrame.MainWindow;

public class DoctorViewGUI extends JFrame implements ActionListener{
	MainWindow mainwindow;
	DoctorView docView;
	JButton editInfo = new JButton("Edit Doctor Information");
	JButton addSchedule = new JButton("Add New Doctor Schedule");
	JButton removeSchedule = new JButton("Remove Doctor Schedule");
	
	public DoctorViewGUI(MainWindow mainwindow) {
		this.mainwindow = mainwindow;
		this.docView = this.mainwindow.getDoctorWindow();
		setSize(700, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		JLabel mainlabel = new JLabel("<HTML><center>Welcome to the Administrator View" + "<BR>Choose an action from the buttons below.</center></HTML>");
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
		//Specs
		editInfo.setBounds(100, 300, 200, 50);
		editInfo.setFocusable(false);
		editInfo.addActionListener(this);
		
		addSchedule.setBounds(100, 400, 200, 50);
		addSchedule.setFocusable(false);
		addSchedule.addActionListener(this);
		
		removeSchedule.setBounds(400, 400, 200, 50);
		removeSchedule.setFocusable(false);
		removeSchedule.addActionListener(this);
		
		//add
		this.add(editInfo);
		this.add(addSchedule);
		this.add(removeSchedule);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==editInfo) {
			//System.out.println("clicked");
			editDocInfo();
		}
		else if (e.getSource()==addSchedule) {
			//System.out.println("clicked");
			addNewSchedule();
		}
		else if (e.getSource()==removeSchedule) {
			//System.out.println("clicked");
			removeSchedule();
		}
	}
	
	public void editDocInfo() {
		JTextField field1 = new JTextField();
		JTextArea field2 = new JTextArea(5, 20);
		String value1;
		String value2;
		Object[] message = {
			    "Doctor Name:", field1,
			    "Doctor Info:", field2,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Edit Doctor Information", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = docView.editDoctorInfo(value1, value2);
				//System.out.println(result);
				if (result.contains("Not")) {
					JOptionPane.showMessageDialog(null,result,"Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
				}
		    }
		}
	}
	
	public void addNewSchedule() {
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		String value1;
		String value2;
		String value3;
		String value4;
		Object[] message = {
			    "Doctor Name:", field1,
			    "Day of the week:", field2,
			    "Beginning Time:", field3,
			    "Ending Time:", field4,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Edit Doctor Schedule", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
	    value3 = field3.getText();
	    value4 = field4.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")||value3.equals("")||value4.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
		    	if(Integer.parseInt(value3)<0||Integer.parseInt(value4)<0||Integer.parseInt(value3)>24||Integer.parseInt(value4)>24) {
		    		JOptionPane.showMessageDialog(null,"Incorrect Time","Error", JOptionPane.ERROR_MESSAGE);
		    	}
		    	//System.out.println(value2);
				//System.out.println(result);
				else {
					String result = docView.addDoctorSchedule(value1, value2, value3, value4);
					if (result.contains("Not")||result.contains("Incorrect")) {
						JOptionPane.showMessageDialog(null,result,"Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
					}
				}
		    }
		}
	}
	
	public void removeSchedule() {
		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		String value1;
		String value2;
		String value3;
		String value4;
		Object[] message = {
			    "Doctor Name:", field1,
			    "Day of the week:", field2,
			    "Beginning Time:", field3,
			    "Ending Time:", field4,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Edit Doctor Schedule", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
	    value3 = field3.getText();
	    value4 = field4.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")||value3.equals("")||value4.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
		    	if(Integer.parseInt(value3)<0||Integer.parseInt(value4)<0||Integer.parseInt(value3)>24||Integer.parseInt(value4)>24) {
		    		JOptionPane.showMessageDialog(null,"Incorrect Time","Error", JOptionPane.ERROR_MESSAGE);
		    	}
		    	//System.out.println(value2);
				//System.out.println(result);
				else {
					String result = docView.removeDoctorSchedule(value1, value2, value3, value4);
					if (result.contains("Not")||result.contains("Incorrect")) {
						JOptionPane.showMessageDialog(null,result,"Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
					}
				}
		    }
		}
	}
	
	public boolean checkDepartment(String name) {
		for(int i=0; i<mainwindow.getUserWindow().getDepartList().getDepartments().size();i++) {
			if (mainwindow.getUserWindow().getDepartList().getDepartments().get(i).getDepartName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
