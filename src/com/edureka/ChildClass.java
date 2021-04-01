package com.edureka;

class ChildClass extends BaseClass {

	public static void main(String[] args) {

		ChildClass cs = new ChildClass();
		cs.div();
		cs.add();
		cs.sub();
		cs.mul();
 
		BaseClass bs = new BaseClass();
		bs.add();
    	bs.sub();

	}

	public void mul() {
		System.out.println("I am in childclass and multiplication is 2500");
	}

	public void div() {
		System.out.println("I am in childclass and division is 50");

	}

}
