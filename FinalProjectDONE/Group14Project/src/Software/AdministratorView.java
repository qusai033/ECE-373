package Software;

import java.awt.Dimension;
import java.awt.FlowLayout;
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
import MainFrame.MainWindow;

public class AdministratorView extends JFrame implements ActionListener{
	
	MainWindow mainwindow;
	Admin administrator;
	JButton addDepartment = new JButton("Add New Department");
	JButton addDoctor = new JButton("Add New Doctor");
	JButton addTreatment = new JButton("Add New Treatment");
	JButton removeDepartment = new JButton("Remove a Department");
	JButton removeDoctor = new JButton("Remove a Doctor");
	JButton removeTreatment = new JButton("Remove a treatment");
	
	public AdministratorView(MainWindow mainwindow) {
		this.mainwindow = mainwindow;
		this.administrator = this.mainwindow.getAdminWindow();
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
		addDepartment.setBounds(100, 100, 200, 50);
		addDepartment.setFocusable(false);
		addDepartment.addActionListener(this);
		
		removeDepartment.setBounds(400, 100, 200, 50);
		removeDepartment.setFocusable(false);
		removeDepartment.addActionListener(this);
		
		addDoctor.setBounds(100, 200, 200, 50);
		addDoctor.setFocusable(false);
		addDoctor.addActionListener(this);
		
		removeDoctor.setBounds(400, 200, 200, 50);
		removeDoctor.setFocusable(false);
		removeDoctor.addActionListener(this);
		
		addTreatment.setBounds(100, 300, 200, 50);
		addTreatment.setFocusable(false);
		addTreatment.addActionListener(this);
		
		removeTreatment.setBounds(400, 300, 200, 50);
		removeTreatment.setFocusable(false);
		removeTreatment.addActionListener(this);
		
		//add
		this.add(addDepartment);
		this.add(removeDepartment);
		this.add(addDoctor);
		this.add(removeDoctor);
		this.add(addTreatment);
		this.add(removeTreatment);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addDepartment) {
			//System.out.println("clicked");
			addDepart();
		}
		else if (e.getSource()==removeDepartment) {
			//System.out.println("clicked");
			removeDepart();
		}
		else if (e.getSource()==addDoctor) {
			//System.out.println("clicked");
			addDoctor();
		}
		else if (e.getSource()==removeDoctor) {
			//System.out.println("clicked");
			removeDoc();
		}
		else if (e.getSource()==addTreatment) {
			//System.out.println("clicked");
			addTreatment();
		}
		else if (e.getSource()==removeTreatment) {
			//System.out.println("clicked");
			removeTreat();
		}
	}
	
	public void addDepart() {
		JTextField field1 = new JTextField();
		JTextArea field2 = new JTextArea(5, 20);
		String value1;
		String value2;
		Object[] message = {
			    "Department Name:", field1,
			    "Department Detail:", field2,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Add New Department", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = administrator.addDepartment(value1, value2);
				//System.out.println(result);
				if (result.contains("existed")) {
					JOptionPane.showMessageDialog(null,result,"Error: Repeated Department", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
				}
		    }
		}
	}
	
	public void addDoctor() {
		JTextField field1 = new JTextField();
		JTextArea field2 = new JTextArea(5, 20);
		JTextField field3 = new JTextField();
		String value1;
		String value2;
		String value3;
		Object[] message = {
			    "Doctor Name:", field1,
			    "Doctor Detail:", field2,
			    "Department:", field3,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Add New Department", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
	    value3 = field3.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")||value3.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
		    	boolean check = checkDepartment(value3);
				String result = administrator.addDoctors(value1, value2, value3);
				if(check == false) {
					JOptionPane.showMessageDialog(null,"Department doesn't exist","Error: Department not found", JOptionPane.ERROR_MESSAGE);
				}
				else {
					if (result.contains("existed")) {
						JOptionPane.showMessageDialog(null,result,"Error: Repeated Department", JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
					}
				}
		    }
		}
	}
	
	public void addTreatment() {
		JTextField field1 = new JTextField();
		JTextArea field2 = new JTextArea(5, 20);
		String value1;
		String value2;
		Object[] message = {
			    "Treatment name:", field1,
			    "Treatment method:", field2,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Add New Treatment", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
	    value2 = field2.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")||value2.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Some Field is Empty. Please Enter Everything.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = administrator.addTreatment(value1, value2);
				//System.out.println(result);
				if (result.contains("repeated")) {
					JOptionPane.showMessageDialog(null,result,"Error: Repeated Treatnment", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,result,"Success", JOptionPane.PLAIN_MESSAGE);
				}
		    }
		}
	}
	
	public void removeDepart() {
		JTextField field1 = new JTextField();
		String value1;
		Object[] message = {
			    "Department to remove:", field1,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Remove Treatment", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Field is Empty. Please Enter Something.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = administrator.removeDepartment(value1);;
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
	
	public void removeDoc() {
		JTextField field1 = new JTextField();
		String value1;
		Object[] message = {
			    "Doctor to remove:", field1,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Remove Doctor", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Field is Empty. Please Enter Something.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = administrator.removeDoctor(value1);;
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
	
	public void removeTreat() {
		JTextField field1 = new JTextField();
		String value1;
		Object[] message = {
			    "Treatment to remove:", field1,
		};
		int option = JOptionPane.showConfirmDialog(null, message,"Remove Treatment", JOptionPane.OK_CANCEL_OPTION);
		value1 = field1.getText();
		if (option == JOptionPane.OK_OPTION) {
		    if (value1.equals("")) {
		    	JOptionPane.showMessageDialog(null, "Field is Empty. Please Enter Something.","Error", JOptionPane.ERROR_MESSAGE);
		    }
		    else {
				String result = administrator.removeTreatment(value1);;
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
	
	public boolean checkDepartment(String name) {
		for(int i=0; i<mainwindow.getUserWindow().getDepartList().getDepartments().size();i++) {
			if (mainwindow.getUserWindow().getDepartList().getDepartments().get(i).getDepartName().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
