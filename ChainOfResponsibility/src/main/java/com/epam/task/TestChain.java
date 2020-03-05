package com.epam.task;

public class TestChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
	//	chainCalc1.calculates(request);
		
		  chainCalc1.setnextChain(chainCalc2);
        chainCalc2.setnextChain(chainCalc3);
		          chainCalc3.setnextChain(chainCalc4);
		          Numbers request = new Numbers(4,2,"add");
		          chainCalc1.calculates(request);
		           

	}

}
