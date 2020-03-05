package com.epam.task.adapter;

import com.epam.task7.PilotPen;

public class School {
	public static void main(String args[]){
	Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Iam little bit  tired to write an assignment");
	}
}
