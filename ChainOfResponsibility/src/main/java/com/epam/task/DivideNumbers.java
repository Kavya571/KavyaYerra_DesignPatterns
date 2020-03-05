package com.epam.task;

public class DivideNumbers implements Chain {
	private Chain nextInChain;
 	public void setnextChain(Chain nextChain) {
 		this.nextInChain=nextChain;
	}

	public void calculates(Numbers request) {
		if(request.getcalWant() == "div"){
			System.out.println(request.getnumber1()+ "/" +request.getnumber2()+ "=" +(request.getnumber1()/request.getnumber2()));
		}
		else{
			System.out.println("Only works for add,sub,mult,div");
		}
	}

}
