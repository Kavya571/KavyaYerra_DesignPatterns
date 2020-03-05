package com.epam.task;

public class Shop {

	public static void main(String a []){
		Phone p = new PhoneBuilder().setOS("Android").setRam(2).setBattery(3100).getPhone();
		System.out.println(p);
	}
}
