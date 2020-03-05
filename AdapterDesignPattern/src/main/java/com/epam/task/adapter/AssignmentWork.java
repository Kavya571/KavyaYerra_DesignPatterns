package com.epam.task.adapter;

public class AssignmentWork {
	private Pen p;
		
	public Pen getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Pen p) {
		this.p = p;
	}
		public void writeAssignment(String str){
			
		p.write(str);
	}
}
