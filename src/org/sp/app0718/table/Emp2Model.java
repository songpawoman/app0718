package org.sp.app0718.table;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class Emp2Model extends AbstractTableModel{
	Emp2DAO emp2DAO;
	List<Emp2DTO> list;
	String[] column= {
		"empno","ename","job","mgr","hiredate","sal","comm","deptno"
	};
	public Emp2Model() {
		emp2DAO = new Emp2DAO();
		list=emp2DAO.selectAll();
			
		/*
		for(int i=0;i<list.size();i++){
			Emp2DTO dto=list.get(i);
			System.out.println(dto.getEname());
		}
		*/
	}
	
	//JTable 에게 출력할 행의 수를 알려준다
	public int getRowCount() {
		return list.size();//14
	}
	
	//JTable 에게 출력할 열의 수를 알려준다 
	public int getColumnCount() {
		return 8;
	}
	
	public String getColumnName(int col) {
		return column[col];
	}
	
	//JTable에게 각 좌표의 셀마다 들어갈 데이터를 알려준다
	public Object getValueAt(int row, int col) {
		//List는 이차원 배열이 아닌 일차원 구조이므로, 알아서 처리...
		
		Emp2DTO dto=list.get(row);

		String value=null;
		switch(col){
			case 0: value=Integer.toString(dto.getEmpno());break;
			case 1: value=dto.getEname();break;
			case 2: value=dto.getJob();break;
			case 3: value=Integer.toString(dto.getMgr());break;
			case 4: value=dto.getHiredate();break;
			case 5: value=Integer.toString(dto.getSal());break;
			case 6: value=Integer.toString(dto.getComm());break;
			case 7: value=Integer.toString(dto.getDeptno());break;
		}
		return value;
	}

}





