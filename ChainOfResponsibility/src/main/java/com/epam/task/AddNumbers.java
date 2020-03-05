package com.epam.task;

public class AddNumbers implements Chain {
	private Chain nextInChain;
 	public void setnextChain(Chain nextChain) {
 		this.nextInChain=nextChain;
	}

	public void calculates(Numbers request) {
		if(request.getcalWant() == "add"){
			System.out.println(request.getnumber1()+ "+" +request.getnumber2()+ "=" +(request.getnumber1()+request.getnumber2()));
		}
		else{
			nextInChain.calculates(request);
		}
	}

}
