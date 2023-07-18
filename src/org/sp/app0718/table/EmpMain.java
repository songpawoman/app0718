package org.sp.app0718.table;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class EmpMain extends JFrame implements TableModelListener{
	JTable table;
	JScrollPane scroll;
	Emp2Model model;
	
	public EmpMain() {
		table =new JTable(model=new Emp2Model());
		//table = new JTable(10,5);
		scroll = new JScrollPane(table);
		
		add(scroll);
		
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				int col=table.getSelectedColumn();
				
				String value=(String)table.getValueAt(row, col);
				System.out.println(row+","+col+"의 값은 "+value);
				
			}
		});
		
		table.getModel().addTableModelListener(table);
		table.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				//System.out.println("입력 완료했어!");
				//오라클에 반영하기 update~
				 //중재자(tablemodel).emp2DAO.update();
				model.emp2DAO.update();
			}
		});
	}
	
	
	public static void main(String[] args) {
		new EmpMain();
	}


	@Override
	public void tableChanged(TableModelEvent e) {
		System.out.println("바꼈어!");
	}
	

}



