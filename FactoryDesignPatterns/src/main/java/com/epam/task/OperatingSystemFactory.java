package com.epam.task;

import com.epam.task.Android;
import com.epam.task.IOS;
import com.epam.task.OS;
import com.epam.task.Windows;

public class OperatingSystemFactory {
	public OS getInstance(String str){
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else
			return new Windows();
	}
}
