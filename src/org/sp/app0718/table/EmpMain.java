package org.sp.app0718.table;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EmpMain extends JFrame{
	JTable table;
	JScrollPane scroll;
	Emp2Model model;
	
	public EmpMain() {
		table =new JTable(model=new Emp2Model());
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new EmpMain();
	}
}



