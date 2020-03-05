package com.epam.task;

public class Numbers {
	private int n1,n2;
	private String calculationWanted;
	public Numbers(int num1,int num2,String calWant){
		n1 = num1;
		n2 = num2;
		calculationWanted=calWant;
	}
	public int getnumber1(){
		return n1;
	}
	public int getnumber2(){
		return n2;
	}
	public String getcalWant(){
		return calculationWanted;
	}
}
