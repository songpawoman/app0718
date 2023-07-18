package org.sp.app0718.table;

import javax.swing.table.AbstractTableModel;

public class Emp2Model extends AbstractTableModel{
	Emp2DAO emp2DAO;
	
	public Emp2Model() {
		emp2DAO = new Emp2DAO();
		emp2DAO.selectAll();
	}
	
	//JTable 에게 출력할 행의 수를 알려준다
	public int getRowCount() {
		return 5;
	}
	
	//JTable 에게 출력할 열의 수를 알려준다 
	public int getColumnCount() {
		return 3;
	}
	
	//JTable에게 각 좌표의 셀마다 들어갈 데이터를 알려준다
	public Object getValueAt(int row, int col) {
		return "zino";
	}

}
